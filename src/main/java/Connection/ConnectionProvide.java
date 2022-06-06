package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvide {
    private static String url = "jdbc:mysql://127.0.0.1:3306/final_exam_5";
    private static String username = "root";
    private static String password = "365pass";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(url, username, password);
    }
    public static void Question1KetNoi() {
        try {
            Connection connection = ConnectionProvide.getConnection();
            System.out.println("Connect success!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
