/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Chahat
 */
public class jConnnect {
    private jConnnect() {
        
    }
    static Connection conn;
    public static Connection connectIt(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/quikr?user=root&password=CSkansal0609&useSSL=false&verifyServerCertificate=false&allowMultiQueries=false");
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return conn;
    }
}
