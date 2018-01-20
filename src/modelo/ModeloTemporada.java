/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Entidad.EntidadTemporada;
import com.sun.istack.internal.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 *
 * @author hgonzalez
 */
public class ModeloTemporada {

    public void mostrarTemporada(JComboBox<EntidadTemporada> cmbTemporada){
        try{
            ConexionBD cnn = new ConexionBD();
            cnn.conectar();
            ResultSet rs = cnn.consulta("SELECT * FROM UNIDATOS.GTEMPOR0 ORDER BY IVE9ST DESC, IVC7DS DESC FETCH FIRST 8 ROWS ONLY");
            while(rs.next()){
                cmbTemporada.addItem(
                        new EntidadTemporada(
                                rs.getString("IVCTEM"),
                                substring(rs.getString("IVC7DS"), 0,14),
                                rs.getString("IVE9ST")
                        )
                );
            }
            cnn.desconectar();
        }catch(SQLException ex){
            Logger.getLogger(EntidadTemporada.class).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR TEMPORADA");
        }
    }
    
}
