/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recibidores;

import Entidad.EntidadNave;
import Entidad.EntidadOv;
import Entidad.EntidadRecibidor;
import java.awt.event.ItemEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelo.ConexionBD;
import modelo.ModeloNave;
import modelo.ModeloOv;
import modelo.ModeloRecibidor;


public class Liquidacion extends javax.swing.JFrame {

    String CodigoTemporada;
    public Liquidacion(String CodigoTemporada) {
        
        //INICIO CAMBIA A WINDOWS
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Liquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Liquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Liquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Liquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //FIN CAMBIA A WINDOWS
        
        initComponents();
            cmbRecibidor.removeAllItems();
            cmbNave.removeAllItems();
            
            lblTemporada.setText(CodigoTemporada);
            ModeloRecibidor MR = new ModeloRecibidor();
            MR.mostrarRecibidor(cmbRecibidor, this.lblTemporada.getText());      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblDesTemporada = new javax.swing.JLabel();
        lblFechaLiquidacion = new javax.swing.JLabel();
        lblRecibir = new javax.swing.JLabel();
        cmbRecibidor = new javax.swing.JComboBox<>();
        lblNave = new javax.swing.JLabel();
        cmbNave = new javax.swing.JComboBox<>();
        lblNumeroViaje = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtParidadventa = new javax.swing.JTextField();
        cbmMonedaventa = new javax.swing.JComboBox<>();
        txtParidadajustada = new javax.swing.JTextField();
        lblFechaVenta = new javax.swing.JLabel();
        lblMonedaventa = new javax.swing.JLabel();
        lblParidadajustada = new javax.swing.JLabel();
        lblParidadventa = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        spnPorcentaje = new javax.swing.JSpinner();
        lblAnticipo = new javax.swing.JLabel();
        lblValormg = new javax.swing.JLabel();
        txtAnticipoparidad = new javax.swing.JTextField();
        txtValormgparidad = new javax.swing.JTextField();
        lblPorcentaje = new javax.swing.JLabel();
        lblTotalventaus = new javax.swing.JLabel();
        txtTotalventaus = new javax.swing.JTextField();
        txtTotalgastosus = new javax.swing.JTextField();
        txtSaldoliqus = new javax.swing.JTextField();
        txtResultadonetous = new javax.swing.JTextField();
        txtValormgus = new javax.swing.JTextField();
        txtSaldoliqparidad = new javax.swing.JTextField();
        txtSaldoliq = new javax.swing.JTextField();
        txtDistribucionunifrutti = new javax.swing.JTextField();
        lblTotalgastosus = new javax.swing.JLabel();
        lblResultadonetous = new javax.swing.JLabel();
        lblAnticipous = new javax.swing.JLabel();
        lblValormgus = new javax.swing.JLabel();
        lblSaldoliqus = new javax.swing.JLabel();
        lblSaldoliq = new javax.swing.JLabel();
        lblDistribucionexcedentes = new javax.swing.JLabel();
        txtAnticipomonedaorigen = new javax.swing.JTextField();
        lblValormgmonedaorigen = new javax.swing.JTextField();
        txtDistribucionrecibidor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGastos = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(450, 0), new java.awt.Dimension(450, 0), new java.awt.Dimension(450, 32767));
        jSeparator1 = new javax.swing.JSeparator();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(450, 0), new java.awt.Dimension(450, 0), new java.awt.Dimension(450, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(450, 0), new java.awt.Dimension(450, 0), new java.awt.Dimension(450, 32767));
        txtAnticipous = new javax.swing.JTextField();
        lblDistribucionrecibidor = new javax.swing.JLabel();
        lblDistribucionunifrutti = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnLotes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblGastosrecibidor = new javax.swing.JLabel();
        cmbFechaVenta = new datechooser.beans.DateChooserCombo();
        lblTemporada = new javax.swing.JLabel();
        txtViaje = new javax.swing.JTextField();
        cmbOv = new javax.swing.JComboBox<>();
        lblOv = new javax.swing.JLabel();
        cmbFechaLiquidacion = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Liquidacion"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1676, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );

        lblDesTemporada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDesTemporada.setText("Temporada");

        lblFechaLiquidacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFechaLiquidacion.setText("Fecha Liquidacion");

        lblRecibir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRecibir.setText("Recibidor");

