
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/inventaris_aset"; // URL database
    private static final String USER = "root"; // Username MySQL (ganti jika perlu)
    private static final String PASSWORD = ""; // Password MySQL (ganti jika perlu)

    public static Connection connect() {
        Connection connection = null;
        try {
            // Membuat koneksi ke database
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Koneksi ke database berhasil!");
        } catch (SQLException e) {
            // Menangkap error jika koneksi gagal
            System.err.println("Koneksi gagal: " + e.getMessage());
        }
        return connection;
    }
}
