/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.RssFeed;
import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author lenovo
 */
public class RssFeedCellEditor extends AbstractCellEditor implements TableCellEditor {
  RssFeedCellComponent feedComponent;

  public RssFeedCellEditor() {
    feedComponent = new RssFeedCellComponent();
  }

  @Override
  public Component getTableCellEditorComponent(JTable table, Object value,
      boolean isSelected, int row, int column) {
    RssFeed feed = (RssFeed)value;
    feedComponent.updateData(feed, true, table);
    return feedComponent;
  }

  @Override
  public Object getCellEditorValue() {
    return null;
  }

    
}
