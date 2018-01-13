/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Entidad.EntidadNumeroViaje;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author hgonzalez
 */
public class ModeloNumeroViaje {
 
    public void mostraNumeroViaje(JComboBox<EntidadNumeroViaje> cmbNumeroViaje, String Tempo, String Nave){
        cmbNumeroViaje.removeAllItems();
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
                */
//        cmbNumeroViaje.addItem(
//                        new EntidadNumeroViaje(0,1)
//                ); 
//        cmbNumeroViaje.addItem(
//                        new EntidadNumeroViaje(0,2)
//                );
        /*
            }
            cnn.desconectar();
        }catch(SQLException ex){
            //Logger.getLogger(EntidadVariedad.class).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR CORRELATIVO");
        }
        */
    }    
    
}


