/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabla;

import Render.Render;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hgonzalez
 */
public class Tablalotes {
    
    private boolean[] editable = {false,false,false,false,false,false,false,false,false,false,
                                    false,false,false,false,false,false,false,false,false,false,false};

    public void visualizar(JTable tabla){
       
        tabla.setDefaultRenderer(Object.class, new Render());
        /*DefaultTableModel dt = new DefaultTableModel(new String[]{"temporada","correlativo","numeroov","nunerolote","recibidor","especie","grupo","subgrupo","variedad","peso","dimension","tipoenvase","categoria","embalaje","etiqueta","condicion","tipofrio","calibre","cajas"});

            Class[] type = new Class[]{
                java.lang.Object.class,java.lang.Object.class,
            }
*/
    }
    
}
