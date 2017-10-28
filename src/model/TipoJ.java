/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *Essa classe guarda as instruções do tipo J
 * @author Asaf Santana
 */
public class TipoJ {
    private final Map<String, String> instrucao = new HashMap<>();

    public TipoJ() {
        addInstrucoes();
    }

    /**
     *
     * adiciona as instruões com os Keys que são os bits
     */
    private void addInstrucoes() {
           instrucao.put("000010", "j");
           instrucao.put("000011", "jal");
           
    }

    /**
     *
     * @param opcode pede os bits da instrução
     * @return um boleano dizendo que os bits confere ou não com a key
     */
    public boolean isOpcode(String opcode){
        return instrucao.containsKey(opcode);
    }


    /**
     *
     * Esse metodo confirma se os bits do cod confere com  am key
     * @param cod bits da instrucao dotipo J
     * @return a instrucao do tipo J
     */
    public String getInstrucao(String cod) {
        if (instrucao.containsKey(cod)) {
            return instrucao.get(cod);
        } else {
            throw new IllegalArgumentException("Bits do registrador invalido");
        }
    }
}
