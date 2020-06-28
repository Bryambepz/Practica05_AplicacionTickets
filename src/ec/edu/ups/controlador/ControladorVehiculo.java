/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.idao.IVehiculoDAO;
import ec.edu.ups.modelo.Vehiculo;
import java.util.List;

/**
 *
 * @author NANCY
 */
public class ControladorVehiculo {
    private Vehiculo vehiculo;
    private IVehiculoDAO vehiculoDAO;
    
    public ControladorVehiculo(VehiculoDAO vehiculoDAO) {
        this.vehiculoDAO = vehiculoDAO;
    }
    
    public Vehiculo crearVehiculo(String placa, String marca, String modelo) {
        vehiculo = new Vehiculo(placa, marca, modelo);
        vehiculoDAO.create(vehiculo);
        return vehiculo;
    }
    public Vehiculo buscar(String placa)
    {
        vehiculo= vehiculoDAO.read(placa);
        return vehiculo;
    }
    
    public List<Vehiculo> listar() {
        return vehiculoDAO.findAll();
    }
}
