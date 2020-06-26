/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.idao.IClienteDAO;
import ec.edu.ups.idao.IVehiculoDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Vehiculo;

/**
 *
 * @author NANCY
 */
public class ControladorCliente {
    private IClienteDAO clienteDAO;
    private IVehiculoDAO vehiculoDAO;
    private Cliente cliente;
    private Vehiculo vehiculo;
    
    
    public ControladorCliente(ClienteDAO clienteDAO,VehiculoDAO vehiculoDAO) {
        this.clienteDAO=clienteDAO;
        this.vehiculoDAO= vehiculoDAO;
    }
    
    public void registrar(String cedula,String nombre,String direccion,String telefono)
    {
        cliente= new Cliente(cedula, nombre, direccion, telefono);
        clienteDAO.create(cliente);
    }
    
    public Cliente buscrarClientePorCedula(String cedula)
    {
        cliente= clienteDAO.read(cedula);
        return cliente;
    }
    
     public void agregarVehiculo(Vehiculo vehiculo, String cedulas) {
        cliente = clienteDAO.read(cedulas);
        cliente.agregarVehiculo(vehiculo);
        clienteDAO.update(cliente);
    }
}
