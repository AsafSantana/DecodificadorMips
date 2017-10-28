/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Registrador;
import model.TipoJ;

/**
 * Essa classe decodifica instruçõesdo tipo J
 *
 * @author Asaf Santana
 */
public class DecTipoJ {
    private final String opcode;
    private String endereco;
    private final Registrador reg;
    private final TipoJ tipo;

    public DecTipoJ(String binario) {
        this.tipo = new TipoJ();
        this.reg = new Registrador();

        this.opcode = binario.substring(0, 6);
        this.endereco = binario.substring(6, 32);


    }

    /**
     * esse metodo configura a instrução do tipo J
     *
     * @return a instrução
     * @throws Exception
     */
    public String getInstrucao() throws Exception {
        String guardar;

        String binario = this.endereco;
        int decimal = Integer.parseInt(binario, 2);
        this.endereco = String.valueOf(decimal);

        guardar = tipo.getInstrucao(opcode) + " ";
        guardar = guardar + decimal + " ";

        return guardar;

    }

    /**
     * esse metodo printa os numeros dos registradores
     *
     * @throws Exception
     */
    public void printJ() throws Exception {
        System.out.println(" * Opcode: " + reg.getRegistrador(opcode));
        System.out.println(" * Endereço: " + this.endereco);

    }


}
