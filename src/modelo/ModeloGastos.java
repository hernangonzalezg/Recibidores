/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Entidad.EntidadGastos;
import java.awt.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author hgonzalez
 */
public class ModeloGastos {

    public java.util.List<EntidadGastos> mostrarGastos(String temporada, String codigorec) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public List<EntidadGastos> consultarGastos(String Temp, String Recib){
//        EntidadGastos gastos=null;
//        List<EntidadGastos> listadegastos =  new ArrayList<>();
//     
//        try{
//            ConexionBD cnn=new ConexionBD();
//            cnn.conectar();
//            
//            ResultSet rs = cnn.consulta("SELECT B.KLCTEM, B.KLAARE, B.KLGJNM, B.KLKJBB, G.MPDSTG FROM UNIDATOS.BGASTOS1 AS B "
//            + "INNER JOIN UNIDATOS.BTIPGAS1 AS G ON B.KLGJNM=G.MPGJNM and B.KLKJBB=G.MPKJBB "
//            + "WHERE B.KLCTEM="+"'"+Temp+"'"+" AND B.KLAARE='"+Recib+"'"+" ORDER BY B.KLUPNB");
//            while(rs.next()){
//                gastos=new EntidadGastos();
//                gastos.setTemporada(rs.getString("KLCTEM"));
//                gastos.setCodigorec(rs.getString("KLAARE"));
//                gastos.setCodigogges(rs.getString("KLGJNM"));
//                gastos.setCodigogasto(rs.getString("KLKJBB"));
//                gastos.setNombregasto(rs.getString("MPDSTG"));
//                listadegastos.add(gastos);               
//            }
//            cnn.desconectar();
//
//        }catch(Exception e){
//        }
//        return listadegastos;
//    }

}
