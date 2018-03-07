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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author sara lola tahiri
 */
public class RssFeedCellRenderer implements TableCellRenderer{
    
  @Override
  public Component getTableCellRendererComponent(JTable table, Object value,
        boolean isSelected, boolean hasFocus, int row, int column) 
    {           // what is this declaration ??
                     RssFeed feed = (RssFeed)value;
    // creating a jbutton 
    JButton showButton = new JButton("View Articles");
    // add an action to the jbotton 
    // actionListener is a methode but i'm not sure about the its structure yet 
    showButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        JOptionPane.showMessageDialog(null, "HA-HA!");
      }
    });
     // the idea is  to create a jpanel give it all th data and then add the button  
    // each panel will have the same structure 
    //Flow layouts are typically used to arrange buttons in a panel.
    JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    panel.add(new JLabel("" + feed.getName() + ""
            + feed.getUrl() + " Articles :" + feed.getArticles().length + ""));
    panel.add(showButton);

    if (isSelected) {
        //Returns the background color for selected cells.
      panel.setBackground(table.getSelectionBackground());
    }else{
        //Gets the background color of this component
      panel.setBackground(table.getBackground());
    }
    //the panel is considered as a Component.
    return panel;
  }

   
}
