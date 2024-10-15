package com.example.APPI.REST.G411.MODELOS;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre; // no debe tener mas de 40 carácteres - solo admito letras -
    private LocalDate anioNacimiento; // este año no puede ser maypor a 2024 - no puede ser menor a 1920
    private String ciudad; // no debe tener mas de 50 caracteres - solo debe tener letras
    private String correo; // debe tener formato @sura.com.co
    private String telefono; // el telefono debe tener 10 dígitos
    private String ips; //
    private Boolean tienePoliza;
    private String grupoIngreso; // debe ser a, b o c
    private LocalDate fechaAfiliacion; // validas entre 1995 - 2024

    // LAS RELACIONES SON ATRIBUTOS
    @ManyToOne
    @JoinColumn(name = "fk_medico", referencedColumnName = "id")
    @JsonBackReference
    private Medico medico;

    // UNA RELACIÓN ES UN NUEVO ATRIBUTO
    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference
    private List<Medicamento> medicamentos;

    // UNA RELACIÓN ES UN NUEVO ATRIBUTO
    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference
    private List<Enfermedad> enfermedades;

    // UNA RELACIÓN ES UN NUEVO ATRIBUTO
    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference
    private List<signoVital> signosVitales;

    public Paciente() {
    }

    public Paciente(long id, String nombre, LocalDate anioNacimiento, String ciudad, String correo, String telefono, String ips, Boolean tienePoliza, String grupoIngreso, LocalDate fechaAfiliacion) {
        this.id = id;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.ciudad = ciudad;
        this.correo = correo;
        this.telefono = telefono;
        this.ips = ips;
        this.tienePoliza = tienePoliza;
        this.grupoIngreso = grupoIngreso;
        this.fechaAfiliacion = fechaAfiliacion;
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

    public LocalDate getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(LocalDate anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public Boolean getTienePoliza() {
        return tienePoliza;
    }

    public void setTienePoliza(Boolean tienePoliza) {
        this.tienePoliza = tienePoliza;
    }

    public String getGrupoIngreso() {
        return grupoIngreso;
    }

    public void setGrupoIngreso(String grupoIngreso) {
        this.grupoIngreso = grupoIngreso;
    }

    public LocalDate getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(LocalDate fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }
}


