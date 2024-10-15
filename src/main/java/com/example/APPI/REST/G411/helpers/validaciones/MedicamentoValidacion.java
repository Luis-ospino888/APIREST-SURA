package com.example.APPI.REST.G411.helpers.validaciones;

import com.example.APPI.REST.G411.MODELOS.Medicamento;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MedicamentoValidacion {

    // inyección de dependencias

    private Medicamento medicamento = new Medicamento();

    // crear un método para cada dato que debo valida

    public Boolean validarNombre(String nombre){
        // validaré que el nombre solo tenga letras

        // paso 1: debo crear una expresión regular
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{1,20}$"; // nos las da chat gpt

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

    public Boolean validarPresentacion(String presentacion){
        // validaré la presentacion

        // paso 1: debo crear una expresión regular
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{1,20}$"; // nos las da chat gpt

        // paso 2: crear un patron de java para la REGEX
        Pattern patron = Pattern.compile(expresionRegular);

        // paso 3: aplicar el patron al texto que introduce el usuario
        Matcher coincidencia = patron.matcher(presentacion);

        // paso 4: Se verifica la coincidencia
        if (coincidencia.find()){
            return  true;
        }else {
            return false;
        }
    }

    public Boolean validarDosis(String dosis){
        // validaré que la dosis

        // paso 1: debo crear la expresión regular
        String expresionRegular = "^\\d+\\/\\d+h$\n"; // la buscamos con chat gpt

        // paso 2: crear un patron de java para el REGEX
        Pattern patron = Pattern.compile(expresionRegular);

        // paso 3: aplicar el patron al texto que introduce el usuario
        Matcher coincidencia = patron.matcher(dosis);

        // paso 4: se verifica la coincidencia
        if (coincidencia.find()){
            return true;
        }else {
            return false;
        }
    }

    public Boolean validarLaboratorio(String laboratorio){
        // validaré que la dosis

        // paso 1: debo crear la expresión regular
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{1,20}$";

        // paso 2: crear un patron de java para el REGEX
        Pattern patron = Pattern.compile(expresionRegular);

        // paso 3: aplicar el patron al texto que introduce el usuario
        Matcher coincidencia = patron.matcher(laboratorio);

        // paso 4: se verifica la coincidencia
        if (coincidencia.find()){
            return true;
        }else{
            return false;
        }
    }

    public Boolean validarFechaCaducidad(LocalDate fecha){
        return fecha.getYear() > 2024 && fecha.getYear() <= 2027;
    }

    public Boolean validarContraindicaciones(String contraindicacion){
        // validaré que la dosis

        // paso 1: debo crear la expresión regular
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{1,100}$";

        // paso 2: crear un patron de java para el REGEX
        Pattern patron = Pattern.compile(expresionRegular);

        // paso 3: aplicar el patron al texto que introduce el usuario
        Matcher coincidencia = patron.matcher(contraindicacion);

        // paso 4: se verifica la coincidencia
        if (coincidencia.find()){
            return true;
        }else{
            return false;
        }
    }

    public Boolean validarRegistroInvima(String registroInvima){
        // validaré que la dosis

        // paso 1: debo crear la expresión regular
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{1,30}$";

        // paso 2: crear un patron de java para el REGEX
        Pattern patron = Pattern.compile(expresionRegular);

        // paso 3: aplicar el patron al texto que introduce el usuario
        Matcher coincidencia = patron.matcher(registroInvima);

        // paso 4: se verifica la coincidencia
        if (coincidencia.find()){
            return true;
        }else{
            return false;
        }
    }


}
