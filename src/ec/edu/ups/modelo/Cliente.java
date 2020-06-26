/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author braya
 */
public class Cliente {
    //modelo usuario
     //Atributos
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Vehiculo> listaVehiculos;

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, String direccion, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    //métodos de la agregación
    public void agregarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    public void actualizarVehiculo(Vehiculo vehiculo) {
        if (listaVehiculos.contains(vehiculo)) {
            int index = listaVehiculos.indexOf(vehiculo);
            listaVehiculos.set(index, vehiculo);
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        if (listaVehiculos.contains(vehiculo)) {
            int index = listaVehiculos.indexOf(vehiculo);
            listaVehiculos.remove(index);
        }
    }

    public List<Vehiculo> listar() {
        return listaVehiculos;
    }

    public Vehiculo buscar(String placa) {
        return listaVehiculos.get(Integer.valueOf(placa));

    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", listaVehiculos=" + listaVehiculos + '}';
    }
    
}
