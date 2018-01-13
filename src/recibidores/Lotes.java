/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recibidores;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelo.ConexionBD;

/**
 *
 * @author hgonzalez
 */
public class Lotes extends javax.swing.JFrame {

    String CodigoTemporada;
    int Correlativo;
    int Ov;
    public Lotes(String CodigoTemporada, int Correlativo, int Ov) {
        initComponents();
        
        lblTemporada.setText(CodigoTemporada);
        txtOv.setText(String.valueOf(Ov));
        
        //CARGAR TABLA
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            tblLotes.setModel(modelo);

            ConexionBD cnn = new ConexionBD();
            cnn.conectar();
            ResultSet rs = cnn.consulta("SELECT LGCTEM, LGD4NC, LGASNG, LGNDLT, LGAARE, LGAACD, LGABCD, LGACCD, LGADCD, "
                    + "LGAAPS, LGAGCD, LGASCD, LGBDCD, LGCSVT, LGAICD,LGFYCD, LGRLCD, LGAECD "
                    + "FROM UNIDATOS.PPARLOT1 WHERE LGCTEM='"+CodigoTemporada+"' and  LGTDLO='LR' and LGD4NC="+Correlativo+" and LGASNG="+Ov+"");
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Gastos Genericos");
            modelo.addColumn("Gastos");
            modelo.addColumn("Monto M/C");
            modelo.addColumn("Paridad");
            modelo.addColumn("Total US$");
            modelo.addColumn("Unitario");

            //                int[] anchos = {50,200};
            //
            //                for(int x = 0; x < cantidadColumnas; x++)
            //                {
                //                    jtLotes.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
                //                }
            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for(int i = 0; i< cantidadColumnas; i++)
                {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch(SQLException ex){

        }
        //CARGAR TABLA
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDesTemporada = new javax.swing.JLabel();
        lblTemporada = new javax.swing.JLabel();
        lblRecibir = new javax.swing.JLabel();
        lblNave = new javax.swing.JLabel();
        lblViaje = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLotes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblOv = new javax.swing.JLabel();
        txtViaje = new javax.swing.JTextField();
        txtRecibidor = new javax.swing.JTextField();
        txtNave = new javax.swing.JTextField();
        txtOv = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDesTemporada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDesTemporada.setText("Temporada");

        lblTemporada.setText("CodigoTemp");
        lblTemporada.setEnabled(false);

        lblRecibir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRecibir.setText("Recibidor");

        lblNave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNave.setText("Nave");

        lblViaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblViaje.setText("Viaje");

        tblLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Lote 1", "Lote 2", "Lote 3", "Lote 4", "Lote 5", "Lote 6", "Lote N"
            }
        ));
        jScrollPane1.setViewportView(tblLotes);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Especie"},
                {"Contenedor"},
                {"Grupo"},
                {"Subgrupo"},
                {"Variedad"},
                {"Peso"},
                {"Dimension"},
                {"Envase"},
                {"Categoria"},
                {"Condicion"},
                {"Embalaje"},
                {"Etiqueta"},
                {"Tipo Frio"},
                {"Calibres"},
                {"TOTAL"},
                {null}
            },
            new String [] {
                "Datos"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblOv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOv.setText("OV");

        txtViaje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtViaje.setEnabled(false);
        txtViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViajeActionPerformed(evt);
            }
        });

        txtRecibidor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRecibidor.setEnabled(false);
        txtRecibidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecibidorActionPerformed(evt);
            }
        });

        txtNave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNave.setEnabled(false);
        txtNave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNaveActionPerformed(evt);
            }
        });

        txtOv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOv.setEnabled(false);
        txtOv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblDesTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRecibir)
                                    .addComponent(txtRecibidor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lblNave))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(txtNave, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(3, 3, 3)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblViaje)
                            .addComponent(txtViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOv)
                            .addComponent(txtOv, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(586, 586, 586)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesTemporada)
                    .addComponent(lblTemporada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRecibir)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblOv)
                                .addComponent(lblNave)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtRecibidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtOv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblViaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViajeActionPerformed

    private void txtRecibidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecibidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecibidorActionPerformed

    private void txtNaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNaveActionPerformed

    private void txtOvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOvActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel lblDesTemporada;
    private javax.swing.JLabel lblNave;
    private javax.swing.JLabel lblOv;
    private javax.swing.JLabel lblRecibir;
    public javax.swing.JLabel lblTemporada;
    private javax.swing.JLabel lblViaje;
    private javax.swing.JTable tblLotes;
    public javax.swing.JTextField txtNave;
    public javax.swing.JTextField txtOv;
    public javax.swing.JTextField txtRecibidor;
    public javax.swing.JTextField txtViaje;
    // End of variables declaration//GEN-END:variables
}
