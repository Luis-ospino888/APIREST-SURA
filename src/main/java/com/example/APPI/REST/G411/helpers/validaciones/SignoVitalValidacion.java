package com.example.APPI.REST.G411.helpers.validaciones;

import com.example.APPI.REST.G411.MODELOS.signoVital;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignoVitalValidacion {

    private signoVital svital = new signoVital();

    public Boolean validacionNombre(String nombre){
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{1,50}$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(nombre);
        if (coincidencia.find()){
            return true;
        }else {
            return false;
        }
    }
}
