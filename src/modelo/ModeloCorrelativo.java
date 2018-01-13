/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Entidad.EntidadCorrelativo;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author hgonzalez
 */
public class ModeloCorrelativo {
 
    public void mostrarCorrelativo(JComboBox<EntidadCorrelativo> cmbCorrelativo, String Tempo, String Recib){
        cmbCorrelativo.removeAllItems();
        /*try{
            ConexionBD cnn = new ConexionBD();
            cnn.conectar();            
            ResultSet rs = cnn.consulta("SELECT L.N8CTEM, L.N8D4NC, T.JTAFCA, N.NVBJDS " +
                                        "FROM UNIDATOS.LEMBARC0 AS L INNER JOIN UNIDATOS.GTNAVVJ0 AS T ON L.N8CTEM=T.JTCTEM and " +
                                        " L.N8D4NC=T.JTD4NC INNER JOIN UNIDATOS.GNAVESB0 AS N " +
                                        "ON T.JTCTEM=N.NVCTEM and T.JTAFCA=N.NVAFCA " +
                                        "WHERE L.N8CTEM="+"'"+Tempo+"'"+" AND L.N8AARE="+"'"+Recib+"'" +
                                        "GROUP BY L.N8CTEM, L.N8D4NC, T.JTAFCA, N.NVBJDS");
            while(rs.next()){
                cmbCorrelativo.addItem(
                        new EntidadCorrelativo(
                                rs.getString("N8CTEM"),
                                rs.getInt("N8D4NC"),
                                rs.getString("JTAFCA"),
                                rs.getString("NVBJDS")
                        )
                );                
            }
            cnn.desconectar();
        }catch(SQLException ex){
            //Logger.getLogger(EntidadVariedad.class).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR CORRELATIVO");
        }
        */
    }    
    
}


