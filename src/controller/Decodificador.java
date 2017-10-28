/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.TipoI;
import model.TipoJ;

/**
 *
 * Essa classe recebe os bits e retorna a Instrução
 * @author Asaf Santana
 */
public class Decodificador {

    private String binario;//guarda obinario
    private String tipo;//guarda o tipo da instrução
    private String instrucao;//guarda a intrução
    private TipoI tipoI;// usada para confirmar de é do tipo I
    private TipoJ tipoJ;//usada para confirmar se é do tipo J
    private DecTipoR decR;//decodificador do tipo R
    private DecTipoI decI;//decodificador do tipo I
    private DecTipoJ decJ;//decodificador do tipo J

    /**
     *
     * @param bin recebe o binario para formar a instrucao
     * @throws Exception
     */
    public Decodificador(String bin) throws Exception {
        setInstrucao(bin);
    }

    /**
     *
     * @return a instrução
     */
    public String getInstrucao() {
        return instrucao;
    }

    /**
     * descobre qual tipo de instrucão que os bits são e configura
     * as instruçãos
     * @param bin
     * @throws Exception
     */
    private void setInstrucao(String bin) throws Exception {
        tipoI = new TipoI();
        tipoJ = new TipoJ();

        setBinario(bin);
        String opcode = binario.substring(0, 6);

        if (opcode.equals("000000")) {
            this.tipo = "R";
            decR = new DecTipoR(binario);
            this.instrucao = decR.getInstrucao();

        } else if (tipoI.isOpcode(opcode)) {
            this.tipo = "I";
            decI = new DecTipoI(binario);
            this.instrucao = decI.getInstrucao();

        } else if (tipoJ.isOpcode(opcode)) {

            this.tipo = "J";
            decJ = new DecTipoJ(binario);
            this.instrucao = decJ.getInstrucao();

        } else throw new IllegalArgumentException("instrucao invalida");

    }

    /**
     *
     * @return o tipo da indtrução
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @return o binario configurado
     */
    public String getBinario() {
        return binario;
    }

    /**
     *
     * @param bin recebe o binario caso seja menor que 32 bits
     * ele completa
     * @throws Exception
     */
    private void setBinario(String bin) throws Exception {
        Integer num = 0;


        if (bin.substring(0, 2).equals("0x")) {
            bin = bin.substring(2, bin.length());
            num = Integer.parseInt(bin, 16);
        } else {
            num = Integer.parseInt(bin);
        }


        this.binario = Integer.toBinaryString(num);
        if (binario.length() <= 31) {
            do {
                binario = "0" + binario;
            } while (binario.length() <= 31);
        } else {
            throw new IllegalArgumentException("Maior que 32 bits");
        }
    }

    /**
     * Chama os metodos print do tipo
     * @throws Exception
     */

    public void printIstrucoes() throws Exception {
        switch (getTipo()) {
            case "R": {
                decR.printR();
                break;
            }
            case "I": {
                decI.printI();
                break;
            }
            default: {
                decJ.printJ();
            }
        }
    }

}
