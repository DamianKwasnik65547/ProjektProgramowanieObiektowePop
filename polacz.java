import java.sql.*;

public class polacz {
    private  static  Connection connection;
    public  static  Connection polaczBaze(){
        if(connection==null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost/biblioteka";
                String username = "root";
                String password = "";
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
