/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *Essa classe guarda as intruçãoes do tipo I
 * @author Asaf Santana
 */
public class TipoI {

    private final Map<String, String> instrucao = new HashMap<>();

    public TipoI() {
        addInstrucoes();
    }

    /**
     *
     * adiciona as instruões com os Keys que são os bits
     */
    private void addInstrucoes() {
        instrucao.put("001000", "addi");
        instrucao.put("001001", "addiu");
        instrucao.put("001100", "andi");
        instrucao.put("001111", "lui");
        instrucao.put("001101", "ori");
        instrucao.put("001010", "slti");
        instrucao.put("000100", "beq");
        instrucao.put("000101", "bne");
        instrucao.put("100000", "lb");
        instrucao.put("100100", "lbu");
        instrucao.put("100001", "lh");
        instrucao.put("100011", "lw");
        instrucao.put("101000", "sb");
        instrucao.put("101001", "sh");
        instrucao.put("101011", "sw");

    }

    /**
     *
     * @param opcode pede os bits da instrução
     * @return um boleano dizendo que os bits confere ou não com a key
     */
    public boolean isOpcode(String opcode) {
        return instrucao.containsKey(opcode);
    }

    /**
     *
     * Esse metodo confirma se os bits do cod confere com  am key
     * @param cod bits da instrucao dotipo I
     * @return a instrucao do tipo I
     */
    public String getIstrucao(String cod) {
        if (instrucao.containsKey(cod)) {
            return instrucao.get(cod);
        } else {
            throw new IllegalArgumentException("Bits do registrador invalido");
        }
    }
}
