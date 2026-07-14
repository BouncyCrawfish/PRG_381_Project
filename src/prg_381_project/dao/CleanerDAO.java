package prg_381_project.dao;

import java.util.List;
import prg_381_project.model.Cleaner;

public interface CleanerDAO {

    boolean addCleaner(Cleaner cleaner);

    Cleaner getCleanerById(int cleanerId);

    List<Cleaner> getAllCleaners();

    boolean updateCleaner(Cleaner cleaner);

    boolean deleteCleaner(int cleanerId);
}
