package Database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbConnect {
  public static final String DRIVER = "com.mysql.jdbc.Driver";
  public static final String URL = "jdbc:mysql://localhost:3306/todolist?characterEncoding=utf8";
  public static final String USER = "root";
  public static final String PASSWORD = "1234";
  
  public static Connection getConnection(){
    try {
      Class.forName(DRIVER);
      return DriverManager.getConnection(URL, USER, PASSWORD);
    } catch (Exception e) {
      System.out.print(e);
      throw new RuntimeException();
    }
  } 
  
  public static void closeConnection(Connection connection){
    try {
      if (connection != null) {
        connection.close();
      }
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
  }
  public static void closeConnection(Connection connection, PreparedStatement statement){
    try {
      if (connection != null) {
        connection.close();
      }
      if (statement != null){
        statement.close();
      }
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
  }
    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet rset){
    try {
      if (connection != null) {
        connection.close();
      }
      if (statement != null){
        statement.close();
      }
      if (rset != null) {
        rset.close();
      }
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
  }
}
