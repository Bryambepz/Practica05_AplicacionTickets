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
import ec.edu.ups.modelo.Vehiculo;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NANCY
 */
public class VentanaIngresarVehiculo extends javax.swing.JInternalFrame {
    private Calendar fechaYHora;
    private ControladorCliente controladorCliente;
    private ControladorTiket controladorTiket;
    private ControladorVehiculo controladorVehiculo;
    private VentanaPrincipal ventanaPrincipal;
    private CrearVehiculo crearVehiculo;
    /**
     * Creates new form VentanaCrearTiket
     */
    public VentanaIngresarVehiculo(ControladorCliente ctrlCliente, VentanaPrincipal ventanaPrincipal,ControladorTiket controladorTiket,CrearVehiculo crearVehiculo,ControladorVehiculo controladorVehiculo) {
        initComponents();
        this.controladorCliente = ctrlCliente;
        this.controladorTiket= controladorTiket;
        this.controladorVehiculo=controladorVehiculo;
        this.ventanaPrincipal = ventanaPrincipal;
        this.crearVehiculo = crearVehiculo;
    }
    
    public void cargarNumero() {
        int num = controladorTiket.numeroTicket();
        String num2 = String.valueOf(num);
        txtNumeroTiket.setText(num2);
    }
//metodo para calcular la fecha y hora automaticamente 
    public void FechaYHora() {
        fechaYHora = Calendar.getInstance();
        textFechaIngreso.setText(fechaYHora.getTime().toString());

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
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumeroTiket = new javax.swing.JTextField();
        textFechaIngreso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnEmitirTiket = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroFormateado = new javax.swing.JFormattedTextField();
        btnGestionVhiculo = new javax.swing.JButton();
        txtPlacaVehiculo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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

        jLabel6.setText("Placa del Vehiculo:");

        btnEmitirTiket.setBackground(new java.awt.Color(0, 0, 0));
        btnEmitirTiket.setForeground(new java.awt.Color(0, 153, 153));
        btnEmitirTiket.setText("Emitir Ticket De Ingreso");
        btnEmitirTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmitirTiketActionPerformed(evt);
            }
        });

        jLabel1.setText("Cedula del Cliente");

        txtCedula.setEditable(false);
        txtCedula.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setText("Nombre del Cliente:");

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 204));

        jLabel3.setText("Direccion:");

        txtDireccion.setEditable(false);
        txtDireccion.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setText("Telefono:");

        txtNumeroFormateado.setEditable(false);
        txtNumeroFormateado.setBackground(new java.awt.Color(255, 255, 204));

        btnGestionVhiculo.setBackground(new java.awt.Color(0, 0, 0));
        btnGestionVhiculo.setForeground(new java.awt.Color(0, 153, 153));
        btnGestionVhiculo.setText("Gestion Vehiculo");
        btnGestionVhiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionVhiculoActionPerformed(evt);
            }
        });

        txtPlacaVehiculo.setBackground(new java.awt.Color(255, 255, 204));

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Placa", "Marca", "Modelo", "Cedula del Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVehiculosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblVehiculos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnEmitirTiket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGestionVhiculo)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNumeroTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNumeroFormateado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumeroTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                    .addComponent(jLabel6)
                    .addComponent(txtPlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmitirTiket)
                    .addComponent(btnGestionVhiculo))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
//        //metodo para cargar el numero de tikets
//        if(!crearVehiculo.getTxtPlaca().getText().equals("")){
            cargarNumero();
//        }
        FechaYHora();
        cargarDatosTablaVehiculos();

    }//GEN-LAST:event_formInternalFrameActivated

    private void btnGestionVhiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionVhiculoActionPerformed
//        if (!crearVehiculo.getTxtPlaca().getText().equals("") && !crearVehiculo.getTxtModelo().getText().equals("") ) {
//            cargarNumero();
//        }
        
        ventanaPrincipal.getDesktopPane().add(crearVehiculo);
        crearVehiculo.setVisible(true);
        
       // ventanaPrincipal.getCrearVehiculo().setVisible(true);
    }//GEN-LAST:event_btnGestionVhiculoActionPerformed

    private void tblVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVehiculosMouseClicked
        
        int filaSeleccionada = tblVehiculos.getSelectedRow();
        if (filaSeleccionada >= 0) {
            //cargarNumero();
            //limpiar();
            String cedulaCliente = tblVehiculos.getValueAt(filaSeleccionada, 3).toString();
            Cliente cliente = controladorCliente.buscrarClientePorCedula(cedulaCliente);
            cargarDatosDelCliente(cliente);
            String placa = tblVehiculos.getValueAt(filaSeleccionada, 0).toString();
            txtPlacaVehiculo.setText(placa);
            
            
        }
    }//GEN-LAST:event_tblVehiculosMouseClicked

    private void btnEmitirTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmitirTiketActionPerformed
        if(!txtCedula.getText().equals("") && !txtNombre.getText().equals("") &&!txtDireccion.getText().equals("")&&!txtNumeroFormateado.getText().equals("")&&!txtPlacaVehiculo.getText().equals(""))
        {
            Date horaEntrada = fechaYHora.getTime();
            controladorTiket.crear(Integer.valueOf(txtNumeroTiket.getText()), horaEntrada, txtPlacaVehiculo.getText());
            JOptionPane.showMessageDialog(this, "TIKET CREADO CORRECTAMENTE" + txtNumeroTiket.getText());
            //cargarNumero();
            limpiar();
            this.dispose(); 
        }else{
            JOptionPane.showMessageDialog(this, "NO SE PUEDE CREAR EL TIKET FALTA COMPLETAR INFORMACION");
        }
        
    }//GEN-LAST:event_btnEmitirTiketActionPerformed


    public void cargarDatosTablaVehiculos() {
        DefaultTableModel modelo = (DefaultTableModel) tblVehiculos.getModel();
        modelo.setRowCount(0);
        for (Cliente cliente: controladorCliente.listar()) {
            for (Vehiculo vehiculo : cliente.getListaVehiculos()) {
            Object[] rowData = {vehiculo.getPlaca(), vehiculo.getMarca(), vehiculo.getModelo(),vehiculo.getCliente(cliente.getCedula())};
            modelo.addRow(rowData);
            }
        }
        
        tblVehiculos.setModel(modelo);
    }
    
    public void cargarDatosDelCliente(Cliente cliente) {
        txtCedula.setText(cliente.getCedula());
        txtNombre.setText(cliente.getNombre());
        txtDireccion.setText(cliente.getDireccion());
        txtNumeroFormateado.setText(cliente.getTelefono());
    }
    
    public void limpiar()
    {
        txtNumeroTiket.setText("");
        textFechaIngreso.setText("");
        txtCedula.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtNumeroFormateado.setText("");
        txtPlacaVehiculo.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmitirTiket;
    private javax.swing.JButton btnGestionVhiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblVehiculos;
    private javax.swing.JTextField textFechaIngreso;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtNumeroFormateado;
    private javax.swing.JTextField txtNumeroTiket;
    private javax.swing.JTextField txtPlacaVehiculo;
    // End of variables declaration//GEN-END:variables
}
