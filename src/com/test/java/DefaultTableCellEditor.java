/**
 * 
 */
package com.test.java;

import java.awt.Component;
import java.util.EventObject;

import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;

/**
 * @author snatara
 *
 */
public class DefaultTableCellEditor implements TableCellEditor
	    {
			
	        public Component getTableCellEditorComponent (JTable table,
	                                             Object value,
	                                             boolean isSelected,
	                                             int row,
	                                             int column)
	        {
				return table;
	            // Default functionality goes here.
	        }

			@Override
			public void addCellEditorListener(CellEditorListener arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void cancelCellEditing() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object getCellEditorValue() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean isCellEditable(EventObject arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void removeCellEditorListener(CellEditorListener arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean shouldSelectCell(EventObject arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean stopCellEditing() {
				// TODO Auto-generated method stub
				return false;
			}
	    }
