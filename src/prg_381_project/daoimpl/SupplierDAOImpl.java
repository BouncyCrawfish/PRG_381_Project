package prg_381_project.daoimpl;

import prg_381_project.connection.DBConnection;
import prg_381_project.dao.SupplierDAO;
import prg_381_project.model.Supplier;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SupplierDAOImpl implements SupplierDAO {

    private final Connection connection;

    public SupplierDAOImpl() {
        connection = DBConnection.getConnection();
    }

    @Override
    public boolean addSupplier(Supplier supplier) {

        String sql = "INSERT INTO suppliers(name, phone, email, address) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, supplier.getName());
            ps.setString(2, supplier.getPhone());
            ps.setString(3, supplier.getEmail());
            ps.setString(4, supplier.getAddress());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error adding supplier: " + e.getMessage());
        }

        return false;
    }

    @Override
    public Supplier getSupplierById(int supplierId) {

        String sql = "SELECT * FROM suppliers WHERE supplier_id = ?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, supplierId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                return new Supplier(
                        rs.getInt("supplier_id"),
                        rs.getString("name"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getString("address")
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public List<Supplier> getAllSuppliers() {

        List<Supplier> suppliers = new ArrayList<>();

        String sql = "SELECT * FROM suppliers";

        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {

                suppliers.add(new Supplier(
                        rs.getInt("supplier_id"),
                        rs.getString("name"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getString("address")
                ));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return suppliers;
    }

    @Override
    public boolean updateSupplier(Supplier supplier) {

        String sql = "UPDATE suppliers SET name=?, phone=?, email=?, address=? WHERE supplier_id=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, supplier.getName());
            ps.setString(2, supplier.getPhone());
            ps.setString(3, supplier.getEmail());
            ps.setString(4, supplier.getAddress());
            ps.setInt(5, supplier.getSupplierId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    @Override
    public boolean deleteSupplier(int supplierId) {

        String sql = "DELETE FROM suppliers WHERE supplier_id=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, supplierId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
}
