/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iter.dbcon;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Rahmat Al Hakam
 */
public class Connector {
    private static Connector con;
    private String url = "jdbc:mysql://localhost:3306/barang";
    private Statement statement;
    private ResultSet resultSet;

    public java.sql.Connection getCon(){
        if(con==null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url,"root","");
                
                JOptionPane.showMessageDialog(null, "Database Terkoneksi", "Hasil", JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "belum terkoneksi","Hasil", JOptionPane.ERROR_MESSAGE);
            }
        }
    return con;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Statement getStatement() throws SQLException {
        statement = con.createStatement();
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() throws SQLException {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
    
    
}
