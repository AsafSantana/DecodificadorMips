/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Registrador;
import model.TipoI;

/**
 *
 *  Essa classe decodifica instruçõesdo tipo I
 * @author Asaf Santana
 */
public class DecTipoI {

    private final String opcode;
    private final String Rs;
    private final String Rt;
    private String Imm;
    private final Registrador reg;
    private final TipoI tipo;

    public DecTipoI(String binario) {
        this.tipo = new TipoI();
        this.reg = new Registrador();

        this.opcode = binario.substring(0, 6);
        this.Rs = binario.substring(6, 11);
        this.Rt = binario.substring(11, 16);
        this.Imm = binario.substring(16, 32);

    }

    /**
     * esse metodo configura a instrução do tipo I
     *
     * @return a instrução
     * @throws Exception
     */

    public String getInstrucao() throws Exception {
        String guardar;

        String binario = this.Imm;
        int decimal = Integer.parseInt(binario, 2);
        this.Imm = String.valueOf(decimal);

        guardar = tipo.getIstrucao(opcode) + " ";
        guardar = guardar + reg.getRegistrador(Rt) + ", ";
        guardar = guardar + reg.getRegistrador(Rs) + ", ";
        guardar = guardar + decimal + " ";

        return guardar;

    }


    /**
     * esse metodo printa os numeros dos registradores
     * @throws Exception
     */

    public void printI() throws Exception {
        System.out.println(" * RT: " + reg.getNumero(this.Rt));
        System.out.println(" * RS: " + reg.getNumero(this.Rs));
        System.out.println(" * Imediato: " + this.Imm);
    }

}
