import java.sql.*;
public class DBConnect {
    public static void main(String[] args) {
        try {
            String host = "jdbc:mysql://localhost:3306/employees";
            String user_name = "root";
            String password = "********";
            Connection con = DriverManager.getConnection(host, user_name, password);

            Statement stat = con.createStatement();
            String sql = "select * from emp";
            ResultSet rs = stat.executeQuery(sql);

            while(rs.next()) {
                int id_col = rs.getInt("ID");
                String First_name = rs.getString("First_name");
                String Last_name = rs.getString("Last_name");
                String Job_Title = rs.getString("Job_Title");

                String p = id_col + " " + First_name + " " + Last_name + " " + Job_Title;
                System.out.println(p);
            }
        } catch(SQLException err){
            System.out.println(err.getMessage());
        }

    }
}
