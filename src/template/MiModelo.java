/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AxelFabianCarrenoMun
 */
public class MiModelo extends DefaultTableModel
{
   public boolean isCellEditable (int row, int column)
   {
        // Aquí devolvemos true o false según queramos que una celda
        // identificada por fila,columna (row,column), sea o no editable
        if(column == 3){
            return true;
        }
        if(column == 2){
            return true;
        }
       return false;
   }
}
