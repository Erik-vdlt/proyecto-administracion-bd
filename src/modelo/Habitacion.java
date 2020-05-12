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
public class Habitacion {
    private int idHabitacion;
    private int idTipoHabitacion;
    private int idOtroTipo; 
    private int idEstado;

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, int idTipoHabitacion, int idOtroTipo, int idEstado) {
        this.idHabitacion = idHabitacion;
        this.idTipoHabitacion = idTipoHabitacion;
        this.idOtroTipo = idOtroTipo;
        this.idEstado = idEstado;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public int getIdOtroTipo() {
        return idOtroTipo;
    }

    public void setIdOtroTipo(int idOtroTipo) {
        this.idOtroTipo = idOtroTipo;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", idTipoHabitacion=" + idTipoHabitacion + ", idOtroTipo=" + idOtroTipo + ", idEstado=" + idEstado + '}';
    }
    
    
}
