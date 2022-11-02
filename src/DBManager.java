import java.sql.*;

public class DBManager {
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/swing_test?useSSL=false";

    private final String USER_NAME = "root";
    private final String PASSWORD = "Chan!1057";

    public DBManager() {
        Connection conn = null;
        Statement state = null;

        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("[MySQL Connection]\n");
            state = conn.createStatement();

            String query;
            query = "select * from member";
            ResultSet rs = state.executeQuery(query);

            while (rs.next()) {
                String memberId = rs.getString("member_id");
                String id = rs.getString("id");
                String password = rs.getString("password");
                System.out.println("Serial Number : " + memberId);
                System.out.println("ID : " + id);
                System.out.println("Password : " + password);
                System.out.println("-------------------------------------");
            }

            rs.close();
            state.close();
            conn.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally{
            try{
                if (state != null) {
                    state.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        new DBManager();
    }
}
