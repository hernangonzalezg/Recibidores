/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Entidad.EntidadDetalleLote;
import Entidad.EntidadEncabLote;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hgonzalez
 */
public class ModeloEncabDetalle {

    public ArrayList<EntidadDetalleLote> consultarEncabDetalle(String Temp, String Recib, int Liqui) throws SQLException{
//    public ArrayList<EntidadDetalleLote> consultarEncabDetalle() throws SQLException{        

//Llenado de Encabezado de Liquidacion
        EntidadEncabLote Encabezado = new EntidadEncabLote();

        try{
            ConexionBD cnn = new ConexionBD();
            cnn.conectar();            
            ResultSet rs = cnn.consulta("SELECT * FROM UNIDATOS.BLIQREE2 AS E WHERE E.LECTEM='"+Temp+"'"+" AND E.LEAARE='"+Recib+"'"+" AND E.LELIQU="+Liqui);
            while(rs.next()){
                Encabezado.setTemporada(rs.getString("LECTEM"));
                Encabezado.setRecibidor(rs.getString("LEAARE"));
                Encabezado.setNliquidacion(rs.getInt("LELIQU"));
                Encabezado.setNov(rs.getInt("LEASNG"));
                Encabezado.setNcorrelativo(rs.getInt("LED4NC"));
                Encabezado.setNave(rs.getString("LEAFCA"));
                Encabezado.setViaje(rs.getInt("LED5NC"));
                Encabezado.setFechaventa(rs.getString("LEFVEN"));
                Encabezado.setFechaliquidacion(rs.getString("LEBQDA"));
                Encabezado.setMoneda(rs.getInt("LEMCVE"));
                Encabezado.setValorparidad(rs.getInt("LEVPAR"));
                Encabezado.setCajasmayor(rs.getInt("LECMAY"));
                Encabezado.setValorcajasmayor(rs.getInt("LEDYVU"));
                Encabezado.setCajasmenor(rs.getInt("LECLCJ"));
                Encabezado.setValorcajasmenor(rs.getInt("LEDZVU"));
                Encabezado.setCajasmalas(rs.getInt("LECMCJ"));
                Encabezado.setValorcajasmalas(rs.getInt("LEDOVU"));
                Encabezado.setAnticipo(rs.getInt("LEDWVU"));
                Encabezado.setParidadanticipo(rs.getInt("LEB4VM"));
                Encabezado.setValorminimogarantizado(rs.getInt("LED1VU"));
                Encabezado.setParidadminimogarantizado(rs.getInt("LEB5VM"));
                Encabezado.setSaldoliquidacion(rs.getInt("LEDXVU"));
                Encabezado.setParidadajustada(rs.getInt("LEGUNB"));
                Encabezado.setParidadsaldoliquidacion(rs.getInt("LEEGVU"));
                Encabezado.setMontocancelado(rs.getInt("LEBNVM"));
                Encabezado.setPorcentajedistrib(rs.getInt("LEPDSE"));                

            }
            cnn.desconectar();
        }catch(SQLException ex){
            //Logger.getLogger(EntidadVariedad.class).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR ENCABEZADO LIQUIDACION");
        }
                
        System.out.println("DATO ENCABEZADO: "+Encabezado.getTemporada()+" "+Encabezado.getRecibidor()+" "+Encabezado.getNliquidacion());

//Llenado de Detalle de Liquidacion
        EntidadDetalleLote detallelote = null;
        ArrayList<EntidadDetalleLote> detalle = new ArrayList();
        try{
        ConexionBD cnn = new ConexionBD();
        cnn.conectar();
        ResultSet rd = cnn.consulta("SELECT * FROM UNIDATOS.BLIQRED2 AS D WHERE D.LDCTEM="+"'"+Temp+"'"+" AND D.LDAARE="+"'"+Recib+"'"+" AND D.LDLIQU="+Liqui);
        
            while(rd.next()){
                detallelote=new EntidadDetalleLote();
                detallelote.setTemporada(rd.getString("LDCTEM"));
                detallelote.setRecibidor(rd.getString("LDAARE"));
                detallelote.setNliquidacion(rd.getInt("LDLIQU"));
                detallelote.setGastogenerico(rd.getString("LDGJNM"));
                detallelote.setGasto(rd.getString("LDKJBB"));
                detallelote.setVparidad(rd.getInt("LDVPAR"));
                detallelote.setVgasto(rd.getInt("LDDVVU"));
                detalle.add(detallelote);
                System.out.println("DATO DETALLE : "+ detallelote.getTemporada()+" "+detallelote.getRecibidor()+" "+detallelote.getNliquidacion()+" "
                        +detallelote.getGastogenerico()+" "+detallelote.getGasto());
            }
        cnn.desconectar();            
        }catch(SQLException e){    
        }
        return detalle;
         
    }
}
