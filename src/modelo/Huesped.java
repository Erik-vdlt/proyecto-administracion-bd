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
public class Huesped {
    private String nombreHuesped;
    private String primerApellido;
    private String segundoApellido;
    private String direccion;
    private String email;
    private String telefono;
    private String ciudad;
    private String pais;
    private boolean identificacion;
    
    public Huesped(){}

    public Huesped(String nombreHuesped, String primerApellido, String segundoApellido, String direccion, String email, String telefono, String ciudad, String pais, boolean identificacion) {
        this.nombreHuesped = nombreHuesped;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.pais = pais;
        this.identificacion = identificacion;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(boolean identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Huesped{" + "nombreHuesped=" + nombreHuesped + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", direccion=" + direccion + ", email=" + email + ", telefono=" + telefono + ", ciudad=" + ciudad + ", pais=" + pais + ", identificacion=" + identificacion + '}';
    }
    
    
    
}
