package com.example.APPI.REST.G411.helpers.validaciones;

import com.example.APPI.REST.G411.MODELOS.Medico;
import com.example.APPI.REST.G411.MODELOS.Paciente;

public class MedicoValidacion {
        // INYECCION DE DEPENDENCIAS: LLAMAR UNA CLASE DENTRO DE OTRA

        private Medico medico = new Medico();

        // crear un método para cada dato que debo validar

        public Boolean validarNombre(){
            return true;
        }

        public Boolean validarMatricula(){
            return true;
        }

        public Boolean validarEspecialidad(){
            return true;
        }

        public  Boolean validarSalario(){
            return true;
        }

        public  Boolean validarIpsAsociado(){
            return true;
        }

        public  Boolean validarcorreo(){
            return true;
        }

        public  Boolean validarTelfono(){
            return true;
        }

        public  Boolean validarDireccion(){
            return true;
        }
}
