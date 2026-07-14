package prg_381_project.model;

import java.time.LocalDate;

public class Issuance {

    private int issuanceId;
    private int cleanerId;
    private int materialId;
    private int quantity;
    private LocalDate issueDate;

    public Issuance() {
    }

    public Issuance(int issuanceId, int cleanerId, int materialId, int quantity, LocalDate issueDate) {
        this.issuanceId = issuanceId;
        this.cleanerId = cleanerId;
        this.materialId = materialId;
        this.quantity = quantity;
        this.issueDate = issueDate;
    }

    public int getIssuanceId() {
        return issuanceId;
    }

    public void setIssuanceId(int issuanceId) {
        this.issuanceId = issuanceId;
    }

    public int getCleanerId() {
        return cleanerId;
    }

    public void setCleanerId(int cleanerId) {
        this.cleanerId = cleanerId;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }
}