        cmbRecibidor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbRecibidor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRecibidorItemStateChanged(evt);
            }
        });
        cmbRecibidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRecibidorActionPerformed(evt);
            }
        });

        lblNave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNave.setText("Nave");

        cmbNave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbNave.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNaveItemStateChanged(evt);
            }
        });

        lblNumeroViaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNumeroViaje.setText("Viaje");

        txtParidadventa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbmMonedaventa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbmMonedaventa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolas U.S.A.", "Euro", "Yen" }));

        txtParidadajustada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblFechaVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFechaVenta.setText("Fecha Venta");

        lblMonedaventa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMonedaventa.setText("Moneda venta");

        lblParidadajustada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblParidadajustada.setText("Paridad ajustada");

        lblParidadventa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblParidadventa.setText("Paridad de Venta");

        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 432));

        spnPorcentaje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spnPorcentaje.setMinimumSize(new java.awt.Dimension(34, 23));

        lblAnticipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAnticipo.setText("Anticipo");

        lblValormg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValormg.setText("Valor M/G");

        txtAnticipoparidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAnticipoparidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnticipoparidadActionPerformed(evt);
            }
        });

        txtValormgparidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPorcentaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPorcentaje.setText("% Distrib. Excedentes");

        lblTotalventaus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalventaus.setText("Total Ventas US$");

        txtTotalventaus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalventaus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalventausActionPerformed(evt);
            }
        });

        txtTotalgastosus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSaldoliqus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtResultadonetous.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtResultadonetous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadonetousActionPerformed(evt);
            }
        });

        txtValormgus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSaldoliqparidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSaldoliq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDistribucionunifrutti.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTotalgastosus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalgastosus.setText("Total Gastos US$");

        lblResultadonetous.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResultadonetous.setText("Resultado Neto US$");

        lblAnticipous.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAnticipous.setText("Anticipo US$");

        lblValormgus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValormgus.setText("Valor M/G US$");

        lblSaldoliqus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSaldoliqus.setText("Saldo Liq. US$");

        lblSaldoliq.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSaldoliq.setText("Saldo Liquid.");

        lblDistribucionexcedentes.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblDistribucionexcedentes.setText("Distribución Excedentes");

        txtAnticipomonedaorigen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAnticipomonedaorigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnticipomonedaorigenActionPerformed(evt);
            }
        });

        lblValormgmonedaorigen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDistribucionrecibidor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDistribucionrecibidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistribucionrecibidorActionPerformed(evt);
            }
        });

        tblGastos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", null, null, null, null},
                {"", "", null, null, null, ""},
                {"", "", null, null, null, null},
                {"", "", null, null, null, null},
                {"", null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Gasto Generico", "Gastos", "Monto M/C", "Paridad", "Total US$", "Unitario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGastos.setRowHeight(26);
        jScrollPane2.setViewportView(tblGastos);
        if (tblGastos.getColumnModel().getColumnCount() > 0) {
            tblGastos.getColumnModel().getColumn(0).setHeaderValue("Gasto Generico");
            tblGastos.getColumnModel().getColumn(1).setHeaderValue("Gastos");
            tblGastos.getColumnModel().getColumn(2).setHeaderValue("Monto M/C");
            tblGastos.getColumnModel().getColumn(3).setHeaderValue("Paridad");
            tblGastos.getColumnModel().getColumn(4).setHeaderValue("Total US$");
            tblGastos.getColumnModel().getColumn(5).setHeaderValue("Unitario");
        }

        filler1.setBackground(new java.awt.Color(0, 0, 0));
        filler1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        filler2.setBackground(new java.awt.Color(0, 0, 0));
        filler2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        filler3.setBackground(new java.awt.Color(0, 0, 0));
        filler3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtAnticipous.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblDistribucionrecibidor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDistribucionrecibidor.setText("Recibidor");

        lblDistribucionunifrutti.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDistribucionunifrutti.setText("Unifrutti");

        jButton3.setText("Imprimir");

        jButton2.setText("Grabar");

        jButton1.setText("Eliminar");

        btnLotes.setText("Lotes");
        btnLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLotesActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDistribucionexcedentes)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblResultadonetous)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblSaldoliqus)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSaldoliqus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAnticipous)
                                        .addComponent(lblValormgus))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAnticipous, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtValormgus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtResultadonetous, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTotalgastosus)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblAnticipo)
                                                .addComponent(lblValormg, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtAnticipoparidad)
                                                .addComponent(txtValormgparidad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(lblPorcentaje)
                                        .addComponent(lblTotalventaus))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblValormgmonedaorigen)
                                        .addComponent(txtAnticipomonedaorigen)
                                        .addComponent(spnPorcentaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTotalventaus)
                                        .addComponent(txtTotalgastosus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(filler3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblSaldoliq)
                                    .addGap(52, 52, 52)
                                    .addComponent(txtSaldoliqparidad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSaldoliq, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblDistribucionrecibidor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDistribucionrecibidor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDistribucionunifrutti)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDistribucionunifrutti, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAnticipo)
                            .addComponent(txtAnticipoparidad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValormgparidad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValormg))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtAnticipomonedaorigen, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValormgmonedaorigen, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPorcentaje))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalventaus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotalventaus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalgastosus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotalgastosus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblResultadonetous)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAnticipous)
                        .addGap(18, 18, 18)
                        .addComponent(lblValormgus))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtResultadonetous, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtAnticipous, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValormgus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldoliqus)
                    .addComponent(txtSaldoliqus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSaldoliqparidad)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSaldoliq)
                        .addComponent(txtSaldoliq)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDistribucionexcedentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDistribucionunifrutti, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDistribucionrecibidor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDistribucionrecibidor)
                    .addComponent(lblDistribucionunifrutti))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnLotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        lblGastosrecibidor.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblGastosrecibidor.setText("Gastos del Recibidor");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblFechaVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblGastosrecibidor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 329, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblMonedaventa)
                        .addGap(18, 18, 18)
                        .addComponent(cbmMonedaventa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(lblParidadajustada))
                    .addComponent(lblParidadventa))
                .addGap(92, 92, 92)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtParidadajustada, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(txtParidadventa))
                .addGap(475, 475, 475))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 466, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbFechaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFechaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGastosrecibidor))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtParidadventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblParidadventa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtParidadajustada, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblParidadajustada)
                            .addComponent(cbmMonedaventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMonedaventa))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );

        lblTemporada.setEnabled(false);

        txtViaje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtViaje.setEnabled(false);
        txtViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViajeActionPerformed(evt);
            }
        });

        cmbOv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbOv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOvItemStateChanged(evt);
            }
        });

        lblOv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOv.setText("OV");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblDesTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(lblTemporada))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbRecibidor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRecibir))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNave)
                            .addComponent(cmbNave, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumeroViaje))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(cmbOv, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(lblFechaLiquidacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbFechaLiquidacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblOv))))
                .addContainerGap(786, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesTemporada)
                    .addComponent(lblTemporada))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRecibir)
                        .addComponent(lblNave))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumeroViaje)
                        .addComponent(lblOv)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbRecibidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbNave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFechaLiquidacion)
                        .addComponent(cmbOv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbFechaLiquidacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1326, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtDistribucionrecibidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistribucionrecibidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistribucionrecibidorActionPerformed

    private void txtAnticipomonedaorigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnticipomonedaorigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnticipomonedaorigenActionPerformed

    private void txtResultadonetousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadonetousActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadonetousActionPerformed

    private void txtTotalventausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalventausActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalventausActionPerformed

    private void txtAnticipoparidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnticipoparidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnticipoparidadActionPerformed

    private void cmbRecibidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRecibidorActionPerformed

    }//GEN-LAST:event_cmbRecibidorActionPerformed

    private void cmbRecibidorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRecibidorItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED){
            cmbNave.removeAllItems();

            EntidadRecibidor Recibidor = (EntidadRecibidor) cmbRecibidor.getSelectedItem();

            ModeloNave MN = new ModeloNave();
            MN.mostrarNave(cmbNave, this.lblTemporada.getText(), Recibidor.getCodigorec());

            if (Recibidor.getTemporada()!= ""){
                //CARGAR TABLA
                try{
                    DefaultTableModel modelo = new DefaultTableModel();
                    tblGastos.setModel(modelo);

                    ConexionBD cnn = new ConexionBD();
                    cnn.conectar();
                    ResultSet rs = cnn.consulta("SELECT E.KEC8DS, G.MPDSTG FROM UNIDATOS.BGASTOS1 AS B "
                        + "INNER JOIN UNIDATOS.BGASGEN1 AS E ON B.KLGJNM=E.KEGJNM "
                        + "INNER JOIN UNIDATOS.BTIPGAS1 AS G ON B.KLGJNM=G.MPGJNM and B.KLKJBB=G.MPKJBB "
                        + "WHERE B.KLCTEM='"+this.lblTemporada.getText()+"'"+" AND B.KLAARE='"+Recibidor.getCodigorec()+"'"+" ORDER BY B.KLUPNB");
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
        }
    }//GEN-LAST:event_cmbRecibidorItemStateChanged

    private void cmbNaveItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNaveItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED){
            cmbOv.removeAllItems();
            
            EntidadNave Nave = (EntidadNave) cmbNave.getSelectedItem();
            txtViaje.setText(String.valueOf(Nave.getViaje()));
            
            EntidadRecibidor Recibidor = (EntidadRecibidor) cmbRecibidor.getSelectedItem();
            ModeloOv MO = new ModeloOv();
            MO.mostrarOv(cmbOv, this.lblTemporada.getText(), Recibidor.getCodigorec(), Nave.getCorrelativo());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNaveItemStateChanged

    private void btnLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLotesActionPerformed
        EntidadRecibidor Recibidor = (EntidadRecibidor) cmbRecibidor.getSelectedItem();
        EntidadNave Nave = (EntidadNave) cmbNave.getSelectedItem();
        EntidadOv Ov = (EntidadOv) cmbOv.getSelectedItem();
        Lotes lotes = new Lotes(this.lblTemporada.getText(), Nave.getCorrelativo(), Ov.getNumeroov());
        lotes.setVisible(true);
        
        lotes.lblDesTemporada.setText(this.lblDesTemporada.getText());
        lotes.txtRecibidor.setText(Recibidor.getNombre());
        lotes.txtNave.setText(Nave.getNombrenave());
        lotes.txtViaje.setText(this.txtViaje.getText());
        
    }//GEN-LAST:event_btnLotesActionPerformed

    private void txtViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViajeActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cmbOvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOvItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOvItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLotes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbmMonedaventa;
    private datechooser.beans.DateChooserCombo cmbFechaLiquidacion;
    private datechooser.beans.DateChooserCombo cmbFechaVenta;
    private javax.swing.JComboBox<EntidadNave> cmbNave;
    private javax.swing.JComboBox<EntidadOv> cmbOv;
    private javax.swing.JComboBox<EntidadRecibidor> cmbRecibidor;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAnticipo;
    private javax.swing.JLabel lblAnticipous;
    public javax.swing.JLabel lblDesTemporada;
    private javax.swing.JLabel lblDistribucionexcedentes;
    private javax.swing.JLabel lblDistribucionrecibidor;
    private javax.swing.JLabel lblDistribucionunifrutti;
    private javax.swing.JLabel lblFechaLiquidacion;
    private javax.swing.JLabel lblFechaVenta;
    private javax.swing.JLabel lblGastosrecibidor;
    private javax.swing.JLabel lblMonedaventa;
    private javax.swing.JLabel lblNave;
    private javax.swing.JLabel lblNumeroViaje;
    private javax.swing.JLabel lblOv;
    private javax.swing.JLabel lblParidadajustada;
    private javax.swing.JLabel lblParidadventa;
    private javax.swing.JLabel lblPorcentaje;
    private javax.swing.JLabel lblRecibir;
    private javax.swing.JLabel lblResultadonetous;
    private javax.swing.JLabel lblSaldoliq;
    private javax.swing.JLabel lblSaldoliqus;
    private javax.swing.JLabel lblTemporada;
    private javax.swing.JLabel lblTotalgastosus;
    private javax.swing.JLabel lblTotalventaus;
    private javax.swing.JLabel lblValormg;
    private javax.swing.JTextField lblValormgmonedaorigen;
    private javax.swing.JLabel lblValormgus;
    private javax.swing.JSpinner spnPorcentaje;
    private javax.swing.JTable tblGastos;
    private javax.swing.JTextField txtAnticipomonedaorigen;
    private javax.swing.JTextField txtAnticipoparidad;
    private javax.swing.JTextField txtAnticipous;
    private javax.swing.JTextField txtDistribucionrecibidor;
    private javax.swing.JTextField txtDistribucionunifrutti;
    private javax.swing.JTextField txtParidadajustada;
    private javax.swing.JTextField txtParidadventa;
    private javax.swing.JTextField txtResultadonetous;
    private javax.swing.JTextField txtSaldoliq;
    private javax.swing.JTextField txtSaldoliqparidad;
    private javax.swing.JTextField txtSaldoliqus;
    private javax.swing.JTextField txtTotalgastosus;
    private javax.swing.JTextField txtTotalventaus;
    private javax.swing.JTextField txtValormgparidad;
    private javax.swing.JTextField txtValormgus;
    private javax.swing.JTextField txtViaje;
    // End of variables declaration//GEN-END:variables
}
