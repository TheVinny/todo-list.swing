
package mytodo;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;
import model.TaskTableModel;

public class DeadlineCellRender extends DefaultTableCellRenderer {
  @Override
  public Component getTableCellRendererComponent(JTable table, Object value,
    boolean isSelected, boolean hasFocus, int row, int column) {
        
       JLabel label = (JLabel) super.getTableCellRendererComponent(table,
               value, isSelected, hasFocus, row, column);
       label.setHorizontalAlignment(CENTER);
        
       TaskTableModel taskModel = (TaskTableModel) table.getModel();
       Task task = taskModel.getTask().get(row);
       
       if (task.getDeadline().after(new Date())) {
         label.setBackground(Color.green);
       } 
       else {
         label.setBackground(Color.red);
       }
       
       label.setForeground(Color.white);
       
       return label;
    }
    
}
