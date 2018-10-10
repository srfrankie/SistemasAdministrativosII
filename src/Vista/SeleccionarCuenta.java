/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observer;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * @author Frank
 */

public class SeleccionarCuenta extends javax.swing.JFrame{

    Principal padre = null;    
    int fila;
    int columna;

    /**
     * Creates new form SeleccionarCuenta
     */
    public SeleccionarCuenta() {
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

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableResultados = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seleccionar cuenta");
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Seleccione el resultado");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 790, 51));

        TableResultados.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        TableResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Tipo de cuenta", "Codigo", "Recibe Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
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
        TableResultados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TableResultados.setRowHeight(24);
        TableResultados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(TableResultados);
        if (TableResultados.getColumnModel().getColumnCount() > 0) {
            TableResultados.getColumnModel().getColumn(0).setResizable(false);
            TableResultados.getColumnModel().getColumn(0).setPreferredWidth(355);
            TableResultados.getColumnModel().getColumn(1).setResizable(false);
            TableResultados.getColumnModel().getColumn(1).setPreferredWidth(190);
            TableResultados.getColumnModel().getColumn(2).setResizable(false);
            TableResultados.getColumnModel().getColumn(2).setPreferredWidth(140);
            TableResultados.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 780, 230));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/08-cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 280, -1));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/07-acepto.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        padre.notificar(false,fila,columna);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int fila2= TableResultados.getSelectedRow();
        String numero,concepto;
        if (fila2!=-1){
            concepto = (String) TableResultados.getValueAt(fila2,0);
            numero = TableResultados.getValueAt(fila2,2).toString();
            padre.notificar(true,concepto,numero,fila,columna);
            dispose();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableResultados;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

    void cargarModeloTabla(HashMap<Integer,Object[]>mimap, Principal p,int fila2, int columna2) {
        DefaultTableModel modelo = (DefaultTableModel) TableResultados.getModel();
        modelo.getDataVector().removeAllElements();
        modelo.fireTableDataChanged();
        
        for (Object[] value : mimap.values()) {
            modelo.addRow(new Object[]{
                value[0].toString(),
                value[1].toString(),
                value[2].toString(),
                Boolean.valueOf(value[3].toString())
            });
        }
        TableResultados.setModel(modelo);
        getContentPane().repaint();
        this.padre= p;
        fila=fila2;
        columna=columna2;
    }
}
