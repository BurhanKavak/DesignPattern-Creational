package main.java.org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnection {

    private String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    private String user = "root";
    private String password = "kajmer5858";
    private ResultSet resultSet;


    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }



}
