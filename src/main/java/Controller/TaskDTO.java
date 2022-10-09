package Controller;

import Database.DbConnect;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Task;

public class TaskDTO {
  public void Save(Task task){
    Connection conn = null;
    PreparedStatement statem = null;
    String query = 
      "Insert into tasks "+
      "(id, project_id, name, description, notes, isCompleted, deadline, createdAt, updatedAt) "+
      "values (?,?,?,?,?,?,?,?,?)";
    
      try {
        conn = DbConnect.getConnection();
        statem = conn.prepareStatement(query);
        statem.setString(1, task.getId());
        statem.setString(2, task.getProject_id());
        statem.setString(3, task.getName());
        statem.setString(4, task.getDescription());
        statem.setString(5, task.getNotes());
        statem.setBoolean(6, task.isCompleted());
        statem.setDate(7, new Date(task.getDeadline().getTime()));
        statem.setDate(8, new Date(task.getCreatedAt().getTime()));
        statem.setDate(9, new Date(task.getUpdatedAt().getTime()));
        statem.execute();
      } catch (SQLException e) {
          throw new RuntimeException("Error ao salvar task: " + e.getMessage(), e);
      } finally {
        DbConnect.closeConnection(conn, statem);
      }
    
  } 
  
  public void Update(Task task){
   Connection conn = null;
   PreparedStatement statem = null;
   String query = "UPDATE tasks SET " +
                  "project_id = ?," +
                  "name = ?," +
                  "description = ?," +
                  "notes = ?," +
                  "isCompleted = ?," +
                  "deadline = ?," +
                  "createdAt = ?," +
                  "updatedAt = ? " +
                  "WHERE id = ?";
      try {
        conn = DbConnect.getConnection();
        statem = conn.prepareStatement(query);
        statem.setString(1, task.getProject_id());
        statem.setString(2, task.getName());
        statem.setString(3, task.getDescription());
        statem.setString(4, task.getNotes());
        statem.setBoolean(5, task.isCompleted());
        statem.setDate(6, new Date(task.getDeadline().getTime()));
        statem.setDate(7, new Date(task.getCreatedAt().getTime()));
        statem.setDate(8, new Date(task.getUpdatedAt().getTime()));
        statem.setString(9, task.getId());
        statem.execute();
      } catch (SQLException e) {
        throw new RuntimeException("Error ao atualizar a task" + e.getMessage(), e);
      } finally{
        DbConnect.closeConnection(conn,statem);
      }
   
  }
  
  public void DeleteById(String taskid){
    String query = "DELETE from tasks WHERE id = ?";
    Connection conn = null;
    PreparedStatement statem = null;
    
      try {
        conn = DbConnect.getConnection();
        statem = conn.prepareStatement(query);
        statem.setString(1, taskid);
        statem.execute();
      } catch (SQLException e) {
        throw new RuntimeException(e);
      } finally {
        DbConnect.closeConnection(conn, statem);
      }
    
  }
  
  public List<Task> getAll(String project_id){
    Connection conn = null;
    PreparedStatement statem = null;
    ResultSet rset = null;
    List<Task> tasks = new ArrayList<Task>();
    String query = "SELECT * FROM tasks WHERE project_id = ?";
      try {
        conn = DbConnect.getConnection();
        statem = conn.prepareStatement(query);
        statem.setString(1, project_id);
        rset = statem.executeQuery();
          while (rset.next()) {              
            Task task = new Task();
            
            task.setId(rset.getString("id"));
            task.setProject_id(rset.getString("project_id"));
            task.setName(rset.getString("name"));
            task.setDescription(rset.getString("description"));
            task.setNotes(rset.getString("notes"));
            task.setIsCompleted(rset.getBoolean("isCompleted"));
            task.setDeadline(rset.getDate("deadline"));
            task.setCreatedAt(rset.getDate("createdAt"));
            task.setUpdatedAt(rset.getDate("updatedAt"));
            
            tasks.add(task);      
          }
        
      } catch(SQLException e) {
          throw new RuntimeException("Erro ao listar tasks" + e.getMessage(), e);
      } finally{
        DbConnect.closeConnection(conn, statem, rset);
      }
    return tasks;
  }
  
}
