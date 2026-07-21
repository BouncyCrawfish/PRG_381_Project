package prg_381_project.connection;

public class TestConnection {
    public static void main(String[] args) {
        var conn = DBConnection.getConnection();
        if (conn != null) {
            System.out.println("✅ Connected successfully!");
        } else {
            System.out.println("❌ Connection failed — check DBConnection.java credentials.");
        }
    }
}