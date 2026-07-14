package prg_381_project.daoimpl;

import prg_381_project.connection.DBConnection;
import prg_381_project.dao.MaterialDAO;
import prg_381_project.model.Material;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MaterialDAOImpl implements MaterialDAO {

    private final Connection connection;

    public MaterialDAOImpl() {
        connection = DBConnection.getConnection();
    }

    @Override
    public boolean addMaterial(Material material) {

        String sql = "INSERT INTO materials(name, quantity, reorder_level, supplier_id) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, material.getName());
            ps.setInt(2, material.getQuantity());
            ps.setInt(3, material.getReorderLevel());
            ps.setInt(4, material.getSupplierId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error adding material: " + e.getMessage());
        }

        return false;
    }

    @Override
    public Material getMaterialById(int materialId) {

        String sql = "SELECT * FROM materials WHERE material_id=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, materialId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                return new Material(
                        rs.getInt("material_id"),
                        rs.getString("name"),
                        rs.getInt("quantity"),
                        rs.getInt("reorder_level"),
                        rs.getInt("supplier_id")
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public List<Material> getAllMaterials() {

        List<Material> materials = new ArrayList<>();

        String sql = "SELECT * FROM materials";

        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {

                materials.add(new Material(
                        rs.getInt("material_id"),
                        rs.getString("name"),
                        rs.getInt("quantity"),
                        rs.getInt("reorder_level"),
                        rs.getInt("supplier_id")
                ));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return materials;
    }

    @Override
    public boolean updateMaterial(Material material) {

        String sql = "UPDATE materials SET name=?, quantity=?, reorder_level=?, supplier_id=? WHERE material_id=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, material.getName());
            ps.setInt(2, material.getQuantity());
            ps.setInt(3, material.getReorderLevel());
            ps.setInt(4, material.getSupplierId());
            ps.setInt(5, material.getMaterialId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    @Override
    public boolean deleteMaterial(int materialId) {

        String sql = "DELETE FROM materials WHERE material_id=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, materialId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
}
