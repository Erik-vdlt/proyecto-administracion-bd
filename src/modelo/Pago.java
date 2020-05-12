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
public class Pago {
    private int idPago;
    private int huespedPago;
    private int idReservacion;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    public Pago() {
    }

    public Pago(int idPago, int huespedPago, int idReservacion, String nombre, String primerApellido, String segundoApellido) {
        this.idPago = idPago;
        this.huespedPago = huespedPago;
        this.idReservacion = idReservacion;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getHuespedPago() {
        return huespedPago;
    }

    public void setHuespedPago(int huespedPago) {
        this.huespedPago = huespedPago;
    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Override
    public String toString() {
        return "Pago{" + "idPago=" + idPago + ", huespedPago=" + huespedPago + ", idReservacion=" + idReservacion + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + '}';
    }
    
    
}
