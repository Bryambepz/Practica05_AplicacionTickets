/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.idao.IClienteDAO;
import ec.edu.ups.modelo.Cliente;

/**
 *
 * @author NANCY
 */
public class ControladorCliente {
    private IClienteDAO clienteDAO;
    private Cliente cliente;

    public ControladorCliente(ClienteDAO clienteDAO) {
        this.clienteDAO=clienteDAO;
    }
    
    public Cliente buscrarClientePorCedula(String cedula)
    {
        cliente= clienteDAO.read(cedula);
        return cliente;
    }
}
