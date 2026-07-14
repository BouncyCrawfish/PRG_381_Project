package prg_381_project.dao;

import java.util.List;
import prg_381_project.model.Material;

public interface MaterialDAO {

    boolean addMaterial(Material material);

    Material getMaterialById(int materialId);

    List<Material> getAllMaterials();

    boolean updateMaterial(Material material);

    boolean deleteMaterial(int materialId);
}