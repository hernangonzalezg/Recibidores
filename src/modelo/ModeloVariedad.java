/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Entidad.EntidadVariedad;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author hgonzalez
 */
public class ModeloVariedad {
    public void mostrarVariedad(JComboBox<EntidadVariedad> cmbVariedad, String Tempo, String Espe){
        cmbVariedad.removeAllItems();
        /*
        try{
            ConexionBD cnn = new ConexionBD();
            cnn.conectar();
            ResultSet rs = cnn.consulta("SELECT * FROM UNIDATOS.GVARIED2 WHERE AICTEM="+"'"+Tempo+"'"+" AND "+"AIAACD="+"'"+Espe+"'"+" ORDER BY AIAIDS");
            while(rs.next()){
                cmbVariedad.addItem(
                        new EntidadVariedad(
                                rs.getString("AICTEM"),
                                rs.getString("AIAACD"),
                                rs.getString("AIADCD"),
                                rs.getString("AIAIDS")
                        )
                );                
            }
            cnn.desconectar();
        }catch(SQLException ex){
            //Logger.getLogger(EntidadVariedad.class).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR VARIEDAD");
        }
        */
    }
     
}
