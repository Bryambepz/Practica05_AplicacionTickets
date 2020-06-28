/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTiket;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.TiketDAO;
import ec.edu.ups.dao.VehiculoDAO;
import java.awt.event.ActionEvent;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JDesktopPane;

/**
 *
 * @author braya
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    //ventanas
    private VentanaIngresarVehiculo ventanaIngresarVehiculo;
    private VentanaCrearCliente ventanaCrearCliente;
    private CrearVehiculo crearVehiculo;
    private VentanaSalidaVehiculo ventanaSalidaVehiculo;
    private VentanaListarTicket ventanaListarTicket;
    private VentanaListarTiketCedula ventanaListarTiketCedula;
    //mvc
    private ClienteDAO clienteDAO;
    private VehiculoDAO vehiculoDAO;
    private TiketDAO tiketDAO;
    private ControladorCliente controladorCliente;
    private ControladorTiket controladorTiket;
    private ControladorVehiculo controladorVehiculo;
    //Idioma
    private Locale localizacion;
    private ResourceBundle mensajes;
    
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        
        clienteDAO=new ClienteDAO();
        vehiculoDAO=new VehiculoDAO();
        tiketDAO= new TiketDAO();
        
        controladorCliente=new ControladorCliente(clienteDAO,vehiculoDAO);
        controladorVehiculo= new ControladorVehiculo(vehiculoDAO);
        controladorTiket=new ControladorTiket(clienteDAO, vehiculoDAO, tiketDAO);
        
        ventanaCrearCliente= new VentanaCrearCliente(controladorCliente);
        crearVehiculo = new CrearVehiculo(controladorCliente,ventanaCrearCliente,controladorVehiculo,this);
        ventanaIngresarVehiculo = new VentanaIngresarVehiculo(controladorCliente, this,controladorTiket,crearVehiculo,controladorVehiculo);
        ventanaSalidaVehiculo = new VentanaSalidaVehiculo(controladorCliente, controladorTiket, controladorVehiculo, this,ventanaIngresarVehiculo); 
        ventanaListarTicket= new VentanaListarTicket(controladorCliente,controladorVehiculo,controladorTiket);
        ventanaListarTiketCedula= new VentanaListarTiketCedula(controladorCliente,controladorVehiculo,controladorTiket);
        
        // se añade al panel principal la ventana crear cliente para luego hacerle visble en la ventana ingresar Vehiculo      
        //desktopPane.add(ventanaIngresarVehiculo);
        //desktopPane.add(ventanaCrearCliente);
        //desktopPane.add(crearVehiculo);
        localizacion = new Locale("es", "EC");
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", localizacion);
    }
    
    public void cambiarIdioma(){
        principalMenu.setText(mensajes.getString("menu"));
            registrarEntradaMenuItem.setText(mensajes.getString("registrarEntrada"));
                ventanaIngresarVehiculo.setTitle(mensajes.getString("tituloIngresar"));
                ventanaIngresarVehiculo.getjNumero().setText(mensajes.getString("numero"));
                ventanaIngresarVehiculo.getjFecjha().setText(mensajes.getString("fecha"));
                ventanaIngresarVehiculo.getjCedula().setText(mensajes.getString("cedula"));
                ventanaIngresarVehiculo.getjNombre().setText(mensajes.getString("nombre"));
                ventanaIngresarVehiculo.getjDireccion().setText(mensajes.getString("direccion"));
                ventanaIngresarVehiculo.getjTelefono().setText(mensajes.getString("telefono"));
                ventanaIngresarVehiculo.getjPlaca().setText(mensajes.getString("placa"));
                ventanaIngresarVehiculo.getBtnEmitirTiket().setText(mensajes.getString("btnEmitir"));
                ventanaIngresarVehiculo.getBtnGestionVhiculo().setText(mensajes.getString("btnGestion"));
                ventanaIngresarVehiculo.setMensajeEmitir(mensajes.getString("mensajeEmitir"));
                ventanaIngresarVehiculo.setMensajeEmitirNull(mensajes.getString("mensajeEmitirNull"));
            crearClienteMenuItem.setText(mensajes.getString("crearCliente"));
            salirMenuItem.setText(mensajes.getString("salir"));
        listarMenu.setText(mensajes.getString("listar"));
            menuItemListarPorPlaca.setText(mensajes.getString("listarPorPlaca"));
            MenuItemListarPorCedula.setText(mensajes.getString("listarPorCedula"));
        idiomaMenu.setText(mensajes.getString("idioma"));
            menuItemEspañol.setText(mensajes.getString("español"));
            menuItemIngles.setText(mensajes.getString("ingles"));
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        principalMenu = new javax.swing.JMenu();
        registrarEntradaMenuItem = new javax.swing.JMenuItem();
        crearClienteMenuItem = new javax.swing.JMenuItem();
        ticketSalidaMenu = new javax.swing.JMenuItem();
        salirMenuItem = new javax.swing.JMenuItem();
        listarMenu = new javax.swing.JMenu();
        menuItemListarPorPlaca = new javax.swing.JMenuItem();
        MenuItemListarPorCedula = new javax.swing.JMenuItem();
        idiomaMenu = new javax.swing.JMenu();
        menuItemEspañol = new javax.swing.JMenuItem();
        menuItemIngles = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

        desktopPane.setBackground(new java.awt.Color(0, 204, 204));
        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        principalMenu.setMnemonic('f');
        principalMenu.setText("Menú");

        registrarEntradaMenuItem.setMnemonic('o');
        registrarEntradaMenuItem.setText("Registrar Entrada");
        registrarEntradaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEntradaMenuItemActionPerformed(evt);
            }
        });
        principalMenu.add(registrarEntradaMenuItem);

        crearClienteMenuItem.setMnemonic('s');
        crearClienteMenuItem.setText("Crear Cliente ");
        crearClienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearClienteMenuItemActionPerformed(evt);
            }
        });
        principalMenu.add(crearClienteMenuItem);

        ticketSalidaMenu.setMnemonic('a');
        ticketSalidaMenu.setText("Ticket Salida");
        ticketSalidaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketSalidaMenuActionPerformed(evt);
            }
        });
        principalMenu.add(ticketSalidaMenu);

        salirMenuItem.setMnemonic('x');
        salirMenuItem.setText("Exit");
        salirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirMenuItemActionPerformed(evt);
            }
        });
        principalMenu.add(salirMenuItem);

        menuBar.add(principalMenu);

        listarMenu.setText("Listar");

        menuItemListarPorPlaca.setText("Listar por Placa ");
        menuItemListarPorPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarPorPlacaActionPerformed(evt);
            }
        });
        listarMenu.add(menuItemListarPorPlaca);

        MenuItemListarPorCedula.setText("Listar por Cedula");
        MenuItemListarPorCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemListarPorCedulaActionPerformed(evt);
            }
        });
        listarMenu.add(MenuItemListarPorCedula);

        menuBar.add(listarMenu);

        idiomaMenu.setMnemonic('h');
        idiomaMenu.setText("Idioma");

        menuItemEspañol.setMnemonic('c');
        menuItemEspañol.setText("Español");
        menuItemEspañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEspañolActionPerformed(evt);
            }
        });
        idiomaMenu.add(menuItemEspañol);

        menuItemIngles.setMnemonic('a');
        menuItemIngles.setText("Ingles");
        menuItemIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInglesActionPerformed(evt);
            }
        });
        idiomaMenu.add(menuItemIngles);

        menuBar.add(idiomaMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void registrarEntradaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEntradaMenuItemActionPerformed
        desktopPane.add(ventanaIngresarVehiculo);
        //desktopPane.add(crearVehiculo);
        ventanaIngresarVehiculo.setVisible(true);
    }//GEN-LAST:event_registrarEntradaMenuItemActionPerformed

    private void crearClienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearClienteMenuItemActionPerformed
        desktopPane.add(ventanaCrearCliente);
        //desktopPane.add(crearVehiculo);
        ventanaCrearCliente.setVisible(true);
    }//GEN-LAST:event_crearClienteMenuItemActionPerformed

    private void ticketSalidaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketSalidaMenuActionPerformed
        // TODO add your handling code here:
        desktopPane.add(ventanaSalidaVehiculo);
        ventanaSalidaVehiculo.setVisible(true);
    }//GEN-LAST:event_ticketSalidaMenuActionPerformed

    private void salirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirMenuItemActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirMenuItemActionPerformed

    private void menuItemEspañolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEspañolActionPerformed
        // TODO add your handling code here:
        
        localizacion = new Locale("es", "EC");
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_menuItemEspañolActionPerformed

    private void menuItemInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInglesActionPerformed
        // TODO add your handling code here:
        
        localizacion = new Locale("en", "UK");
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_menuItemInglesActionPerformed

    private void menuItemListarPorPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarPorPlacaActionPerformed
        desktopPane.add(ventanaListarTicket);
        ventanaListarTicket.setVisible(true);
    }//GEN-LAST:event_menuItemListarPorPlacaActionPerformed

    private void MenuItemListarPorCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemListarPorCedulaActionPerformed
        desktopPane.add(ventanaListarTiketCedula);
        ventanaListarTiketCedula.setVisible(true);
    }//GEN-LAST:event_MenuItemListarPorCedulaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    
    public VentanaCrearCliente getVentanaCrearCliente() {
        return ventanaCrearCliente;
    }

    public CrearVehiculo getCrearVehiculo() {
        return crearVehiculo;
    }

    public VentanaIngresarVehiculo getVentanaIngresarVehiculo() {
        return ventanaIngresarVehiculo;
    }

    
    
    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemListarPorCedula;
    private javax.swing.JMenuItem crearClienteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu idiomaMenu;
    private javax.swing.JMenu listarMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemEspañol;
    private javax.swing.JMenuItem menuItemIngles;
    private javax.swing.JMenuItem menuItemListarPorPlaca;
    private javax.swing.JMenu principalMenu;
    private javax.swing.JMenuItem registrarEntradaMenuItem;
    private javax.swing.JMenuItem salirMenuItem;
    private javax.swing.JMenuItem ticketSalidaMenu;
    // End of variables declaration//GEN-END:variables

}
