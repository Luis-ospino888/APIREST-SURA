package com.example.APPI.REST.G411.helpers.validaciones;

import com.example.APPI.REST.G411.MODELOS.Enfermedad;
import com.example.APPI.REST.G411.MODELOS.Paciente;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EnfermedadValidacion {
    // INYECCION DE DEPENDENCIAS: LLAMAR UNA CLASE DENTRO DE OTRA

    private Enfermedad emfermedad = new Enfermedad();

    // crear un método para cada dato que debo valida

    public Boolean validarNombre(String nombre){
        // validaré que el nombre solo tenga letras

        // paso 1: debo crear una expresión regular
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{1,30}$"; // nos las da chat gpt

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

    private Boolean validarSintomas(String sintomas){
        // paso 1: debo crear una expresión regular
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{1,100}$"; // nos las da chat gpt

        // paso 2: crear un patron de java para la REGEX
        Pattern patron = Pattern.compile(expresionRegular);

        // paso 3: aplicar el patron al texto que introduce el usuario
        Matcher coincidencia = patron.matcher(sintomas);

        // paso 4: Se verifica la coincidencia
        if (coincidencia.find()){
            return  true;
        }else {
            return false;
        }
    }

    public Boolean validarClasificacionEnfermedad(String clasificacion){
        // paso 1: debo crear una expresión regular
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{1,20}$"; // nos las da chat gpt

        // paso 2: crear un patron de java para la REGEX
        Pattern patron = Pattern.compile(expresionRegular);

        // paso 3: aplicar el patron al texto que introduce el usuario
        Matcher coincidencia = patron.matcher(clasificacion);

        // paso 4: Se verifica la coincidencia
        if (coincidencia.find()){
            return  true;
        }else {
            return false;
        }
    }

    public Boolean validarGradoEnfermedad(String grado){
        return grado.toUpperCase().equals("GRADO 1") || grado.toUpperCase().equals("GRADO 2") || grado.toUpperCase().equals("GRADO 3");
    }

    public Boolean validarProbabilidadVivir(String probabilidad){
        // paso 1: debo crear una expresión regular
        String expresionRegular = "^(100|[1-9][0-9]?)%$"; // nos las da chat gpt

        // paso 2: crear un patron de java para la REGEX
        Pattern patron = Pattern.compile(expresionRegular);

        // paso 3: aplicar el patron al texto que introduce el usuario
        Matcher coincidencia = patron.matcher(probabilidad);

        // paso 4: Se verifica la coincidencia
        if (coincidencia.find()){
            return  true;
        }else {
            return false;
        }
    }



}
