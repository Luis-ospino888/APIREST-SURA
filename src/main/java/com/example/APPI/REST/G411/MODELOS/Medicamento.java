package com.example.APPI.REST.G411.MODELOS;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;
@Entity
@Table(name="medicamentos")
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre; // solo letras - incluya ñ y tíldes - maximo 20 caracteres
    private String  presentacion; // solo letras - incluya ñ y tildes - max 20 caracteres
    private String dosis; // formato 3/8h
    private String laboratorio; // solo letras - incluya ñ y tíldes - maximo 20 caracteres
    private LocalDate fechaCaducidad; // mayor a 2025 y menor a 2027
    private String contraIndicaciones; // solo letras - incluya ñ y tíldes - maximo 100 caracteres
    private String registroInvima; // solo letras - incluya ñ y tíldes - maximo 20 caracteres
    private Boolean tieneCoopago;

    // LAS RELACIONES SON ATRIBUTOS
    @ManyToOne
    @JoinColumn(name = "fk_paciente", referencedColumnName = "id")
    @JsonBackReference
    private Paciente paciente;

    public Medicamento() {
    }

    public Medicamento(long id, String nombre, String presentacion, String dosis, String laboratorio, LocalDate fechaCaducidad, String contraIndicaciones, String registroInvima, Boolean tieneCoopago) {
        this.id = id;
        this.nombre = nombre;
        this.presentacion = presentacion;
        this.dosis = dosis;
        this.laboratorio = laboratorio;
        this.fechaCaducidad = fechaCaducidad;
        this.contraIndicaciones = contraIndicaciones;
        this.registroInvima = registroInvima;
        this.tieneCoopago = tieneCoopago;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getContraIndicaciones() {
        return contraIndicaciones;
    }

    public void setContraIndicaciones(String contraIndicaciones) {
        this.contraIndicaciones = contraIndicaciones;
    }

    public String getRegistroInvima() {
        return registroInvima;
    }

    public void setRegistroInvima(String registroInvima) {
        this.registroInvima = registroInvima;
    }

    public Boolean getTieneCoopago() {
        return tieneCoopago;
    }

    public void setTieneCoopago(Boolean tieneCoopago) {
        this.tieneCoopago = tieneCoopago;
    }
}
