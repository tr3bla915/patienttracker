/*
 * TableModelUser.java
 *
 * Created on September 6, 2007, 9:59 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package my.jasper;

/*
 * TableModelUser.java
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
public class TableModelPatientQue extends AbstractTableModel {
    
    private int colnum=7;
    private int rownum;
    private String[] colNames={"Name","Status","Phone","Appointment","Check-In","Check-Out","Staff to See"};
    private  ArrayList<String[]> ResultSets;
    
    /** Creates a new instance of FoodTableModel */
    public TableModelPatientQue(ResultSet rs) {
        
        ResultSets=new ArrayList<String[]>();
        
        try{
            while(rs.next()){
                
                String[] row={
                    rs.getString("Name"),
                    rs.getString("Status"),
                    rs.getString("Appointment Time"),
                    rs.getString("Checkin Time"),
                    rs.getString("Checkout Time")
                };
                ResultSets.add(row);
                
            }
        } catch(Exception e){
            System.out.println("Exception in TableModelPatientQue");
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
