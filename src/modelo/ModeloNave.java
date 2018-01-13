/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Entidad.EntidadNave;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author hgonzalez
 */
public class ModeloNave {
 
    public void mostrarNave(JComboBox<EntidadNave> cmbNave, String Tempo, String Recib){
        cmbNave.removeAllItems();
        try{
            ConexionBD cnn = new ConexionBD();
            cnn.conectar();            
            ResultSet rs = cnn.consulta("SELECT L.N8CTEM, L.N8D4NC, T.JTAFCA, N.NVBJDS, T.JTD5NC FROM UNIDATOS.LEMBARC1 AS L "
                    + "INNER JOIN UNIDATOS.GTNAVVJ1 AS T ON L.N8CTEM=T.JTCTEM and L.N8D4NC=T.JTD4NC "
                    + "INNER JOIN UNIDATOS.GNAVESB1 AS N ON T.JTCTEM=N.NVCTEM and T.JTAFCA=N.NVAFCA "
                    + "WHERE L.N8CTEM='"+Tempo+"'"+" AND L.N8AARE='"+Recib+"'"
                    + "GROUP BY L.N8CTEM, L.N8D4NC, T.JTAFCA, N.NVBJDS, T.JTD5NC ORDER BY L.N8D4NC");
            while(rs.next()){
                cmbNave.addItem(
                        new EntidadNave(
                                rs.getString("N8CTEM"),
                                rs.getInt("N8D4NC"),
                                rs.getString("JTAFCA"),
                                rs.getString("NVBJDS"),
                                rs.getInt("JTD5NC")
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


