/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author NANCY
 */
public class Ticket {

    private int numero;
    private LocalDateTime fechaYHoraDeIngreso;
    private LocalDateTime fechaYHoraDeSalida;
    private double total;
    private Vehiculo vehiculo;

    public Ticket() {
    }

    public Ticket(int numero, LocalDateTime fechaYHoraDeIngreso, Vehiculo vehiculo) {
        this.numero = numero;
        this.fechaYHoraDeIngreso = fechaYHoraDeIngreso;
        this.vehiculo = vehiculo;
    }

    public Ticket(int numero, LocalDateTime fechaYHoraDeIngreso, LocalDateTime fechaYHoraDeSalida, double total, Vehiculo vehiculo) {
        this.numero = numero;
        this.fechaYHoraDeIngreso = fechaYHoraDeIngreso;
        this.fechaYHoraDeSalida = fechaYHoraDeSalida;
        this.total = total;
        this.vehiculo = vehiculo;
    }

   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getFechaYHoraDeIngreso() {
        return fechaYHoraDeIngreso;
    }

    public void setFechaYHoraDeIngreso(LocalDateTime fechaYHoraDeIngreso) {
        this.fechaYHoraDeIngreso = fechaYHoraDeIngreso;
    }

    public LocalDateTime getFechaYHoraDeSalida() {
        return fechaYHoraDeSalida;
    }

    public void setFechaYHoraDeSalida(LocalDateTime fechaYHoraDeSalida) {
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
        final Ticket other = (Ticket) obj;
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
