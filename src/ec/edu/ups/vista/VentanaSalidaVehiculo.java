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
//import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
//import javafx.util.converter.LocalDateTimeStringConverter;
import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class VentanaSalidaVehiculo extends javax.swing.JInternalFrame {

    private Calendar fechaYHora;
    private ControladorCliente controladorCliente;
    private ControladorTiket controladorTicket;
    private ControladorVehiculo controladorVehiculo;

    private VentanaIngresarVehiculo ventanaIngresarVehiculo;
    private VentanaPrincipal ventanaPricipal;
    private Date FechaS;
    LocalDateTime local;

    /**
     * Creates new form VentanaSalidaVehiculo
     */
    public VentanaSalidaVehiculo(ControladorCliente controladorCliente, ControladorTiket controladorTicket, ControladorVehiculo controladorVehiculo, VentanaPrincipal ventanaPrincipal, VentanaIngresarVehiculo ventanaIngresarVehiculo) {
        initComponents();
        this.controladorCliente = controladorCliente;
        this.controladorTicket = controladorTicket;
        this.controladorVehiculo = controladorVehiculo;
        this.ventanaIngresarVehiculo = ventanaIngresarVehiculo;
        this.ventanaPricipal = ventanaPrincipal;
        local = LocalDateTime.now();

    }

    //metodo para calcular la fecha y hora automaticamente 
//    public void FechaYHora() {
//        fechaYHora = Calendar.getInstance();
//        txtSalida.setText(fechaYHora.getTime().toString());
//
//    }
    public void FechaYHora() {
        LocalDateTime local = LocalDateTime.now();
        FechaS = java.sql.Timestamp.valueOf(local);
        txtFechaS.setText(local.toString());
    }

    public void dateaLocal() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFechaE = new javax.swing.JTextField();
        txtNUmeroTicket = new javax.swing.JTextField();
        txtFechaS = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnGenerarTicket = new javax.swing.JButton();
        btnInformacionTicket = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Ingrese numero de ticket");

        jLabel2.setText("Fecha de salida");

        jLabel3.setText("Fecha de entrada");

        jLabel4.setText("Cedula del cliente");

        jLabel5.setText("Nombre del cliente");

        jLabel6.setText("Direccion");

        jLabel7.setText("Telefono");

        jLabel8.setText("Placa vehiculo");

        jLabel9.setText("Marca");

        jLabel10.setText("Modelo");

        jLabel11.setText("Total a pagar");

        txtFechaE.setEditable(false);
        txtFechaE.setBackground(new java.awt.Color(255, 255, 204));

        txtFechaS.setEditable(false);
        txtFechaS.setBackground(new java.awt.Color(255, 255, 204));

        txtCedula.setEditable(false);
        txtCedula.setBackground(new java.awt.Color(255, 255, 204));

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 204));

        txtDireccion.setEditable(false);
        txtDireccion.setBackground(new java.awt.Color(255, 255, 204));

        txtTelefono.setEditable(false);
        txtTelefono.setBackground(new java.awt.Color(255, 255, 204));

        txtPlaca.setEditable(false);
        txtPlaca.setBackground(new java.awt.Color(255, 255, 204));

        txtMarca.setEditable(false);
        txtMarca.setBackground(new java.awt.Color(255, 255, 204));

        txtModelo.setEditable(false);
        txtModelo.setBackground(new java.awt.Color(255, 255, 204));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(255, 255, 204));

        btnGenerarTicket.setText("Generar ticket de salida");

        btnInformacionTicket.setText("Informacion Ticket");
        btnInformacionTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel11)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInformacionTicket)
                        .addGap(36, 36, 36)))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNUmeroTicket, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                        .addComponent(txtFechaE)
                        .addComponent(txtFechaS)
                        .addComponent(txtCedula)
                        .addComponent(txtNombre)
                        .addComponent(txtDireccion)
                        .addComponent(txtTelefono)
                        .addComponent(txtPlaca)
                        .addComponent(txtMarca)
                        .addComponent(txtModelo)
                        .addComponent(txtTotal))
                    .addComponent(btnGenerarTicket))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNUmeroTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFechaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFechaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInformacionTicket)
                    .addComponent(btnGenerarTicket))
                .addGap(146, 146, 146))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInformacionTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionTicketActionPerformed
        // TODO add your handling code here:

        FechaYHora();
        Ticket tiket = controladorTicket.buscarTiket(Integer.valueOf(txtNUmeroTicket.getText()));

        if (tiket == null) {
            int opcion = JOptionPane.showConfirmDialog(this, "No existe ese ticket \n¿Desea crear uno?");
            if (opcion == JOptionPane.YES_OPTION) {
                ventanaPricipal.getDesktopPane().add(ventanaIngresarVehiculo);
                ventanaIngresarVehiculo.setVisible(true);
                this.dispose(); 
            } else if (opcion == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "Ingrese un ticket valido");
            }

        } else {
            LocalDateTime FechaEntrada = tiket.getFechaYHoraDeIngreso();
            //LocalDateTime localE = FechaEntrada.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
            Vehiculo vehiculo = tiket.getVehiculo();
            txtFechaE.setText(FechaEntrada.toString());
            txtPlaca.setText(vehiculo.getPlaca());
            txtMarca.setText(vehiculo.getMarca());
            txtModelo.setText(vehiculo.getModelo());
            Cliente cliente = controladorCliente.buscarPorVehiculo(vehiculo.getPlaca());
            //Cliente cliente=vehiculo.getCliente();
            txtCedula.setText(cliente.getCedula());
            txtNombre.setText(cliente.getNombre());
            txtDireccion.setText(cliente.getDireccion());
            txtTelefono.setText(cliente.getTelefono());
//           DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm");
            LocalDate d1 = LocalDate.parse(FechaEntrada.toString(), DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            LocalDate d2 = LocalDate.parse(local.toString(), DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            Duration diff = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
            long diffDays = diff.toMillis();
            //txtTotal.setText(String.valueOf(diffDays));
            if(diffDays <=10){
                txtTotal.setText(String.valueOf(0.25));
            }else if(diffDays > 10){
                int calcularTotal = (int) diffDays/10;
                calcularTotal = (int) (calcularTotal*0.25);
                txtTotal.setText(String.valueOf(calcularTotal));
            }
        }


    }//GEN-LAST:event_btnInformacionTicketActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarTicket;
    private javax.swing.JButton btnInformacionTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaE;
    private javax.swing.JTextField txtFechaS;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNUmeroTicket;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
