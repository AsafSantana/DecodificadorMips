/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *Essa classe guarda os registradores
 * @author Asaf Santana
 */
public class Registrador {

    private final Map<String, String> registrador = new HashMap<>();
    private final Map<String, String> numero = new HashMap<>();
   
    
    
    public Registrador() {
        addregistrador();
        addNumeroRegistrador();
    }

    /**
     *
     * adiciona os Registradores com os Keys que são os bits
     */
    private void addregistrador() {
        registrador.put("00000", "$0");
        registrador.put("00001", "$1");
        registrador.put("00010", "$2");
        registrador.put("00011", "$3");
        registrador.put("00100", "$4");
        registrador.put("00101", "$5");
        registrador.put("00110", "$6");
        registrador.put("00111", "$7");
        registrador.put("01000", "$8");
        registrador.put("01001", "$9");
        registrador.put("01010", "$10");
        registrador.put("01011", "$11");
        registrador.put("01100", "$12");
        registrador.put("01101", "$13");
        registrador.put("01110", "$14");
        registrador.put("01111", "$15");
        registrador.put("10000", "$16");
        registrador.put("10001", "$17");
        registrador.put("10010", "$18");
        registrador.put("10011", "$19");
        registrador.put("10100", "$20");
        registrador.put("10101", "$21");
        registrador.put("10110", "$22");
        registrador.put("10111", "$23");
        registrador.put("11000", "$24");
        registrador.put("11001", "$25");
        registrador.put("11010", "$26");
        registrador.put("11011", "$27");
        registrador.put("11100", "$28");
        registrador.put("11101", "$29");
        registrador.put("11110", "$30");
        registrador.put("11111", "$31");

    }

    /**
     *
     * adiciona os numeros, os Keys que são os bits
     */
    private void addNumeroRegistrador() {
        numero.put("00000", "0");
        numero.put("00001", "1");
        numero.put("00010", "2");
        numero.put("00011", "3");
        numero.put("00100", "4");
        numero.put("00101", "5");
        numero.put("00110", "6");
        numero.put("00111", "7");
        numero.put("01000", "8");
        numero.put("01001", "9");
        numero.put("01010", "10");
        numero.put("01011", "11");
        numero.put("01100", "12");
        numero.put("01101", "13");
        numero.put("01110", "14");
        numero.put("01111", "15");
        numero.put("10000", "16");
        numero.put("10001", "17");
        numero.put("10010", "18");
        numero.put("10011", "19");
        numero.put("10100", "20");
        numero.put("10101", "21");
        numero.put("10110", "22");
        numero.put("10111", "23");
        numero.put("11000", "24");
        numero.put("11001", "25");
        numero.put("11010", "26");
        numero.put("11011", "27");
        numero.put("11100", "28");
        numero.put("11101", "29");
        numero.put("11110", "30");
        numero.put("11111", "31");


    }

    /**
     *
     * Esse metodo confirma se os bits do cod confere com  am key
     * @param cod bits da instrucao do Registrador
     * @return a instrucao do Registradoe
     */
    public String getRegistrador(String cod) {
        if (registrador.containsKey(cod)) {
            return registrador.get(cod);
        } else {
            throw new IllegalArgumentException("Bits do registrador invalido");
        }
    }

    /**
     * Esse metodo imprime o numero do registrador escolhido
     * @param cod bits da instrucao do Registrador
     * @return
     */
     public String getNumero(String cod){
        if (numero.containsKey(cod)) {
            return numero.get(cod);
        } else {
            throw new IllegalArgumentException("numero invalido");
        }
    }
}
