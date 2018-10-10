/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.security.KeyStore;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.KeyCode;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.KeyStroke;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;
import modelo.ConexionDB;

/**
 *
 * @author Frank
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicio = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAsiento = new javax.swing.JButton();
        btnCuenta = new javax.swing.JButton();
        btnMayores = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Cuentas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCuentas = new javax.swing.JTable();
        btnVolverCuentas = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        Asientos = new javax.swing.JPanel();
        scrollpaneAsientosPrevios = new javax.swing.JScrollPane();
        TableAsientosPrevios = new javax.swing.JTable();
        scrollpaneAsientoNuevo = new javax.swing.JScrollPane();
        TableAsientoNuevo = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblNuevoAsiento = new javax.swing.JLabel();
        lblHasta = new javax.swing.JLabel();
        lblAsiento1 = new javax.swing.JLabel();
        lblfiltrar = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        dateDesde = new datechooser.beans.DateChooserCombo();
        dateHasta = new datechooser.beans.DateChooserCombo();
        btnBorrarFIlaAsiento = new javax.swing.JButton();
        btnAgregarFilaAsiento = new javax.swing.JButton();
        Mayores = new javax.swing.JPanel();
        btnVolver1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistemas Administrativos II");
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setName("VentanaPrincipal"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Asiento");
        inicio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 97, 23));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cuentas");
        inicio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 97, 30));

        btnAsiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/01-asiento.png"))); // NOI18N
        btnAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsientoActionPerformed(evt);
            }
        });
        inicio.add(btnAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 102, 81));

        btnCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/02-cuentas.png"))); // NOI18N
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });
        inicio.add(btnCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, -1, 80));

        btnMayores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/03-mayores.png"))); // NOI18N
        btnMayores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayoresActionPerformed(evt);
            }
        });
        inicio.add(btnMayores, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, -1, 81));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Mayores");
        inicio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 97, 23));

        getContentPane().add(inicio, "inicio");

        Cuentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cuentas");
        jLabel1.setToolTipText("");
        Cuentas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 1150, 60));

        TableCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Numero", "Nombre", "Saldo", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableCuentas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TableCuentas.setColumnSelectionAllowed(true);
        TableCuentas.setRowHeight(24);
        jScrollPane1.setViewportView(TableCuentas);
        TableCuentas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (TableCuentas.getColumnModel().getColumnCount() > 0) {
            TableCuentas.getColumnModel().getColumn(0).setResizable(false);
            TableCuentas.getColumnModel().getColumn(0).setPreferredWidth(280);
            TableCuentas.getColumnModel().getColumn(1).setResizable(false);
            TableCuentas.getColumnModel().getColumn(1).setPreferredWidth(590);
            TableCuentas.getColumnModel().getColumn(2).setResizable(false);
            TableCuentas.getColumnModel().getColumn(2).setPreferredWidth(65);
            TableCuentas.getColumnModel().getColumn(3).setResizable(false);
            TableCuentas.getColumnModel().getColumn(3).setPreferredWidth(315);
        }

        Cuentas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1270, 610));

        btnVolverCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/06-back.png"))); // NOI18N
        btnVolverCuentas.setText("Volver");
        btnVolverCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverCuentasActionPerformed(evt);
            }
        });
        Cuentas.add(btnVolverCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 50));
        Cuentas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1260, 10));

        getContentPane().add(Cuentas, "cuentas");

        Asientos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableAsientosPrevios.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TableAsientosPrevios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Cod", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableAsientosPrevios.setAutoscrolls(false);
        TableAsientosPrevios.setRowHeight(24);
        scrollpaneAsientosPrevios.setViewportView(TableAsientosPrevios);

        Asientos.add(scrollpaneAsientosPrevios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 460, 510));

        TableAsientoNuevo.setAutoCreateRowSorter(true);
        TableAsientoNuevo.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, 0, 0}
            },
            new String [] {
                "Nro Cuenta", "Concepto", "Debe", "Haber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableAsientoNuevo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TableAsientoNuevo.setColumnSelectionAllowed(true);
        TableAsientoNuevo.setRowHeight(24);
        TableAsientoNuevo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TableAsientoNuevoFocusLost(evt);
            }
        });
        TableAsientoNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableAsientoNuevoMouseClicked(evt);
            }
        });
        TableAsientoNuevo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TableAsientoNuevoPropertyChange(evt);
            }
        });
        TableAsientoNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TableAsientoNuevoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableAsientoNuevoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TableAsientoNuevoKeyTyped(evt);
            }
        });
        scrollpaneAsientoNuevo.setViewportView(TableAsientoNuevo);
        TableAsientoNuevo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TableAsientoNuevo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TableAsientoNuevo.setRowSelectionAllowed(false);
        TableAsientoNuevo.setColumnSelectionAllowed(false);
        TableAsientoNuevo.getColumnModel().getColumn(0).setPreferredWidth(90);
        TableAsientoNuevo.getColumnModel().getColumn(1).setPreferredWidth(400);
        TableAsientoNuevo.getColumnModel().getColumn(2).setPreferredWidth(100);
        TableAsientoNuevo.getColumnModel().getColumn(3).setPreferredWidth(100);

        Asientos.add(scrollpaneAsientoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 710, 570));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Asientos.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 10, 10, 680));

        lblNuevoAsiento.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNuevoAsiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuevoAsiento.setText("Nuevo asiento");
        Asientos.add(lblNuevoAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 760, 30));

        lblHasta.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblHasta.setText("hasta:");
        lblHasta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Asientos.add(lblHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 50, 30));

        lblAsiento1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblAsiento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAsiento1.setText("Asientos previos");
        Asientos.add(lblAsiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 220, 50));

        lblfiltrar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblfiltrar.setText("Filtrar desde:");
        lblfiltrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Asientos.add(lblfiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 30));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/06-back.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        Asientos.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 50));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/08-cancel.png"))); // NOI18N
        btnBorrar.setText("Vaciar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        Asientos.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 640, 270, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/07-acepto.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        Asientos.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, 430, -1));

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        Asientos.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 460, 40));

        dateDesde.setCalendarPreferredSize(new java.awt.Dimension(350, 280));
        dateDesde.setNothingAllowed(false);
        dateDesde.setFieldFont(new java.awt.Font("Roboto", java.awt.Font.PLAIN, 18));
        dateDesde.setNavigateFont(new java.awt.Font("Roboto", java.awt.Font.PLAIN, 14));
        dateDesde.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
        Asientos.add(dateDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 140, 30));

        dateHasta.setCalendarPreferredSize(new java.awt.Dimension(350, 280));
        dateHasta.setNothingAllowed(false);
        try {
            dateHasta.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
        } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
            e1.printStackTrace();
        }
        dateHasta.setFieldFont(new java.awt.Font("Roboto", java.awt.Font.PLAIN, 18));
        dateHasta.setNavigateFont(new java.awt.Font("Roboto", java.awt.Font.PLAIN, 14));
        Asientos.add(dateHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 140, 30));

        btnBorrarFIlaAsiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/12-papelera.png"))); // NOI18N
        btnBorrarFIlaAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarFIlaAsientoActionPerformed(evt);
            }
        });
        Asientos.add(btnBorrarFIlaAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 180, -1, 40));
        btnBorrarFIlaAsiento.setEnabled(false);

        btnAgregarFilaAsiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/13-fila.png"))); // NOI18N
        btnAgregarFilaAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFilaAsientoActionPerformed(evt);
            }
        });
        Asientos.add(btnAgregarFilaAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 230, -1, 40));

        getContentPane().add(Asientos, "asientos");

        Mayores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/06-back.png"))); // NOI18N
        btnVolver1.setText("Volver");
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });
        Mayores.add(btnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 50));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mayores");
        Mayores.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 1140, 60));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Hasta:");
        Mayores.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 70, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Se prepara un informe en formato pdf que muestre el estado de las cuentas seleccionadas en el periodo seleccionado.");
        Mayores.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1250, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setText("Filtrar desde:");
        Mayores.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 30));

        dateChooserCombo1.setCalendarPreferredSize(new java.awt.Dimension(350, 280));
        dateChooserCombo1.setNothingAllowed(false);
        dateChooserCombo1.setFieldFont(new java.awt.Font("Roboto", java.awt.Font.PLAIN, 14));
        Mayores.add(dateChooserCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, 30));

        dateChooserCombo2.setCalendarPreferredSize(new java.awt.Dimension(350, 280));
        dateChooserCombo2.setNothingAllowed(false);
        dateChooserCombo2.setFieldFont(new java.awt.Font("Roboto", java.awt.Font.PLAIN, 14));
        Mayores.add(dateChooserCombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Cuenta", "Mayor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        Mayores.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1250, 450));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/11-pdf.png"))); // NOI18N
        jButton1.setText(" Generar PDF");
        Mayores.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 640, -1, -1));

        getContentPane().add(Mayores, "mayores");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnMayoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayoresActionPerformed
        // TODO add your handling code here:
        CardLayout c = (CardLayout)getContentPane().getLayout();
        c.show(getContentPane(), "mayores");
    }//GEN-LAST:event_btnMayoresActionPerformed

    private void btnVolverCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverCuentasActionPerformed
        // TODO add your handling code here:
        CardLayout c = (CardLayout)getContentPane().getLayout();
        c.show(getContentPane(), "inicio");
    }//GEN-LAST:event_btnVolverCuentasActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        try {
            Date desde = dateDesde.getSelectedDate().getTime();
            Date hasta = dateHasta.getSelectedDate().getTime();
            
            java.text.SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = format1.format(desde);
            String date2 = format1.format(hasta);
             if (desde.before(hasta)){
                System.err.println("Desde: "+date1+" hasta:"+date2); 
             }else{
                 System.err.println("Las fechas son incorrectas");
             }
        } catch (Exception e) {
            e.printStackTrace();
            //TODO generar dialog con error
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        CardLayout c = (CardLayout)getContentPane().getLayout();
           c.show(getContentPane(), "inicio");
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        // TODO add your handling code here:
        CardLayout c = (CardLayout)getContentPane().getLayout();
           c.show(getContentPane(), "inicio");
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void btnAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsientoActionPerformed
           CardLayout c = (CardLayout)getContentPane().getLayout();
           c.show(getContentPane(), "asientos");
    }//GEN-LAST:event_btnAsientoActionPerformed

    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed
        CardLayout c = (CardLayout)getContentPane().getLayout();
        c.show(getContentPane(), "cuentas");
        llenarCuentas();
    }//GEN-LAST:event_btnCuentaActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        DefaultTableModel dm = (DefaultTableModel)TableAsientoNuevo.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
        //Esto es una negrada pero anda
        btnAgregarFilaAsientoActionPerformed(new ActionEvent(this,
              ActionEvent.ACTION_PERFORMED, "Hola"));
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnAgregarFilaAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFilaAsientoActionPerformed
        DefaultTableModel tm = (DefaultTableModel) TableAsientoNuevo.getModel();
        tm.addRow(new Object[]{null,null,0,0});
        TableAsientoNuevo.setModel(tm);
        Asientos.repaint();
    }//GEN-LAST:event_btnAgregarFilaAsientoActionPerformed

    
    private void btnBorrarFIlaAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarFIlaAsientoActionPerformed
        int fila = TableAsientoNuevo.getSelectedRow();
        if (TableAsientoNuevo.getRowCount()>1 && fila!=-1){   
            DefaultTableModel tm = (DefaultTableModel) TableAsientoNuevo.getModel();
            tm.removeRow(fila);
            TableAsientoNuevo.setModel(tm);
            Asientos.repaint();
        }
    }//GEN-LAST:event_btnBorrarFIlaAsientoActionPerformed

    private void TableAsientoNuevoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableAsientoNuevoKeyTyped
        // TODO add your handling code here:
        int fila = TableAsientoNuevo.getSelectedRow();
        int columna = TableAsientoNuevo.getSelectedColumn();
        TableModel modelo = TableAsientoNuevo.getModel();
        switch(columna){
            case 2:
                modelo.setValueAt(0,fila,3);
                break;
            case 3:
                modelo.setValueAt(0, fila, 2);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_TableAsientoNuevoKeyTyped

    private void TableAsientoNuevoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableAsientoNuevoKeyPressed
        KeyStroke k = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0);
        if (k.getKeyCode()==evt.getKeyCode()){
            if (TableAsientoNuevo.getSelectedRow() == TableAsientoNuevo.getRowCount()-1){
                DefaultTableModel tm = (DefaultTableModel) TableAsientoNuevo.getModel();
                tm.addRow(new Object[]{null,null,0,0});
                TableAsientoNuevo.setModel(tm);
                Asientos.repaint();
            }
        }        
    }//GEN-LAST:event_TableAsientoNuevoKeyPressed

    private void TableAsientoNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableAsientoNuevoMouseClicked
        int fila = TableAsientoNuevo.getSelectedRow();
        if (fila != -1){
            btnBorrarFIlaAsiento.setEnabled(true);
        }else{
            btnBorrarFIlaAsiento.setEnabled(false);
        }
    }//GEN-LAST:event_TableAsientoNuevoMouseClicked

    private void TableAsientoNuevoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TableAsientoNuevoFocusLost
    }//GEN-LAST:event_TableAsientoNuevoFocusLost

    private void TableAsientoNuevoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableAsientoNuevoKeyReleased
        KeyStroke k = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0);
        String dato;
        if (TableAsientoNuevo.getSelectedColumn()==0 && k.getKeyCode()==evt.getKeyCode()){
            int index;
            if (TableAsientoNuevo.getSelectedRow()==0)
                index=0;
            else
                index=TableAsientoNuevo.getSelectedRow()-1;
            dato=(String) TableAsientoNuevo.getValueAt(index,0);
            obtenerCuentaDe(dato);
        }
    }//GEN-LAST:event_TableAsientoNuevoKeyReleased

    private void TableAsientoNuevoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TableAsientoNuevoPropertyChange
        
    }//GEN-LAST:event_TableAsientoNuevoPropertyChange

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Asientos;
    private javax.swing.JPanel Cuentas;
    private javax.swing.JPanel Mayores;
    private javax.swing.JTable TableAsientoNuevo;
    private javax.swing.JTable TableAsientosPrevios;
    private javax.swing.JTable TableCuentas;
    private javax.swing.JButton btnAgregarFilaAsiento;
    private javax.swing.JButton btnAsiento;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrarFIlaAsiento;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMayores;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JButton btnVolverCuentas;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private datechooser.beans.DateChooserCombo dateDesde;
    private datechooser.beans.DateChooserCombo dateHasta;
    private javax.swing.JPanel inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblAsiento1;
    private javax.swing.JLabel lblHasta;
    private javax.swing.JLabel lblNuevoAsiento;
    private javax.swing.JLabel lblfiltrar;
    private javax.swing.JScrollPane scrollpaneAsientoNuevo;
    private javax.swing.JScrollPane scrollpaneAsientosPrevios;
    // End of variables declaration//GEN-END:variables

    private void llenarCuentas() {
        ResultSet rs;
        try {
            ConexionDB conn = new ConexionDB();
            conn.connect();
            rs = conn.todasLasCuentas();
            DefaultTableModel tm = (DefaultTableModel) TableCuentas.getModel();
            tm.getDataVector().removeAllElements();
            tm.fireTableDataChanged();
            while (rs.next()) {
                tm.addRow(new Object[]{
                    rs.getString("codigoCS"),
                    rs.getString("nombre"),
                    rs.getBoolean("recibeSaldo"),
                    rs.getString("tipo")}
                );
            }
            conn.close();
            TableCuentas.setModel(tm);
            Cuentas.repaint();            
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Algo salio mal, problema con la BD");
        }
    }

    private void obtenerCuentaDe(String tf) {
        String dato = tf.trim();
        HashMap<Integer,Object[]> miMapa = new HashMap<>();
        int numero = 0;
        int fila, columna;
        fila = TableAsientoNuevo.getSelectedRow()-1;
        columna= TableAsientoNuevo.getSelectedColumn();
        ResultSet rs;
        boolean empty=true;
        try {
            ConexionDB cn = new ConexionDB();
            cn.connect();
            if (isNumeric(dato) == true) {
                numero = Integer.parseInt(dato);
                rs=cn.buscarCuentasPor(numero);
            } else {
                rs=cn.buscarCuentasPor(dato);
            }
            while(rs.next()){
                empty=false;
                //hashMap.put(1, "One");
                miMapa.put(rs.getRow(),new Object[]{
                    rs.getString("nombre"),
                    rs.getString("tipo"),
                    rs.getString("codigoCS"),
                    rs.getBoolean("recibeSaldo")
                });
            }
            if (empty){
                System.err.println("Disparar Dialog de 'sin resultados' ");
            }else{
                SeleccionarCuenta sc = new SeleccionarCuenta();
                sc.setAlwaysOnTop(true);
                sc.cargarModeloTabla(miMapa,this,fila,columna);
                sc.setVisible(true);
            }
        } catch (Exception e) {
            
        }
    }
    
    public static boolean isNumeric(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }

    void notificar(boolean b, int fila, int columna) {
        TableAsientoNuevo.setValueAt(null,fila,columna);
        System.err.println("Volvio con false");
    }

    void notificar(boolean b, String concepto, String codigo, int fila, int columna) {
        TableAsientoNuevo.setValueAt(codigo, fila, columna);
        TableAsientoNuevo.setValueAt(concepto, fila, columna+1);
        System.err.println("Volvio con true");
    }
}
