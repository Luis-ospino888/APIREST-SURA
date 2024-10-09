package com.example.APPI.REST.G411.helpers.validaciones;

import com.example.APPI.REST.G411.MODELOS.Paciente;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PacienteValidacion {
    // INYECCION DE DEPENDENCIAS: LLAMAR UNA CLASE DENTRO DE OTRA

    private Paciente paciente = new Paciente();

    // crear un método para cada dato que debo validar

    public Boolean validarNombre(String nombre){
        // validaré que el nombre solo tenga letras

        // paso 1: debo crear una expresión regular
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$"; // nos las da chat gpt

        // paso 2: crear un patron de java para la REGEX
        Pattern patron = Pattern.compile(expresionRegular);

        // paso 3: aplicar el patron al texto que introduce el usuario
        Matcher coincidencia = patron.matcher(nombre);

        // paso 4: Se verifica la coincidencia
        if (coincidencia.find()){
            return  true;
        }else {
            return false;
        }
    }

    public Boolean validarFechaNacimiento(LocalDate fecha){
        return fecha.getYear() <= 2024 && fecha.getYear() >= 1920;
    }

    public Boolean validarCiudad(){
        return true;
    }

    public  Boolean validarCorreo(){
        return true;
    }

    public  Boolean validarTelefono(String telefono){
        return telefono.length() == 10;
    }

    public  Boolean validarGrupoIngreso(String grupoIngreso){
        return grupoIngreso.toUpperCase().equals("A") || grupoIngreso.toUpperCase().equals("B") || grupoIngreso.toUpperCase().equals("C");
    }

    public  Boolean validarFechaValidacion(LocalDate fechaAfiliacion){
        return fechaAfiliacion.getYear() >= 1995 && fechaAfiliacion.getYear() <= 2024;
    }
}
