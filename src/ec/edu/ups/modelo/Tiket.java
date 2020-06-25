/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author NANCY
 */
public class Tiket {
    private int numero;
    private Date fechaYHoraDeIngreso;
    private Date fechaYHoraDeSalida;
    private double total;
    private Vehiculo vehiculo;

    public Tiket() {
    }

    public Tiket(int numero, Date fechaYHoraDeIngreso, Date fechaYHoraDeSalida, double total) {
        this.numero = numero;
        this.fechaYHoraDeIngreso = fechaYHoraDeIngreso;
        this.fechaYHoraDeSalida = fechaYHoraDeSalida;
        this.total = total;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaYHoraDeIngreso() {
        return fechaYHoraDeIngreso;
    }

    public void setFechaYHoraDeIngreso(Date fechaYHoraDeIngreso) {
        this.fechaYHoraDeIngreso = fechaYHoraDeIngreso;
    }

    public Date getFechaYHoraDeSalida() {
        return fechaYHoraDeSalida;
    }

    public void setFechaYHoraDeSalida(Date fechaYHoraDeSalida) {
        this.fechaYHoraDeSalida = fechaYHoraDeSalida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.numero;
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
        final Tiket other = (Tiket) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tiket{" + "numero=" + numero + ", fechaYHoraDeIngreso=" + fechaYHoraDeIngreso + ", fechaYHoraDeSalida=" + fechaYHoraDeSalida + ", total=" + total + ", vehiculo=" + vehiculo + '}';
    }
    
 
}
