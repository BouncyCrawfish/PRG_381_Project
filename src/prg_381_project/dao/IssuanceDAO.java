package prg_381_project.dao;

import java.util.List;
import prg_381_project.model.Issuance;

public interface IssuanceDAO {

    boolean addIssuance(Issuance issuance);

    Issuance getIssuanceById(int issuanceId);

    List<Issuance> getAllIssuances();

    boolean updateIssuance(Issuance issuance);

    boolean deleteIssuance(int issuanceId);
}
