/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Registrador;
import model.TipoR;

/**
 * Essa classe decodifica instruçõesdo tipo R
 * @author Asaf Santana
 */
public class DecTipoR  {

    private final String Rs;
    private final String Rt;
    private final String Rd;
    private final String Shamp;
    private final String Funct;
    private final Registrador reg;
    private final TipoR tipo;


    /**
     *
     * @param binario
     */
    
    public DecTipoR(String binario) {
        this.tipo = new TipoR();        
        this.reg = new Registrador();
        
        
        this.Rs = binario.substring(6, 11);
        this.Rt = binario.substring(11, 16);
        this.Rd = binario.substring(16, 21);
        this.Shamp = binario.substring(21, 26);
        this.Funct = binario.substring(26, 32);
    }

    /**
     * esse metodo configura a instrução do tipo R
     * @return a instruçãó
     * @throws Exception
     */

    public String getInstrucao() throws Exception {
        String guardar;
        guardar = tipo.getInstrucao(Funct)+" ";
        guardar = guardar + reg.getRegistrador(Rd)+", ";
        guardar = guardar + reg.getRegistrador(Rs)+", ";
        guardar = guardar + reg.getRegistrador(Rt)+" ";
        
        return guardar;  
    
    }

    /**
     * esse metodo printa os numeros dos registradores
     * @throws Exception
     */
     public void printR() throws Exception {
        System.out.println(" * RD: "+ reg.getNumero(this.Rd));
        System.out.println(" * RS: "+ reg.getNumero(this.Rs));
        System.out.println(" * RT: "+ reg.getNumero(this.Rt));
    }
    
    
}
