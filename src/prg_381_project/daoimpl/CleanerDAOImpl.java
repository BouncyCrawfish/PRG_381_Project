package prg_381_project.daoimpl;

import prg_381_project.connection.DBConnection;
import prg_381_project.dao.CleanerDAO;
import prg_381_project.model.Cleaner;
import prg_381_project.Login_Page;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CleanerDAOImpl implements CleanerDAO {

    private final Connection connection;

    public CleanerDAOImpl() {
        connection = DBConnection.getConnection();
    }

    @Override
    public boolean addCleaner(Cleaner cleaner) {

        String sql = "INSERT INTO cleaners(first_name, last_name, department) VALUES (?, ?, ?)";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, cleaner.getFirstName());
            ps.setString(2, cleaner.getLastName());
            ps.setString(3, cleaner.getDepartment());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error adding cleaner: " + e.getMessage());
        }

        return false;
    }

    @Override
    public Cleaner getCleanerById(int cleanerId) {

        String sql = "SELECT * FROM cleaners WHERE cleaner_id=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, cleanerId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                return new Cleaner(
                        rs.getInt("cleaner_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("department")
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public List<Cleaner> getAllCleaners() {

        List<Cleaner> cleaners = new ArrayList<>();

        String sql = "SELECT * FROM cleaners";

        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {

                cleaners.add(new Cleaner(
                        rs.getInt("cleaner_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("department")
                ));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return cleaners;
    }

    @Override
    public boolean updateCleaner(Cleaner cleaner) {

        String sql = "UPDATE cleaners SET first_name=?, last_name=?, department=? WHERE cleaner_id=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, cleaner.getFirstName());
            ps.setString(2, cleaner.getLastName());
            ps.setString(3, cleaner.getDepartment());
            
            Login_Page login = new Login_Page();
            ps.setInt(4, cleaner.getCleanerId(Integer.parseInt(login.idText)));

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    @Override
    public boolean deleteCleaner(int cleanerId) {

        String sql = "DELETE FROM cleaners WHERE cleaner_id=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, cleanerId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
}
