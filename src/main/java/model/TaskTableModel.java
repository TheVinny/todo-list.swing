package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.SimpleFormatter;
import javax.swing.table.AbstractTableModel;

public class TaskTableModel extends AbstractTableModel {
    String Columns[] = {"Name", "Description","Deadline","Completed", "Edit", "Delete"};
    List<Task> task = new ArrayList();
    @Override
    public int getRowCount() {
        return task.size();
    }

    @Override
    public int getColumnCount() {
       return Columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
          case 0: 
            return task.get(rowIndex).getName();
          case 1: 
            return task.get(rowIndex).getDescription();
          case 2:
              SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
              
            return dateFormat.format(task.get(rowIndex).getDeadline());
          case 3:
            return task.get(rowIndex).isCompleted();
          case 4:
            return "";
          case 5:
            return "";
          default: 
            return "dado não encontrado";
        }
    } 
    
    public boolean isCellEditable(int rowIndex, int columnIndex) {        
      return columnIndex == 3;    
    }
    
    @Override
    public Class<?>getColumnClass(int columnIndex){
         if (task.isEmpty()) return Object.class;
         return this.getValueAt(0,columnIndex).getClass();
    }
    
    @Override
     public String getColumnName(int columnIndex) {
        return Columns[columnIndex];
    }
     
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
      task.get(rowIndex).setIsCompleted((boolean) aValue);
    }
    public String[] getColumns() {
        return Columns;
    }

    public List<Task> getTask() {
        return task;
    }

    public void setTask(List<Task> task) {
        this.task = task;
    }
    
    
}
