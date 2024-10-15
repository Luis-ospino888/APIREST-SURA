package com.example.APPI.REST.G411.MODELOS;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "medicos")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre; // 50 caracteres y solo letras
    private String matricula; // 20 caracteres
    private String especialidad; // 50 caracteres
    private Integer salario; // no puede ser negativo - minimo 8000000 maximo 30000000
    private String ipsAsociado; // 50 caracteres
    private String correo; // formato @gmail.com.co - @hotmail.com - @outlook.com
    private String telefono; // 10 caracteres
    private String direccion; // 100 caracteres
    private Boolean estaDisponibleFindesemana;

    // UNA RELACIÓN ES UN NUEVO ATRIBUTO
    @OneToMany(mappedBy = "medico")
    @JsonManagedReference
    private List<Paciente> pacientes;


    public Medico() {
    }

    public Medico(long id, String nombre, String matricula, String especialidad, Integer salario, String ipsAsociado, String correo, String telefono, String direccion, Boolean estaDisponibleFindesemana) {
        this.id = id;
        this.nombre = nombre;
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ipsAsociado = ipsAsociado;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estaDisponibleFindesemana = estaDisponibleFindesemana;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getIpsAsociado() {
        return ipsAsociado;
    }

    public void setIpsAsociado(String ipsAsociado) {
        this.ipsAsociado = ipsAsociado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEstaDisponibleFindesemana() {
        return estaDisponibleFindesemana;
    }

    public void setEstaDisponibleFindesemana(Boolean estaDisponibleFindesemana) {
        this.estaDisponibleFindesemana = estaDisponibleFindesemana;
    }
}
