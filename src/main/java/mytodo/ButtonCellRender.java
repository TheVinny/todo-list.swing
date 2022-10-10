
package mytodo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;
import model.TaskTableModel;
import javax.swing.ImageIcon;

public class ButtonCellRender extends DefaultTableCellRenderer {
  String buttonType;
  
   public ButtonCellRender(String buttonType) {
        this.buttonType = buttonType;
    }
    
  
  @Override
   
  public Component getTableCellRendererComponent(JTable table, Object value,
    boolean isSelected, boolean hasFocus, int row, int column) {
        
       JLabel label = (JLabel) super.getTableCellRendererComponent(table,
               value, isSelected, hasFocus, row, column);
       label.setHorizontalAlignment(JLabel.CENTER);
       
       label.setCursor(new Cursor(Cursor.HAND_CURSOR) {
       });
       
       label.setIcon(new ImageIcon(getClass()
         .getResource("/" + buttonType + ".png")
       ));
       
       
       
      return label;
    }

   
}
