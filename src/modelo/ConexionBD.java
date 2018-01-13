package modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {
    public Connection cnn;
    
    public void conectar(){
        try {
            Class.forName("com.ibm.as400.access.AS400JDBCDriver");            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            cnn = DriverManager.getConnection("jdbc:as400://172.18.8.120", "BRIOUSER", "BRIOUSER");
        //*******************************************************************************************   
         if (cnn instanceof com.ibm.as400.access.AS400JDBCConnection)
            System.out.println("cnn se ejecuta bajo el controlador JDBC de IBM Toolbox para Java.");
         else
            System.out.println("Existe alguna anomalía en conn2.");
        //*******************************************************************************************             
            System.out.println("CNN " + cnn);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void desconectar(){
        try {
            cnn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet consulta(String sql){
        ResultSet rs = null;
        //System.out.println("SQL : "+sql);
        try{
            PreparedStatement ps = cnn.prepareStatement(sql);
            //System.out.println("PSSSSS : " + ps);
            rs = ps.executeQuery();
        }catch(SQLException e){
            System.out.println("Error consulta : "+ e.getMessage());
        }
        return rs;
    }

    
}
