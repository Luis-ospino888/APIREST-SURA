package com.example.APPI.REST.G411.MODELOS;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name="enfermedades")
public class Enfermedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre; // maximo 30 caracteres - solo admito letras
    private String sintomas; // maximo 100 caracteres - solo admito letras
    private String clasificacion; // maximo 20 caracteres - solo admito letras
    private String grado; // grado 1 - grado 2 - grado 3
    private double probabilidadVivir; // formato 1% - 100%

    // LAS RELACIONES SON ATRIBUTOS
    @ManyToOne
    @JoinColumn(name = "fk_paciente", referencedColumnName = "id")
    @JsonBackReference
    private Paciente paciente;

    public Enfermedad() {
    }

    public Enfermedad(long id, String nombre, String sintomas, String clasificacion, String grado, double probabilidadVivir) {
        this.id = id;
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.clasificacion = clasificacion;
        this.grado = grado;
        this.probabilidadVivir = probabilidadVivir;
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

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public double getProbabilidadVivir() {
        return probabilidadVivir;
    }

    public void setProbabilidadVivir(double probabilidadVivir) {
        this.probabilidadVivir = probabilidadVivir;
    }
}
