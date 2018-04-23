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

/**
 *
 * @author hgonzalez
 */
public class ModeloEncabDetalle {

    public ArrayList<EntidadDetalleLote> consultarEncabDetalle(String Temp, String Recib, int Liqui) throws SQLException{

        EntidadEncabLote Encabezado = new EntidadEncabLote();
        
        ConexionBD cnn = new ConexionBD();
        cnn.conectar();
        ResultSet rs = cnn.consulta("SELECT * FROM UNIDATOS.BLIQREE2 AS B WHERE B.LECTEM="+"'"+Temp+"'"+" AND B.LEAARE="+"'"+Recib+"'"+" AND B.LELIQU="+Liqui);
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
        
        cnn.desconectar();
        
        System.out.println("DATO ENCABEZADO: "+Encabezado.getTemporada()+" "+Encabezado.getRecibidor()+" "+Encabezado.getNliquidacion());

        EntidadDetalleLote detallelote = null;
        ArrayList<EntidadDetalleLote> detalle = null;
        ConexionBD cn = new ConexionBD();
        cnn.conectar();
        try{

        ResultSet rd = cn.consulta("SELECT * FROM UNIDATOS.BLIQRED2 AS B WHERE B.LDCTEM="+"'"+Temp+"'"+" AND B.LDAARE="+"'"+Recib+"'"+" AND B.LDLIQU="+Liqui);
        
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
                System.out.println("DATO DETALLE : "+ rd);
            }
        cn.desconectar();            
        }catch(SQLException e){    
        }
        return detalle;
    }
}
