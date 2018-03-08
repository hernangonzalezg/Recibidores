/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Entidad.EntidadRecibidor;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author hgonzalez
 */
public class ModeloRecibidor {
 
    public void mostrarRecibidor(JComboBox<EntidadRecibidor> cmbRecibidor, String Tempo){
        cmbRecibidor.removeAllItems();
        try{
            ConexionBD cnn = new ConexionBD();
            cnn.conectar();
            //ResultSet rs = cnn.consulta("SELECT * FROM UNIDATOS.LEMBARC0 WHERE N8CTEM="+"'"+Tempo+" ORDER BY AIAIDS");
            ResultSet rs = cnn.consulta("SELECT L.N8CTEM, L.N8AARE, R.BJAENF FROM UNIDATOS.LEMBARC0 AS L "
                    + "INNER JOIN UNIDATOS.GRECIBI2 AS R ON L.N8CTEM=R.BJCTEM and L.N8AARE=R.BJAARE "
                    + "INNER JOIN UNIDATOS.VORDENV2 AS V ON L.N8CTEM=V.BHCTEM and L.N8ASNG=V.BHASNG "                    
            + "WHERE L.N8CTEM='"+Tempo+"'"+" AND V.BHAAA1<>'0001' GROUP BY L.N8CTEM, L.N8AARE, R.BJAENF");                                    
            while(rs.next()){
                cmbRecibidor.addItem(
                        new EntidadRecibidor(
                                rs.getString("N8CTEM"),
                                rs.getString("N8AARE"),
                                rs.getString("BJAENF")
                        )
                );                
            }
            cnn.desconectar();
        }catch(SQLException ex){
            //Logger.getLogger(EntidadVariedad.class).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR RECIBIDOR");
        }
        
    }    
    
}
