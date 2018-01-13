/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Entidad.EntidadOv;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author hgonzalez
 */
public class ModeloOv {
   
    public void mostrarOv(JComboBox<EntidadOv> cmbOv, String Tempo, String Recib, int Corr){
        cmbOv.removeAllItems();
        try{
            ConexionBD cnn = new ConexionBD();
            cnn.conectar();            
            ResultSet rs = cnn.consulta("SELECT L.N8CTEM, L.N8ASNG FROM UNIDATOS.LEMBARC0 AS L "+ 
                    "WHERE L.N8CTEM="+"'"+Tempo+"'"+" AND L.N8AARE="+"'"+Recib+"'"+" AND L.N8D4NC="+Corr+ 
                    " GROUP BY L.N8CTEM, L.N8ASNG ORDER BY L.N8CTEM, L.N8ASNG");
            while(rs.next()){
                cmbOv.addItem(
                        new EntidadOv(
                                rs.getString("N8CTEM"),
                                rs.getInt("N8ASNG")
                        )
                );                
            }
            cnn.desconectar();
        }catch(SQLException ex){
            //Logger.getLogger(EntidadVariedad.class).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR CORRELATIVO");
        }

    }
    
    
}
