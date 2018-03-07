/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.RssFeed;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author lenovo
 */
public class RssFeedCellRenderer1 implements TableCellRenderer{
  RssFeedCellComponent feedComponent;

  public RssFeedCellRenderer1() {
      /* RssReedcellComponent in this case is a constructor but with a diffrent
      structure because this constructor will give the feedComponent a new 
      button and a new lable and both of them will be added to the jpanel */
    feedComponent = new RssFeedCellComponent();
  }


  @Override
  public Component getTableCellRendererComponent(JTable table, Object value,
      boolean isSelected, boolean hasFocus, int row, int column) {
    RssFeed feed = (RssFeed)value;

    feedComponent.updateData(feed, isSelected, table);
    return feedComponent;
  }

    
}
