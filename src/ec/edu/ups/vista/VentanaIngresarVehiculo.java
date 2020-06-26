/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author NANCY
 */
public class VentanaIngresarVehiculo extends javax.swing.JInternalFrame {
    private ControladorCliente controladorCliente;
    private VentanaPrincipal ventanaPrincipal;
    private VentanaCrearCliente ventanaCrearCliente;
    /**
     * Creates new form VentanaCrearTiket
     */
    public VentanaIngresarVehiculo(ControladorCliente ctrlCliente, VentanaPrincipal ventanaPrincipal, VentanaCrearCliente ventanaCrearCliente) {
        initComponents();
        this.controladorCliente = ctrlCliente;
        this.ventanaPrincipal = ventanaPrincipal;
        this.ventanaCrearCliente= ventanaCrearCliente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumeroTiket = new javax.swing.JTextField();
        textFechaIngreso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnEmitirTiket = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroFormateado = new javax.swing.JFormattedTextField();
        btnCrearCliente = new javax.swing.JButton();
        btnGestionVhiculo = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();

        setClosable(true);
        setTitle("Registrar");
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

        jLabel4.setText("Numero de Tiket:");

        jLabel5.setText("Fecha y Hora de ingreso:");

        txtNumeroTiket.setEditable(false);
        txtNumeroTiket.setBackground(new java.awt.Color(255, 255, 204));

        textFechaIngreso.setEditable(false);
        textFechaIngreso.setBackground(new java.awt.Color(255, 255, 204));

        jLabel6.setText("Vehiculo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleciones un vehiculo---" }));

        btnEmitirTiket.setBackground(new java.awt.Color(0, 0, 0));
        btnEmitirTiket.setForeground(new java.awt.Color(0, 153, 153));
        btnEmitirTiket.setText("Emitir Tiket De Ingreso");

        jLabel1.setText("Cedula del Cliente");

        jLabel2.setText("Nombre del Cliente:");

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 204));

        jLabel3.setText("Direccion:");

        txtDireccion.setEditable(false);
        txtDireccion.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setText("Telefono:");

        txtNumeroFormateado.setEditable(false);
        txtNumeroFormateado.setBackground(new java.awt.Color(255, 255, 204));

        btnCrearCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnCrearCliente.setForeground(new java.awt.Color(0, 153, 153));
        btnCrearCliente.setText("Crear Cliente");
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });

        btnGestionVhiculo.setBackground(new java.awt.Color(0, 0, 0));
        btnGestionVhiculo.setForeground(new java.awt.Color(0, 153, 153));
        btnGestionVhiculo.setText("Gestion Vehiculo");

        btnBuscarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarCliente.setForeground(new java.awt.Color(0, 153, 153));
        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCedula)
                            .addComponent(txtNombre)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumeroTiket)
                            .addComponent(txtNumeroFormateado, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEmitirTiket)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGestionVhiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCrearCliente))
                            .addComponent(btnBuscarCliente))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNumeroFormateado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumeroTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnBuscarCliente)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmitirTiket)
                    .addComponent(btnCrearCliente)
                    .addComponent(btnGestionVhiculo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        String cedula= txtCedula.getText();
        Cliente u=controladorCliente.buscrarClientePorCedula(cedula);
        if(u!= null)
        {
            txtNombre.setText(u.getNombre());
            txtDireccion.setText(u.getDireccion());
            txtNumeroFormateado.setText(u.getTelefono());
            btnEmitirTiket.setEnabled(true);
            btnGestionVhiculo.setEnabled(true);
        }else
        {
            btnCrearCliente.setEnabled(true);
            JOptionPane.showMessageDialog(this, "NO SE A ENCONTRADO EL USUARIO CON LA CEDULA: "+ cedula);
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        btnCrearCliente.setEnabled(false);
        btnEmitirTiket.setEnabled(false);
        btnGestionVhiculo.setEnabled(false);
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
       // visibilidad de la ventana crear vehiculo
        ventanaCrearCliente.setVisible(true);
    }//GEN-LAST:event_btnCrearClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnEmitirTiket;
    private javax.swing.JButton btnGestionVhiculo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textFechaIngreso;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtNumeroFormateado;
    private javax.swing.JTextField txtNumeroTiket;
    // End of variables declaration//GEN-END:variables
}
