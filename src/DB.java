import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DB {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SchoolManagementSystem","root", "" );
            Statement statement = con.createStatement();
            String insertQuery = "INSERT INTO USER (name, username, password) VALUES ('Aashish', 'itsmeacs01', 'asdjkfhbn123!!')";
            statement.executeUpdate(insertQuery);
            String readQuery = "SELECT * FROM USER;";
            ResultSet rs = statement.executeQuery(readQuery);
            while(rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
