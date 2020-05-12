/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author erik
 */
public class Reservacion {
    private int idReservacion;
    private int idHuesped;
    private int idHabitacion;
    private String fechaReservacion;
    private String fechaIngreso;
    private String fechaSalida;
    private byte adultos;
    private byte ninos;

    public Reservacion() {
    }

    public Reservacion(int idReservacion, int idHuesped, int idHabitacion, String fechaReservacion, String fechaIngreso, String fechaSalida, byte adultos, byte ninos) {
        this.idReservacion = idReservacion;
        this.idHuesped = idHuesped;
        this.idHabitacion = idHabitacion;
        this.fechaReservacion = fechaReservacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.adultos = adultos;
        this.ninos = ninos;
    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getFechaReservacion() {
        return fechaReservacion;
    }

    public void setFechaReservacion(String fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public byte getAdultos() {
        return adultos;
    }

    public void setAdultos(byte adultos) {
        this.adultos = adultos;
    }

    public byte getNinos() {
        return ninos;
    }

    public void setNinos(byte ninos) {
        this.ninos = ninos;
    }

    @Override
    public String toString() {
        return "Reservacion{" + "idReservacion=" + idReservacion + ", idHuesped=" + idHuesped + ", idHabitacion=" + idHabitacion + ", fechaReservacion=" + fechaReservacion + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", adultos=" + adultos + ", ninos=" + ninos + '}';
    }
    
    
}
