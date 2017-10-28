/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *Essa classe guardaas instruções do tipo R
 * @author Asaf Santana
 */
public class TipoR {

    private final Map<String, String> instrucao = new HashMap<>();

    public TipoR() {
        addInstrucoes();
    }

    /**
     *
     * adiciona as instruões com os Keys que são os bits
     */
    private void addInstrucoes() {
        instrucao.put("100000", "add");
        instrucao.put("100001", "addu");
        instrucao.put("100010", "sub");
        instrucao.put("100011", "subu");
        instrucao.put("011010", "div");
        instrucao.put("011000", "mult");
        instrucao.put("010000", "mfhi");
        instrucao.put("010010", "mflo");
        instrucao.put("100101", "or");
        instrucao.put("100100", "and");
        instrucao.put("100111", "nor");
        instrucao.put("101010", "slt");
        instrucao.put("100110", "xor");
        instrucao.put("000000", "sll");
        instrucao.put("000011", "sra");
        instrucao.put("000010", "srl");
        instrucao.put("001000", "jra");

    }

    /**
     *
     * Esse metodo confirma se os bits do cod confere com  am key
     * @param cod bits da instrucao dotipo R
     * @return a instrucao do tipo R
     */
    public String getInstrucao(String cod) {
        if (instrucao.containsKey(cod)) {
            return instrucao.get(cod);
        } else {
            throw new IllegalArgumentException("Bits da instrucao invalido");
        }
    }

}
