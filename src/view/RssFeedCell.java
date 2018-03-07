/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.RssFeed;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author lenovo
 */
public class RssFeedCell extends AbstractCellEditor implements TableCellEditor, TableCellRenderer{
  JPanel panel;
  JLabel text;
  JButton showButton;

  RssFeed feed;

  public RssFeedCell() {
    text = new JLabel();
    showButton = new JButton("View Articles");
    showButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        JOptionPane.showMessageDialog(null, "Reading " + feed.getName());
      }
    });

    panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    panel.add(text);
    panel.add(showButton);
  }

  private void updateData(RssFeed feed, boolean isSelected, JTable table) {
    this.feed = feed;

    text.setText("" + feed.getName() + "" + feed.getUrl() + "Articles " + feed.getArticles().length + "");

    if (isSelected) {
      panel.setBackground(table.getSelectionBackground());
    }else{
      panel.setBackground(table.getBackground());
    }
  }

  @Override
  public Component getTableCellEditorComponent(JTable table, Object value,
      boolean isSelected, int row, int column) {
    RssFeed feed = (RssFeed)value;
    updateData(feed, true, table);
    return panel;
  }

    @Override
    public Object getCellEditorValue() {
        return null;
    }

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
  
}
