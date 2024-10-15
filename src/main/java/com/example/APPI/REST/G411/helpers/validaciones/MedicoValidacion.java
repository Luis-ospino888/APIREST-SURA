package com.example.APPI.REST.G411.helpers.validaciones;

import com.example.APPI.REST.G411.MODELOS.Medico;
import com.example.APPI.REST.G411.MODELOS.Paciente;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MedicoValidacion {
        // INYECCION DE DEPENDENCIAS: LLAMAR UNA CLASE DENTRO DE OTRA

        private Medico medico = new Medico();

        // crear un método para cada dato que debo validar

        public Boolean validarNombre(String nombre){
            String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{1,30}$";
            Pattern patron = Pattern.compile(expresionRegular);
            Matcher coincidencia = patron.matcher(nombre);
            if (coincidencia.find()){
                return true;
            }else {
                return false;
            }
        }

        public Boolean validarMatricula(String matricula){
            String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{1,20}$";
            Pattern patron = Pattern.compile(expresionRegular);
            Matcher coincidencia = patron.matcher(matricula);
            if (coincidencia.find()){
                return true;
            }else {
                return false;
            }
        }

        public Boolean validarEspecialidad(String especialista){
            String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{1,50}$";
            Pattern patron = Pattern.compile(expresionRegular);
            Matcher coincidencia = patron.matcher(especialista);
            if (coincidencia.find()){
                return true;
            }else {
                return false;
            }
        }

        public  Boolean validarSalario(Integer salario){
            if (medico.getSalario() >= 8000000 && medico.getSalario() <= 16000000){
                return true;
            }else{
                return false;
            }
        }

        public  Boolean validarIpsAsociado(String ips){
            String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{1,50}$";
            Pattern patron = Pattern.compile(expresionRegular);
            Matcher coincidencia = patron.matcher(ips);
            if (coincidencia.find()){
                return true;
            }else {
                return false;
            }
        }

        public  Boolean validarcorreo(String correoMedico){
            String expresionRegular = "^[a-zA-Z0-9._%+-]+@(gmail\\.com|hotmail\\.com|outlook\\.com)$\n";
            Pattern patron = Pattern.compile(expresionRegular);
            Matcher coincidencia = patron.matcher(correoMedico);
            if (coincidencia.find()){
                return true;
            }else{
                return false;
            }
        }

        public  Boolean validarTelfono(String telefono){
            String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{1,10}$";
            Pattern patron = Pattern.compile(expresionRegular);
            Matcher coincidencia = patron.matcher(telefono);
            if (coincidencia.find()){
                return true;
            }else {
                return false;
            }
        }

        public  Boolean validarDireccion(String direccion){
            String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{1,100}$";
            Pattern patron = Pattern.compile(expresionRegular);
            Matcher coincidencia = patron.matcher(direccion);
            if (coincidencia.find()){
                return true;
            }else {
                return false;
            }
        }
}
