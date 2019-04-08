package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CorrectUser
{
    //public static void main(String[] args) throws ClassNotFoundException
    
        private static String url = "jdbc:mysql://localhost:3306/testautomation?useSSL=false&serverTimezone=UTC";
        private static String user = "root";
        private static String password = "roma2722037";

        private static String query = "SELECT * FROM testautomation.correct_users;";
        //Class.forName("com.mysql.cj.jdbc.Driver");
         
         public String getLogin() {
        try (Connection con = DriverManager.getConnection(url, user, password);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query))
        {
            if(rs.next())
            {
                String login = rs.getString("login");
                return login;
            }
            rs.close();
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();

        }
        return "";
    }

         public String getPassword() {
             try (Connection con = DriverManager.getConnection(url, user, password);
                     Statement st = con.createStatement();
                     ResultSet rs = st.executeQuery(query))
             {
                 if(rs.next())
                 {
                     String password = rs.getString("password");
                     return password;
                 }
                 rs.close();
             }
             catch (SQLException ex)
             {
                 ex.printStackTrace();

             }
             return "";
         }               
               
}
