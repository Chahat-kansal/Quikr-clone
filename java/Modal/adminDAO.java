/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chahat
 */
public class adminDAO {
    
    
    String name;
    String password;
    public boolean validate(String username,String password) 
    {
        String url="jdbc:mysql://localhost:3306/quikr?useSSL=false";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,"root","CSkansal0609");
            String query="select * from qr where Username=? AND password =?";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next())
            {
                //name=rs.getString(2);
                return true;
            }
            else{
                return false;
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.err.println(e);
        }
        return false;
    }
}
