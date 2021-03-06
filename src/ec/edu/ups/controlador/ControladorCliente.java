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
import java.util.List;

/**
 *
 * @author NANCY
 */
public class ControladorCliente {
    private IClienteDAO clienteDAO;
    private IVehiculoDAO vehiculoDAO;
    private Cliente cliente;
    
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
    
    public void agregarVehiculo(Vehiculo vehiculo, String cedula) {
        cliente = clienteDAO.read(cedula);
        vehiculo.getCliente(cedula);
        cliente.agregarVehiculo(vehiculo);
        clienteDAO.update(cliente);
    }
     
    public Cliente buscarPorVehiculo(String placa) {
        cliente = clienteDAO.buscarPorVehiculo(placa);
        return cliente;
    }

    public List<Cliente> listar() {
        return clienteDAO.findAll();
    }
}
