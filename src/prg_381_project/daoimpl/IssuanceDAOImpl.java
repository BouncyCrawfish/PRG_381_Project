package prg_381_project.daoimpl;

import prg_381_project.connection.DBConnection;
import prg_381_project.dao.IssuanceDAO;
import prg_381_project.model.Issuance;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IssuanceDAOImpl implements IssuanceDAO {

    private final Connection connection;

    public IssuanceDAOImpl() {
        connection = DBConnection.getConnection();
    }

    @Override
    public boolean addIssuance(Issuance issuance) {

        String sql = "INSERT INTO issuances(cleaner_id, material_id, quantity, issue_date) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, issuance.getCleanerId());
            ps.setInt(2, issuance.getMaterialId());
            ps.setInt(3, issuance.getQuantity());
            ps.setDate(4, Date.valueOf(issuance.getIssueDate()));

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error adding issuance: " + e.getMessage());
        }

        return false;
    }

    @Override
    public Issuance getIssuanceById(int issuanceId) {

        String sql = "SELECT * FROM issuances WHERE issuance_id=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, issuanceId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                return new Issuance(
                        rs.getInt("issuance_id"),
                        rs.getInt("cleaner_id"),
                        rs.getInt("material_id"),
                        rs.getInt("quantity"),
                        rs.getDate("issue_date").toLocalDate()
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public List<Issuance> getAllIssuances() {

        List<Issuance> issuances = new ArrayList<>();

        String sql = "SELECT * FROM issuances";

        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {

                issuances.add(new Issuance(
                        rs.getInt("issuance_id"),
                        rs.getInt("cleaner_id"),
                        rs.getInt("material_id"),
                        rs.getInt("quantity"),
                        rs.getDate("issue_date").toLocalDate()
                ));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return issuances;
    }

    @Override
    public boolean updateIssuance(Issuance issuance) {

        String sql = "UPDATE issuances SET cleaner_id=?, material_id=?, quantity=?, issue_date=? WHERE issuance_id=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, issuance.getCleanerId());
            ps.setInt(2, issuance.getMaterialId());
            ps.setInt(3, issuance.getQuantity());
            ps.setDate(4, Date.valueOf(issuance.getIssueDate()));
            ps.setInt(5, issuance.getIssuanceId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    @Override
    public boolean deleteIssuance(int issuanceId) {

        String sql = "DELETE FROM issuances WHERE issuance_id=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, issuanceId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
}
