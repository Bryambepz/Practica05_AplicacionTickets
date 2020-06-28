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
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 *
 * @author NANCY
 */
public class ControladorTiket {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Ticket tiket;
    private IClienteDAO clienteDAO;
    private IVehiculoDAO vehiculoDAO;
    private ITiketDAO tiketDAO;
    
    public ControladorTiket(IClienteDAO clienteDAO, IVehiculoDAO vehiculoDAO, ITiketDAO tiketDAO) {
        this.clienteDAO = clienteDAO;
        this.vehiculoDAO = vehiculoDAO;
        this.tiketDAO = tiketDAO;
    }
    
    public void crear(int numero,Date fechaEntrada, String placa) {
        vehiculo = vehiculoDAO.read(placa);
        tiket = new Ticket(numero,fechaEntrada, vehiculo);
        tiketDAO.create(tiket);
    }
    
    public int numeroTicket() {
        int conta = tiketDAO.devolverNumero();
        return (conta);
    }
    
    public Ticket buscarTiket(int numero){
        tiket = tiketDAO.read(numero);
        return tiket;
    }
    public List<Ticket> buscarTiketPorVehiculo(Vehiculo vehiculo){ 
        return tiketDAO.BuscarPorVehiculo(vehiculo);
    }
    
    /*public Ticket calculoValorTotal(int numero, Date salida,)
    {
        tiket= buscarTiket(numero);
        tiket.setFechaYHoraDeSalida(salida);
        long diferenciadetiempo= Duration.between (entrada, salida); 
        return tiket;
    }*/
}
