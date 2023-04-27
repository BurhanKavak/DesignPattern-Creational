package main.java.org.example;

import javax.net.ssl.SSLException;
import java.sql.*;


public class CrudOperations {

    private static CrudOperations crudOperations;

    private CrudOperations() {

    }

    public static CrudOperations getInstance() {
        if (crudOperations == null) {
            crudOperations = new CrudOperations();
        }
        return crudOperations;
    }

    DbConnection dbConnection = new DbConnection();
    ResultSet resultSet;
    Connection connection;
    Statement statement;

    public String insert(int id, String name) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = dbConnection.getConnection();
            statement = connection.createStatement();
            String query = "INSERT INTO student(id, name) VALUES (" + id + ", '" + name + "')";

             statement.executeUpdate(query);

            return "Başarıyla eklendi";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (resultSet != null)
                resultSet.close();
            if (statement != null)
                statement.close();
            if (connection != null)
                connection.close();
        }
    }

    public void view() throws SQLException {
        try {
            connection = dbConnection.getConnection();
            statement = connection.createStatement();
            String query = "SELECT * FROM student";
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (resultSet != null)
                resultSet.close();
            if (statement != null)
                statement.close();
            if (connection != null)
                connection.close();
        }
    }

    public String update(int id) throws SQLException {
        try {
            connection = dbConnection.getConnection();
            statement = connection.createStatement();
            String query = "UPDATE student SET name = 'Buse' where id ="+id;
            statement.executeUpdate(query);
            return "Başarıyla güncellendi";

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (resultSet != null)
                resultSet.close();
            if (statement != null)
                statement.close();
            if (connection != null)
                connection.close();
        }
    }


    public String delete(int id) throws SQLException {
        try {
            connection = dbConnection.getConnection();
            statement = connection.createStatement();
            String query = "DELETE FROM student where id ="+id;
            statement.executeUpdate(query);
            return "Başarıyla silindi";

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (resultSet != null)
                resultSet.close();
            if (statement != null)
                statement.close();
            if (connection != null)
                connection.close();
        }
    }


}
