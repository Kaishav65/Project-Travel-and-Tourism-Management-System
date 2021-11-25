package travel.management.system;
import com.mysql.jdbc.Driver;

import java.sql.*;
public class Conn
{
    Connection c;            // connection class
    Statement s;             // statement class

//    constructor
    public Conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // 1.mention mysql Drivers
//            2.creating connective string
           c = DriverManager.getConnection("jdbc:mysql:///tms","root","0000");
           // localhost:3306
           s = c.createStatement();          //  3.create statement

        } catch (Exception ignored){
            System.out.println(" something is wrong");
            System.out.println(ignored);
        }
    }

    public static void main(String[] args) {

    }

}
