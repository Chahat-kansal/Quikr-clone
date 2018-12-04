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
public class SignupDAO {
    
    public boolean Signup(String fn, String ln, String db, String pn, String uname, String password)
    {
        String url="jdbc:mysql://localhost:3306/quikr?useSSL=false";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,"root","CSkansal0609");
            PreparedStatement pstmt=con.prepareStatement("insert into qr values(?,?,?,?,?,?);");
            pstmt.setString(1,fn);
            pstmt.setString(2,ln);
            pstmt.setString(3,db);
            
            pstmt.setString(4,pn);
            pstmt.setString(5,uname);
            pstmt.setString(6,password);          
            
            pstmt.executeUpdate();
            
            return true;
            
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.err.println(e);
        }
        return false;
    }
    
}
