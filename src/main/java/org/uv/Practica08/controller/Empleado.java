/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.Practica08.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author LilyE
 */
@Entity 
@Table(name = "empleado")
public class Empleado {
    @Id
    @GenerationValue(strategy = GenerationType.IDENTITY)
    @Columm(name = "id")
    
    @Id
    @Column(name = "clave")
    private long clave;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "telefono")
    private String telefono;

    public long getClave() {
        return clave;
    }

    public void setClave(long clave) {
        this.clave = clave;
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
}
