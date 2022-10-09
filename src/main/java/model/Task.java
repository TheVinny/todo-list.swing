package model;

import java.util.Date;
import java.util.UUID;

public class Task {
  private String id = UUID.randomUUID().toString();
  private String project_id;
  private String name;
  private String notes;
  private String description;
  private boolean isCompleted;
  private Date deadline;
  private Date createdAt;
  private Date updatedAt;

    public Task(String id, String project_id, String name, String notes, String description, boolean isCompleted, Date deadline, Date createdAt, Date updatedAt) {
        this.project_id = project_id;
        this.name = name;
        this.notes = notes;
        this.description = description;
        this.isCompleted = isCompleted;
        this.deadline = deadline;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public Task(){
      this.createdAt = new Date();
      this.updatedAt = new Date();
      
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", project_id=" + project_id + ", name=" + name + ", notes=" + notes + ", description=" + description + ", isCompleted=" + isCompleted + ", deadline=" + deadline + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }
  
}
