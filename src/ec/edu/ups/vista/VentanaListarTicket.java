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
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NANCY
 */
public class VentanaListarTicket extends javax.swing.JInternalFrame {

    private ControladorCliente controladorCliente;
    private ControladorVehiculo controladorVehiculo;
    private ControladorTiket controladorTiket;
    private VentanaPrincipal ventanaPrincipal;
    
    private String noExisteV;
    private String ingrese;
    /**
     * Creates new form VentanaListarTicket
     */
    public VentanaListarTicket(ControladorCliente controladorCliente,ControladorVehiculo controladorVehiculo,ControladorTiket controladorTiket) {
        initComponents();
        this.controladorCliente=controladorCliente;
        this.controladorTiket=controladorTiket;
        this.controladorVehiculo=controladorVehiculo;
    }

    public void setNoExisteV(String noExisteV) {
        this.noExisteV = noExisteV;
    }

    public void setIngrese(String ingrese) {
        this.ingrese = ingrese;
    }

    public JButton getBtnListar() {
        return btnListar;
    }

    public JLabel getjCedula() {
        return jCedula;
    }

    public JLabel getjDireccion() {
        return jDireccion;
    }

    public JLabel getjMarca() {
        return jMarca;
    }

    public JLabel getjModelo() {
        return jModelo;
    }

    public JLabel getjNombre() {
        return jNombre;
    }

    public JLabel getjPlacaV() {
        return jPlacaV;
    }

    public JLabel getjTelefono() {
        return jTelefono;
    }

    public JTable getTblTickets() {
        return tblTickets;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTickets = new javax.swing.JTable();
        jCedula = new javax.swing.JLabel();
        jPlacaV = new javax.swing.JLabel();
        jNombre = new javax.swing.JLabel();
        jDireccion = new javax.swing.JLabel();
        jTelefono = new javax.swing.JLabel();
        jMarca = new javax.swing.JLabel();
        jModelo = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        btnListar = new javax.swing.JButton();

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

        tblTickets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                " Ingreso", "Salida", "Total a Pagar "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTickets);

        jCedula.setText("Cedula del Cliente:");

        jPlacaV.setText("Placa del Vehiculo");

        jNombre.setText("Nombre del Cliente");

        jDireccion.setText("Direccion");

        jTelefono.setText("Telefono");

        jMarca.setText("Marca");

        jModelo.setText("Modelo");

        txtCedula.setEditable(false);
        txtCedula.setBackground(new java.awt.Color(255, 255, 204));

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 204));

        txtDireccion.setEditable(false);
        txtDireccion.setBackground(new java.awt.Color(255, 255, 204));

        txtTelefono.setEditable(false);
        txtTelefono.setBackground(new java.awt.Color(255, 255, 204));

        txtMarca.setEditable(false);
        txtMarca.setBackground(new java.awt.Color(255, 255, 204));

        txtModelo.setEditable(false);
        txtModelo.setBackground(new java.awt.Color(255, 255, 204));

        btnListar.setText("Listar Tickets");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(jDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jCedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPlacaV, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(txtDireccion)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtMarca)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPlacaV)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNombre)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnListar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        if(!txtPlaca.getText().equals(""))
        {
           
            Vehiculo vehiculo= controladorVehiculo.buscar(txtPlaca.getText());
            if(vehiculo != null){
                Cliente cliente= controladorCliente.buscarPorVehiculo(txtPlaca.getText());
                txtCedula.setText(cliente.getCedula());
                txtNombre.setText(cliente.getNombre());
                txtDireccion.setText(cliente.getDireccion());
                txtTelefono.setText(cliente.getTelefono());
                txtMarca.setText(vehiculo.getMarca());
                txtModelo.setText(vehiculo.getModelo());
                cargarDatosTablaVehiculos(controladorTiket.buscarTiketPorVehiculo(vehiculo));
            }else{
                JOptionPane.showMessageDialog(this, noExisteV);
            }
        }else{
            JOptionPane.showMessageDialog(this, ingrese);
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
//        ventanaPrincipal.cambiarIdioma();
    }//GEN-LAST:event_formInternalFrameActivated

    public void cargarDatosTablaVehiculos(List<Ticket> lista) {
        DefaultTableModel modelo = (DefaultTableModel) tblTickets.getModel();
        modelo.setRowCount(0);
        for (Ticket tiket : lista) {
            Object[] rowData = {tiket.getFechaYHoraDeSalida(),tiket.getFechaYHoraDeIngreso(),tiket.getTotal()};
            modelo.addRow(rowData);
        }
        
        
        tblTickets.setModel(modelo);
    }
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jCedula;
    private javax.swing.JLabel jDireccion;
    private javax.swing.JLabel jMarca;
    private javax.swing.JLabel jModelo;
    private javax.swing.JLabel jNombre;
    private javax.swing.JLabel jPlacaV;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTelefono;
    private javax.swing.JTable tblTickets;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
