/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Entidad.EntidadEspecie;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author hgonzalez
 */
public class ModeloEspecie {

    public void mostrarEspecie(JComboBox<EntidadEspecie> cmbEspecie, String Tempo){
        cmbEspecie.removeAllItems();
        /*
        try{
            ConexionBD cnn = new ConexionBD();
            cnn.conectar();
            ResultSet rs = cnn.consulta("SELECT * FROM UNIDATOS.GESPECI2 WHERE AFCTEM="+"'"+Tempo+"'");
            while(rs.next()){
                cmbEspecie.addItem(
                        new EntidadEspecie(
                                rs.getString("AFCTEM"),
                                rs.getString("AFAACD"),
                                rs.getString("AFABDS")
                        )
                );                
            }
            cnn.desconectar();
        }catch(SQLException ex){
            //Logger.getLogger(EntidadVariedad.class).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR ESPECIE");
        }
        */
    }
    
}
