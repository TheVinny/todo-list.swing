package Controller;

import Database.DbConnect;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Project;

public class ProjectDTO {
  public void Save(Project project) {
    Connection conn = null;
    PreparedStatement statem = null;
    String query = "Insert into projects "+
                   "(id, name, description, createdAt,updatedAt) "+
                   "VALUES (?,?,?,?,?)";
      try {
        conn = DbConnect.getConnection();
        statem = conn.prepareStatement(query);
        statem.setString(1, project.getId());
        statem.setString(2, project.getName());
        statem.setString(3, project.getDescription());
        statem.setDate(4, new Date(project.getCreatedAt().getTime()));
        statem.setDate(5, new Date(project.getUpdatedAt().getTime()));
        statem.execute();
      } catch (Exception e) {
          throw new RuntimeException("Erro ao salvar um projeto:", e);
      } finally {
          DbConnect.closeConnection(conn, statem);
      }
  }
  
  public void Update(Project project) {
    Connection conn = null;
    PreparedStatement statem = null;
    String query = "UPDATE projects SET " +
                  "name = ?," +
                  "description = ?," +
                  "createdAt = ?," +
                  "updatedAt = ? " +
                  "WHERE id = ?";
      try 
      {
        conn = DbConnect.getConnection();
        statem = conn.prepareStatement(query);
        statem.setString(1, project.getName());
        statem.setString(2, project.getDescription());
        statem.setDate(3, new Date(project.getCreatedAt().getTime()));
        statem.setDate(4, new Date(project.getUpdatedAt().getTime()));
        statem.setString(5, project.getId());
        statem.execute();       
      } catch (SQLException e){
          throw new RuntimeException("Erro ao atualizar o projeto" + e.getMessage(), e);
      } finally {
          DbConnect.closeConnection(conn, statem);
      }
  }
  
  public void deleteById(String projectid) {
      Connection conn = null;
      PreparedStatement statem = null;
      String query = "DELETE FROM projects WHERE id = ?";
      try {
        conn = DbConnect.getConnection();
        statem = conn.prepareStatement(query);
        statem.setString(1, projectid);
        statem.execute();
      } catch (SQLException e) {
        throw new RuntimeException("Erro ao deletar projeto" + e.getMessage(),e);
      } finally {
        DbConnect.closeConnection(conn, statem);
      }
  } 
  
  public List<Project> getAll() {
    Connection conn = null;
    PreparedStatement statem = null;
    ResultSet rset = null;
    List<Project> projects = new ArrayList<Project>();
    
    String query = "SELECT * FROM projects";
    
      try {
        conn = DbConnect.getConnection();
        statem = conn.prepareStatement(query);
        rset = statem.executeQuery();
        
          while (rset.next()) {              
            Project project = new Project();
            
            project.setId(rset.getString("id"));
            project.setName(rset.getString("name"));
            project.setDescription(rset.getString("description"));
            project.setCreatedAt(rset.getDate("createdAt"));
            project.setUpdatedAt(rset.getDate("updatedAt"));
            
            projects.add(project);
            
          }
        
      } catch (SQLException e) {
        throw new RuntimeException("Erro ao listar projetos" + e.getMessage(), e);
      }
    
    return projects;
  }
}
