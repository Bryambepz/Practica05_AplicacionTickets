/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.IClienteDAO;
import ec.edu.ups.idao.ITiketDAO;
import ec.edu.ups.idao.IVehiculoDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Tiket;
import ec.edu.ups.modelo.Vehiculo;
import java.util.Date;

/**
 *
 * @author NANCY
 */
public class ControladorTiket {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Tiket tiket;
    private IClienteDAO clienteDAO;
    private IVehiculoDAO vehiculoDAO;
    private ITiketDAO tiketDAO;
    
    public ControladorTiket(IClienteDAO clienteDAO, IVehiculoDAO vehiculoDAO, ITiketDAO tiketDAO) {
        this.clienteDAO = clienteDAO;
        this.vehiculoDAO = vehiculoDAO;
        this.tiketDAO = tiketDAO;
    }
    
    public void crear(int numero,Date fechaEntrada, String placa) {
        Vehiculo vehiculo = vehiculoDAO.read(placa);
        tiket = new Tiket(numero,fechaEntrada, vehiculo);
        tiketDAO.create(tiket);
    }
    
    public int numeroTicket() {
        int conta = tiketDAO.devolverNumero();
        return (conta);
    }
    
    public Tiket buscarTiket(int numero, String placa){
        tiket = tiketDAO.read(numero);
        vehiculo = tiket.getVehiculo();
                
        return tiket;
    }
}
