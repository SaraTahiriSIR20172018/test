/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.RssFeed;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author lenovo
 */
public class RssFeedCellComponent extends JPanel {
  RssFeed feed;

  JButton showButton;
  JLabel text;

  public RssFeedCellComponent() {
    showButton = new JButton("View Articles");
    showButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        JOptionPane.showMessageDialog(null, "Reading " + feed.getName());
      }
    });

    text = new JLabel();
    add(text);
    add(showButton);
  }

  public void updateData(RssFeed feed, boolean isSelected, JTable table) {
    this.feed = feed;

    text.setText("" + feed.getName() + "" + feed.getUrl() + "Articles " + feed.getArticles().length + "");
    if (isSelected) {
      setBackground(table.getSelectionBackground());
    }else{
      setBackground(table.getBackground());
    }
  }
}
