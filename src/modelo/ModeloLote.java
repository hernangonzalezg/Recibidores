/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author hgonzalez
 */
public class ModeloLote {
    
//    public void mostrarLote(<EntidadLote> tblLote, String Tempo){
//        cmbRecibidor.removeAllItems();
//        try{
//            ConexionBD cnn = new ConexionBD();
//            cnn.conectar();
//            //ResultSet rs = cnn.consulta("SELECT * FROM UNIDATOS.LEMBARC0 WHERE N8CTEM="+"'"+Tempo+" ORDER BY AIAIDS");
//            ResultSet rs = cnn.consulta("SELECT L.N8CTEM, L.N8AARE, R.BJAENF FROM UNIDATOS.LEMBARC0 AS L INNER JOIN UNIDATOS.GRECIBI0 "
//                    + "AS R ON L.N8CTEM=R.BJCTEM and L.N8AARE=R.BJAARE "
//            + "WHERE L.N8CTEM='"+Tempo+"'"+" GROUP BY L.N8CTEM, L.N8AARE, R.BJAENF");                                    
//            while(rs.next()){
//                cmbRecibidor.addItem(
//                        new EntidadRecibidor(
//                                rs.getString("N8CTEM"),
//                                rs.getString("N8AARE"),
//                                rs.getString("BJAENF")
//                        )
//                );                
//            }
//            cnn.desconectar();
//        }catch(SQLException ex){
//            //Logger.getLogger(EntidadVariedad.class).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "ERROR RECIBIDOR");
//        }
//        
//    }  
    
}
