/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iter.dbcon;

import iter.model.TernakKuMemberModel;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rahmat Al Hakam
 */
public class TernakKuDAO {
    private Connector kon = new Connector();
    
    public List<TernakKuMemberModel> getAllDataTernak(){
        List<TernakKuMemberModel> ternakModel = new ArrayList<TernakKuMemberModel>();
        String query = "Select * from category";
         try{
            kon.getCon();
            kon.getStatement();
            kon.setResultSet(kon.getStatement().executeQuery(query));
            ResultSet rs = kon.getStatement().executeQuery(query);
            while(rs.next()){
                int nik = Integer.parseInt(rs.getString("nik"));
                String ternak = rs.getString("ternak");
                String tgl =rs.getString("tgl");
                String lokasi =rs.getString("lokasi");
                int stok = Integer.parseInt(rs.getString("stok"));
                String konrak =rs.getString("kontrak");
                TernakKuMemberModel t = new TernakKuMemberModel(nik, stok, ternak, tgl, lokasi, konrak);
                ternakModel.add(t);
            }
            kon.getStatement().close();
            kon.getCon().close();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return ternakModel;
    }
}
