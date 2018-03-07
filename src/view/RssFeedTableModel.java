/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.RssFeed;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sara lola tahiri
 */
//This abstract class provides default implementations for most of the methods in the TableModel interface.
public class RssFeedTableModel extends AbstractTableModel {
    /* The user of  List [aka List feeds] interface has precise control 
    over where in the list each element is inserted. The user can access elements by
    their integer index (position in the list), and search for elements in the list.*/
        List feeds;

  public RssFeedTableModel(List feeds) {
    this.feeds = feeds;
  }
/*To create a concrete TableModel as a subclass of AbstractTableModel you need only provide
  implementations for the following four methods:
  public int getRowCount();
  public int getColumnCount();
   public int getRowCount();
  public Object getValueAt(int row, int column);*/
  
    public Class getColumnClass(int columnIndex) { return RssFeed.class; }
    public int getColumnCount() { return 1; }
    public String getColumnName(int columnIndex) { return "Feed"; }
    public int getRowCount() { return (feeds == null) ? 0 : feeds.size(); }
    public Object getValueAt(int rowIndex, int columnIndex) { return (feeds == null) ? null : feeds.get(rowIndex); }
    public boolean isCellEditable(int columnIndex, int rowIndex) { return true; }
}
