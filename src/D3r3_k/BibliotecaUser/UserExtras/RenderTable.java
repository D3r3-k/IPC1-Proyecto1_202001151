package D3r3_k.BibliotecaUser.UserExtras;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableCellRenderer;

public class RenderTable extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        if (value instanceof JButton) {
            JButton btn = (JButton) value;
            return btn;
        }
        if (value instanceof JCheckBox) {
            JCheckBox cbx = (JCheckBox) value;
            return cbx;
        }
        if (value instanceof JToggleButton) {
            JToggleButton tbtn = (JToggleButton) value;
            return tbtn;
        }
        
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }

}
