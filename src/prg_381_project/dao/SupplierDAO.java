package prg_381_project.dao;

import java.util.List;
import prg_381_project.model.Supplier;

public interface SupplierDAO {

    boolean addSupplier(Supplier supplier);

    Supplier getSupplierById(int supplierId);

    List<Supplier> getAllSuppliers();

    boolean updateSupplier(Supplier supplier);

    boolean deleteSupplier(int supplierId);
}
