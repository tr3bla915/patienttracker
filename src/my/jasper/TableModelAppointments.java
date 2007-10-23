/*
 * UserTableModel.java
 *
 * Created on September 6, 2007, 9:59 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package my.jasper;

/*
 * UserTableModel.java
 *
 * Created on 2005/01/17, 15:31
 */

import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author noniko
 */
public class TableModelAppointments extends AbstractTableModel {
    
    private int colnum=3;
    private int rownum;
    private String[] colNames={"DateTime","Canceled", "Staff"};
    private  ArrayList<String[]> ResultSets;
    
    /** Creates a new instance of FoodTableModel */
    public TableModelAppointments(ResultSet rs) {
        
        ResultSets=new ArrayList<String[]>();
        
        if (null != rs) {
            try{
                while(rs.next()){

                    String[] row={
                        rs.getString("username"),
                        rs.getString("fullname"),
                        rs.getString("userrole"),
                        rs.getString("status"),
                        rs.getString("active")
                    };
                    ResultSets.add(row);

                }
            } catch(Exception e){
                System.out.println("Exception in CarTableModel");
            }
        }
        
    }
    
    public Object getValueAt(int rowindex, int columnindex) {
        
        String[] row=ResultSets.get(rowindex);
        return row[columnindex];
    }
    
    public int getRowCount() {
        
        return ResultSets.size();
    }
    
    public int getColumnCount() {
        
        return colnum;
    }
    
    public String getColumnName(int param) {
        
        return colNames[param];
    }
    
}
