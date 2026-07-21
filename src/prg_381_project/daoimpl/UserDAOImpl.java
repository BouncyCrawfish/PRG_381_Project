package prg_381_project.daoimpl;

import prg_381_project.connection.DBConnection;
import prg_381_project.dao.UserDAO;
import prg_381_project.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    private final Connection connection;

    public UserDAOImpl() {
        connection = DBConnection.getConnection();
    }

    @Override
    public boolean addUser(User user) {
        String sql = "INSERT INTO users(username,password,email,role) VALUES(?,?,?,?)";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getRole());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error adding user: " + e.getMessage());
            e.printStackTrace();

        }

        return false;
    }

    @Override
    public User getUserByUsername(String username) {

        String sql = "SELECT * FROM users WHERE username=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                return new User(
                        rs.getInt("user_id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("email"),
                        rs.getString("role")
                );
            }

        } catch (SQLException e) {
                System.out.println("Error finding user: " + e.getMessage());
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<User> getAllUsers() {

        List<User> users = new ArrayList<>();

        String sql = "SELECT * FROM users";

        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {

                users.add(new User(
                        rs.getInt("user_id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("email"),
                        rs.getString("role")
                ));
            }

        } catch (SQLException e) {
                System.out.println("Error getting users: " + e.getMessage());
            e.printStackTrace();
        }

        return users;
    }

    @Override
    public boolean updateUser(User user) {

        String sql = "UPDATE users SET username=?, password=?, email=?, role=? WHERE user_id=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getRole());
            ps.setInt(5, user.getUserId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
                System.out.println("Error updating user: " + e.getMessage());
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean deleteUser(int userId) {

        String sql = "DELETE FROM users WHERE user_id=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, userId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
                System.out.println("Error deleting user: " + e.getMessage());
            e.printStackTrace();        }

        return false;
    }
}
