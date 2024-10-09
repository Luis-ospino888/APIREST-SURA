package com.example.APPI.REST.G411.helpers.validaciones;

import com.example.APPI.REST.G411.MODELOS.Paciente;

public class PacienteValidacion {
    // INYECCION DE DEPENDENCIAS: LLAMAR UNA CLASE DENTRO DE OTRA

    private Paciente paciente = new Paciente();

    // crear un método para cada dato que debo validar

    public Boolean validarNombre(){
        return true;
    }

    public Boolean validarFechaNacimiento(){
        return true;
    }

    public Boolean validarCiudad(){
        return true;
    }

    public  Boolean validarCorreo(){
        return true;
    }

    public  Boolean validarTelefono(){
        return true;
    }

    public  Boolean validarGrupoIngreso(){
        return true;
    }

    public  Boolean validarFechaValidacion(){
        return true;
    }
}
