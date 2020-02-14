package sample;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class BD {
    public static Connection ConnectDB(){
       Connection conn = null;
        try{
            String url1 = "jdbc:mysql://localhost/gestion";
            String user = "root";
            String password = "secret";

            conn = DriverManager.getConnection(url1, user, password);
            JOptionPane.showMessageDialog(null,"connected to database");
            return conn ;

        }catch
        (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null ;
        }

    }
    }

