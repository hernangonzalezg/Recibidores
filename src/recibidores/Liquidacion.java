/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recibidores;

import template.MiModelo;
import Entidad.EntidadNave;
import Entidad.EntidadOv;
import Entidad.EntidadRecibidor;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import modelo.ConexionBD;
import modelo.ModeloNave;
import modelo.ModeloOv;
import modelo.ModeloRecibidor;
import java.text.DecimalFormat;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class Liquidacion extends javax.swing.JFrame {

    String CodigoTemporada;
    String Codigorec;
    String Nombre;
    public Liquidacion(String CodigoTemporada, String Codigorec, String Nombre) {
        
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
        //05-04-18 Comente por enviar Recibidor por parametro
        //ModeloRecibidor MR = new ModeloRecibidor();
        //MR.mostrarRecibidor(cmbRecibidor, this.lblTemporada.getText());   
        EntidadRecibidor Recibidor = null;
                Recibidor=new EntidadRecibidor();
                        Recibidor.setTemporada(CodigoTemporada);
                        Recibidor.setCodigorec(Codigorec);
                        Recibidor.setNombre(Nombre);
        cmbRecibidor.addItem(      
                new EntidadRecibidor(
                        Recibidor.getTemporada(),
                        Recibidor.getCodigorec(),
                        Recibidor.getNombre()
                )
        );
        //Fin de carga de Combo Recibidores
        
        //BLOQUEO DE CAJAS DE TEXTO
        //txtTotalgastosus.setEditable(false); 
        txtResultadonetous.setEditable(false);
        TotalMUC.setEnabled(false);
        totalUSTabla.setEditable(false);
        spnPorcentaje.setValue(100);
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
        cbmMonedaventa = new javax.swing.JComboBox<>();
        lblFechaVenta = new javax.swing.JLabel();
        lblMonedaventa = new javax.swing.JLabel();
        lblParidadajustada = new javax.swing.JLabel();
        lblParidadventa = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        spnPorcentaje = new javax.swing.JSpinner();
        lblAnticipo = new javax.swing.JLabel();
        lblValormg = new javax.swing.JLabel();
        lblPorcentaje = new javax.swing.JLabel();
        lblTotalventaus = new javax.swing.JLabel();
        lblTotalgastosus = new javax.swing.JLabel();
        lblResultadonetous = new javax.swing.JLabel();
        lblAnticipous = new javax.swing.JLabel();
        lblValormgus = new javax.swing.JLabel();
        lblSaldoliqus = new javax.swing.JLabel();
        lblSaldoliq = new javax.swing.JLabel();
        lblDistribucionexcedentes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGastos = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(450, 0), new java.awt.Dimension(450, 0), new java.awt.Dimension(450, 32767));
        jSeparator1 = new javax.swing.JSeparator();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(450, 0), new java.awt.Dimension(450, 0), new java.awt.Dimension(450, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(450, 0), new java.awt.Dimension(450, 0), new java.awt.Dimension(450, 32767));
        lblDistribucionrecibidor = new javax.swing.JLabel();
        lblDistribucionunifrutti = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnLotes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtAnticipoparidad = new javax.swing.JFormattedTextField();
        txtValormgparidad = new javax.swing.JFormattedTextField();
        txtSaldoliqparidad = new javax.swing.JFormattedTextField();
        txtAnticipomonedaorigen = new javax.swing.JFormattedTextField();
        lblValormgmonedaorigen = new javax.swing.JFormattedTextField();
        txtTotalventaus = new javax.swing.JFormattedTextField();
        txtTotalgastosus = new javax.swing.JFormattedTextField();
        txtResultadonetous = new javax.swing.JFormattedTextField();
        txtAnticipous = new javax.swing.JFormattedTextField();
        txtValormgus = new javax.swing.JFormattedTextField();
        txtSaldoliqus = new javax.swing.JFormattedTextField();
        txtSaldoliq = new javax.swing.JFormattedTextField();
        txtDistribucionrecibidor = new javax.swing.JFormattedTextField();
        txtDistribucionunifrutti = new javax.swing.JFormattedTextField();
        lblParidad = new javax.swing.JLabel();
        lblValormonorigen = new javax.swing.JLabel();
        TotalMUC = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        totalUSTabla = new javax.swing.JTextField();
        lblGastosrecibidor = new javax.swing.JLabel();
        cmbFechaVenta = new datechooser.beans.DateChooserCombo();
        txtParidadventa = new javax.swing.JFormattedTextField();
        txtParidadajustada = new javax.swing.JFormattedTextField();
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
        cmbNave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNaveActionPerformed(evt);
            }
        });

        lblNumeroViaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNumeroViaje.setText("Viaje");

        cbmMonedaventa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbmMonedaventa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar U.S.A.", "Euro", "Yen" }));
        cbmMonedaventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmMonedaventaActionPerformed(evt);
            }
        });

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

        lblPorcentaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPorcentaje.setText("% Distrib. Excedentes");

        lblTotalventaus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalventaus.setText("Total Ventas US$");

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
                false, false, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGastos.setRowHeight(26);
        tblGastos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblGastosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblGastos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblGastosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tblGastosFocusLost(evt);
            }
        });
        tblGastos.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                tblGastosAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        tblGastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGastosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tblGastosMouseExited(evt);
            }
        });
        tblGastos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                tblGastosComponentMoved(evt);
            }
        });
        tblGastos.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                tblGastosCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tblGastosInputMethodTextChanged(evt);
            }
        });
        tblGastos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblGastosPropertyChange(evt);
            }
        });
        tblGastos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblGastosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblGastosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblGastosKeyTyped(evt);
            }
        });
        tblGastos.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                tblGastosVetoableChange(evt);
            }
        });
        jScrollPane2.setViewportView(tblGastos);

        filler1.setBackground(new java.awt.Color(0, 0, 0));
        filler1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        filler2.setBackground(new java.awt.Color(0, 0, 0));
        filler2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        filler3.setBackground(new java.awt.Color(0, 0, 0));
        filler3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        txtAnticipoparidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtAnticipoparidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnticipoparidadActionPerformed(evt);
            }
        });
        txtAnticipoparidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnticipoparidadKeyTyped(evt);
            }
        });

        txtValormgparidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        txtSaldoliqparidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        txtAnticipomonedaorigen.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        lblValormgmonedaorigen.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        txtTotalventaus.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtTotalventaus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalventausActionPerformed(evt);
            }
        });

        txtTotalgastosus.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        txtResultadonetous.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtResultadonetous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtResultadonetousMouseClicked(evt);
            }
        });

        txtAnticipous.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        txtValormgus.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        txtSaldoliqus.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        txtSaldoliq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        txtDistribucionrecibidor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        txtDistribucionunifrutti.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        lblParidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblParidad.setText("Paridad");

        lblValormonorigen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblValormonorigen.setText("Valor Mon. Origena");

        TotalMUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalMUCActionPerformed(evt);
            }
        });

        jTextField2.setText("Totales");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        totalUSTabla.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                totalUSTablaComponentAdded(evt);
            }
        });
        totalUSTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalUSTablaActionPerformed(evt);
            }
        });
        totalUSTabla.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                totalUSTablaPropertyChange(evt);
            }
        });
        totalUSTabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                totalUSTablaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(TotalMUC, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(totalUSTabla))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDistribucionexcedentes)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTotalgastosus)
                                        .addComponent(lblPorcentaje)
                                        .addComponent(lblTotalventaus)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblAnticipo)
                                                .addComponent(lblValormg, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGap(59, 59, 59)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtValormgparidad, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtAnticipoparidad, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblParidad))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spnPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblValormgmonedaorigen, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtAnticipomonedaorigen, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .addComponent(lblValormonorigen)
                                                    .addGap(22, 22, 22))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTotalgastosus, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtTotalventaus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(filler3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAnticipous)
                                        .addComponent(lblValormgus)
                                        .addComponent(lblResultadonetous))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAnticipous, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtValormgus)
                                        .addComponent(txtResultadonetous, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblSaldoliq)
                                            .addGap(40, 40, 40)
                                            .addComponent(txtSaldoliqparidad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblSaldoliqus))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtSaldoliqus, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSaldoliq, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblDistribucionrecibidor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDistribucionrecibidor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDistribucionunifrutti)
                                .addGap(18, 18, 18)
                                .addComponent(txtDistribucionunifrutti, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TotalMUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalUSTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblParidad, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblValormonorigen, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtAnticipomonedaorigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(lblValormgmonedaorigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtAnticipoparidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblAnticipo))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblValormg)
                                            .addComponent(txtValormgparidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spnPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPorcentaje))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTotalventaus)
                                    .addComponent(txtTotalventaus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTotalgastosus)
                                    .addComponent(txtTotalgastosus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblResultadonetous)
                                            .addComponent(txtResultadonetous, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblAnticipous))
                                    .addComponent(txtAnticipous, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblValormgus)
                                    .addComponent(txtValormgus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSaldoliqus)
                                    .addComponent(txtSaldoliqus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSaldoliq)
                                    .addComponent(txtSaldoliqparidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSaldoliq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDistribucionexcedentes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDistribucionrecibidor)
                                    .addComponent(lblDistribucionunifrutti)
                                    .addComponent(txtDistribucionrecibidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDistribucionunifrutti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
        );

        lblGastosrecibidor.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblGastosrecibidor.setText("Gastos del Recibidor");

        txtParidadventa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtParidadventa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtParidadventaFocusLost(evt);
            }
        });
        txtParidadventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParidadventaActionPerformed(evt);
            }
        });

        txtParidadajustada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtParidadajustada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtParidadajustadaFocusLost(evt);
            }
        });
        txtParidadajustada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParidadajustadaActionPerformed(evt);
            }
        });
        txtParidadajustada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtParidadajustadaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtParidadajustadaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtParidadajustadaKeyTyped(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 332, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblMonedaventa)
                        .addGap(18, 18, 18)
                        .addComponent(cbmMonedaventa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(lblParidadajustada))
                    .addComponent(lblParidadventa))
                .addGap(92, 92, 92)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtParidadventa)
                    .addComponent(txtParidadajustada, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
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
                            .addComponent(cmbFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lblFechaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGastosrecibidor))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblParidadventa)
                            .addComponent(txtParidadventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblParidadajustada)
                                .addComponent(cbmMonedaventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMonedaventa))
                            .addComponent(txtParidadajustada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
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
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRecibir)
                        .addComponent(lblNave))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroViaje)
                            .addComponent(lblOv))))
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
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 728, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
                    MiModelo modelo = new MiModelo();
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
                                tblGastos.getColumnModel().getColumn(0).setPreferredWidth(50);                                
                                tblGastos.getColumnModel().getColumn(1).setPreferredWidth(180);
                                tblGastos.getColumnModel().getColumn(2).setPreferredWidth(10);   
                                tblGastos.getColumnModel().getColumn(3).setPreferredWidth(10);   
                                tblGastos.getColumnModel().getColumn(4).setPreferredWidth(10);
                                tblGastos.getColumnModel().getColumn(5).setPreferredWidth(10);                                   
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
        lotes.txfResultadonetous.setText(this.txtResultadonetous.getText());
        
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

    private void txtAnticipoparidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnticipoparidadActionPerformed
        
    }//GEN-LAST:event_txtAnticipoparidadActionPerformed

    private void txtAnticipoparidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnticipoparidadKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9') && (car<',' || car>'.')) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnticipoparidadKeyTyped

    private void txtParidadventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParidadventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParidadventaActionPerformed

    private void txtResultadonetousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtResultadonetousMouseClicked
        //calculoVentaGasto();
        
    }//GEN-LAST:event_txtResultadonetousMouseClicked

    private void tblGastosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblGastosKeyReleased
        multiploMUC();
    
    }//GEN-LAST:event_tblGastosKeyReleased

    private void tblGastosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGastosMouseClicked
        /*int fila = tblGastos.rowAtPoint(evt.getPoint());
        int columna = tblGastos.columnAtPoint(evt.getPoint());
        if (fila > -1){
            String valor = String.valueOf(tblGastos.getValueAt(fila, columna)).replace(" ", "");
            txtTotalventaus.setText(valor);
        }*/
    }//GEN-LAST:event_tblGastosMouseClicked

    private void tblGastosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblGastosKeyTyped
        //multiploMUC();
    }//GEN-LAST:event_tblGastosKeyTyped

    private void tblGastosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblGastosFocusGained
        
    }//GEN-LAST:event_tblGastosFocusGained

    private void cbmMonedaventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmMonedaventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmMonedaventaActionPerformed

    private void cmbNaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNaveActionPerformed

    private void tblGastosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblGastosKeyPressed
        //calculoGlobal();
        //multiploMUC();
    }//GEN-LAST:event_tblGastosKeyPressed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void TotalMUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalMUCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalMUCActionPerformed
    
    private void txtTotalventausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalventausActionPerformed
        //multiploMUC();
    }//GEN-LAST:event_txtTotalventausActionPerformed

    private void totalUSTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalUSTablaActionPerformed
        String memoria=totalUSTabla.getText();
        if (!memoria.equals(totalUSTabla.getText())){
         javax.swing.JOptionPane panel=null;
         panel.showMessageDialog(null,"ha cambiado el texto");
       
       }
    }//GEN-LAST:event_totalUSTablaActionPerformed

    private void txtParidadajustadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParidadajustadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParidadajustadaActionPerformed

    private void txtParidadventaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtParidadventaFocusLost
        //calculoGlobal();
    }//GEN-LAST:event_txtParidadventaFocusLost

    private void txtParidadajustadaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParidadajustadaKeyPressed
        
    }//GEN-LAST:event_txtParidadajustadaKeyPressed

    private void txtParidadajustadaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParidadajustadaKeyTyped
       
    }//GEN-LAST:event_txtParidadajustadaKeyTyped

    private void txtParidadajustadaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParidadajustadaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParidadajustadaKeyReleased

    private void txtParidadajustadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtParidadajustadaFocusLost
         setearParidad();
         
    }//GEN-LAST:event_txtParidadajustadaFocusLost

    private void tblGastosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblGastosFocusLost
        //multiploMUC();
    }//GEN-LAST:event_tblGastosFocusLost

    private void tblGastosInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tblGastosInputMethodTextChanged
        
    }//GEN-LAST:event_tblGastosInputMethodTextChanged

    private void tblGastosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblGastosPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGastosPropertyChange

    private void tblGastosCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tblGastosCaretPositionChanged
        //multiploMUC();
    }//GEN-LAST:event_tblGastosCaretPositionChanged

    private void tblGastosComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblGastosComponentMoved
    }//GEN-LAST:event_tblGastosComponentMoved

    private void tblGastosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGastosMouseExited
        
    }//GEN-LAST:event_tblGastosMouseExited

    private void tblGastosAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_tblGastosAncestorMoved
        //multiploMUC();
    }//GEN-LAST:event_tblGastosAncestorMoved

    private void tblGastosVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_tblGastosVetoableChange
        
    }//GEN-LAST:event_tblGastosVetoableChange

    private void tblGastosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblGastosAncestorAdded
        multiploMUC();
    }//GEN-LAST:event_tblGastosAncestorAdded

    private void totalUSTablaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalUSTablaKeyReleased

    }//GEN-LAST:event_totalUSTablaKeyReleased

    private void totalUSTablaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_totalUSTablaPropertyChange

    }//GEN-LAST:event_totalUSTablaPropertyChange

    private void totalUSTablaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_totalUSTablaComponentAdded
        
    }//GEN-LAST:event_totalUSTablaComponentAdded
    
    private void calculoGlobal(){
        //calculoVentaGasto();
        /*multiploMUC();
        calculototalUSyMuc();
        */
        
    }
    private void setearParidad(){
        for(int i=0; i<tblGastos.getRowCount();i++){
            tblGastos.getModel().setValueAt(txtParidadajustada.getText(), i, 3);
        }
    }
    private void calculoVentaGasto(){
        
        if(!"".equals(txtTotalventaus.getText()) && !"".equals(txtTotalgastosus.getText())){
            
            String valorVenta = txtTotalventaus.getText().replace(".", "");
            String valorGatos = txtTotalgastosus.getText().replace(".", "");
            int sumatoria = Integer.parseInt(valorVenta)-Integer.parseInt(valorGatos);
           
            DecimalFormat formatea = new DecimalFormat("###,###.##");
            String calculo = String.valueOf(formatea.format(sumatoria));
            txtResultadonetous.setText(calculo);
        }
    }
    private void multiploMUC(){
        int total=0;
        int totalMUC=0;
        int totalUS=0;
        String montoMUC="";
        String paridad="";
        for(int i=0; i<tblGastos.getRowCount();i++){
            try{
                if(!tblGastos.getModel().getValueAt(i, 2).toString().equals("")){
                    montoMUC = tblGastos.getModel().getValueAt(i, 2).toString();
                    paridad = tblGastos.getModel().getValueAt(i, 3).toString();
                    total = (Integer.parseInt(montoMUC))*(Integer.parseInt(paridad));
                    tblGastos.getModel().setValueAt(total, i, 4);
                    totalMUC = Integer.parseInt(tblGastos.getModel().getValueAt(i, 2).toString())+totalMUC;
                    TotalMUC.setText(String.valueOf(totalMUC));
                    if(!tblGastos.getModel().getValueAt(i, 4).toString().equals("")){
                        totalUS = Integer.parseInt(tblGastos.getModel().getValueAt(i, 4).toString())+totalUS;
                        totalUSTabla.setText(String.valueOf(totalUS));
                    }
                    
                }
                txtTotalgastosus.setText(totalUSTabla.getText());
                sumaTotales();
            }catch(Exception e){
            }
        TotalMUC.setText(String.valueOf(totalMUC));
        }
    }
    private void sumaTotales(){
        
        if(txtTotalventaus.getText()!=null && txtTotalgastosus.getText()!=null){
            String Totalventaus = txtTotalventaus.getText().replace(".", "");
            String Totalgastosus = txtTotalgastosus.getText().replace(".", "");
            /*javax.swing.JOptionPane panel=null;
            panel.showMessageDialog(null,"Calculo");*/
            int total = ((Integer.parseInt(Totalventaus))-(Integer.parseInt(Totalgastosus)));
            txtResultadonetous.setText(String.valueOf(total));
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TotalMUC;
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
    private javax.swing.JTextField jTextField2;
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
    private javax.swing.JLabel lblParidad;
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
    private javax.swing.JFormattedTextField lblValormgmonedaorigen;
    private javax.swing.JLabel lblValormgus;
    private javax.swing.JLabel lblValormonorigen;
    private javax.swing.JSpinner spnPorcentaje;
    private javax.swing.JTable tblGastos;
    private javax.swing.JTextField totalUSTabla;
    private javax.swing.JFormattedTextField txtAnticipomonedaorigen;
    private javax.swing.JFormattedTextField txtAnticipoparidad;
    private javax.swing.JFormattedTextField txtAnticipous;
    private javax.swing.JFormattedTextField txtDistribucionrecibidor;
    private javax.swing.JFormattedTextField txtDistribucionunifrutti;
    private javax.swing.JFormattedTextField txtParidadajustada;
    private javax.swing.JFormattedTextField txtParidadventa;
    private javax.swing.JFormattedTextField txtResultadonetous;
    private javax.swing.JFormattedTextField txtSaldoliq;
    private javax.swing.JFormattedTextField txtSaldoliqparidad;
    private javax.swing.JFormattedTextField txtSaldoliqus;
    private javax.swing.JFormattedTextField txtTotalgastosus;
    private javax.swing.JFormattedTextField txtTotalventaus;
    private javax.swing.JFormattedTextField txtValormgparidad;
    private javax.swing.JFormattedTextField txtValormgus;
    private javax.swing.JTextField txtViaje;
    // End of variables declaration//GEN-END:variables
}
