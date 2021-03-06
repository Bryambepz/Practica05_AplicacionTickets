/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTiket;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NANCY
 */
public class VentanaListarTiketCedula extends javax.swing.JInternalFrame {

    private ControladorCliente controladorCliente;
    private ControladorVehiculo controladorVehiculo;
    private ControladorTiket controladorTiket;
    private VentanaPrincipal ventanaPrincipal;
    
    private String noExisteC;
    private String ingreseC;
    
    /**
     * Creates new form VentanaListarTiketCedula
     */
    public VentanaListarTiketCedula(ControladorCliente controladorCliente,ControladorVehiculo controladorVehiculo,ControladorTiket controladorTiket) {
        initComponents();
        this.controladorCliente=controladorCliente;
        this.controladorTiket=controladorTiket;
        this.controladorVehiculo=controladorVehiculo;
    }

    public void setNoExisteC(String noExisteC) {
        this.noExisteC = noExisteC;
    }

    public void setIngreseC(String ingreseC) {
        this.ingreseC = ingreseC;
    }

    public JButton getBtnListarTiket() {
        return btnListarTiket;
    }

    public JLabel getjCedula() {
        return jCedula;
    }

    public JLabel getjCliente() {
        return jCliente;
    }

    public JLabel getjDireccion() {
        return jDireccion;
    }

    public JLabel getjTelefono() {
        return jTelefono;
    }

    public JTable getTblTiket() {
        return tblTiket;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jCliente = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnListarTiket = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTiket = new javax.swing.JTable();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jCedula.setText("Cedula del Cliente");

        jCliente.setText("Nombre del Cliente");

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 204));

        jDireccion.setText("Direccion");

        txtDireccion.setEditable(false);
        txtDireccion.setBackground(new java.awt.Color(255, 255, 204));

        jTelefono.setText("Telefono");

        txtTelefono.setEditable(false);
        txtTelefono.setBackground(new java.awt.Color(255, 255, 204));

        btnListarTiket.setText("Listar Ticket");
        btnListarTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTiketActionPerformed(evt);
            }
        });

        tblTiket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ingreso", "Salida", "Total a Pagar", "Datos del Vehiculo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTiket);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1276, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnListarTiket)
                        .addGap(178, 178, 178)))
                .addGap(386, 386, 386))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCliente)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnListarTiket)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTiketActionPerformed
        if(!txtCedula.getText().equals(""))
        {
            Cliente cliente=controladorCliente.buscrarClientePorCedula(txtCedula.getText());
                if(cliente != null){
                txtNombre.setText(cliente.getNombre());
                txtDireccion.setText(cliente.getDireccion());
                txtTelefono.setText(cliente.getTelefono());
                cargarDatosTablaVehiculos();
            }else{
                    JOptionPane.showMessageDialog(this, noExisteC);
                }
        }else{
            JOptionPane.showMessageDialog(this, ingreseC);
        }
    }//GEN-LAST:event_btnListarTiketActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        //ventanaPrincipal.cambiarIdioma();
    }//GEN-LAST:event_formInternalFrameActivated

    public void cargarDatosTablaVehiculos() {
        DefaultTableModel modelo = (DefaultTableModel) tblTiket.getModel();
        modelo.setRowCount(0);
        for (Cliente cliente: controladorCliente.listar()) {
            for (Vehiculo vehiculo : cliente.getListaVehiculos()) {
                for (Ticket tiket : controladorTiket.buscarTiketPorVehiculo(vehiculo)) {
                Object[] rowData = {tiket.getFechaYHoraDeSalida(),tiket.getFechaYHoraDeIngreso(),tiket.getTotal(),tiket.getVehiculo()};
                modelo.addRow(rowData);
                }
            }
        }
        
        tblTiket.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListarTiket;
    private javax.swing.JLabel jCedula;
    private javax.swing.JLabel jCliente;
    private javax.swing.JLabel jDireccion;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jTelefono;
    private javax.swing.JTable tblTiket;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
