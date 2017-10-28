/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Decodificador;

import java.util.Scanner;

/**
 * @author Asaf Santana
 */
public class View {
    static private final Scanner leia = new Scanner(System.in);
    private Decodificador decodificador;

    
    /**
     * 
     * @throws Exception 
     */
    public void iniciar() throws Exception {
        inciarProgrma();

    }

    /**
     * 
     * @throws Exception 
     */
    private void inciarProgrma() throws Exception {
        boolean flag;
        int cont;
        String leitura;

        System.out.println("************************* BEM VINDO AO PROGRAMA *************************");
        do {

            try {
                System.out.println("\n\nDigite o numero para procurar a instrução");
                leitura = leia.nextLine();


                decodificador = new Decodificador(leitura);

                System.out.println("\n\nInstrução: " + decodificador.getInstrucao());
                System.out.println("Tipo: " + decodificador.getTipo());
                System.out.println("Operadores:");
                decodificador.printIstrucoes();

            } catch (Exception e) {
                System.err.println(e);
            }

            System.out.println("\n\nDigite              para");
            System.out.println("  1                   continuar");
            System.out.println("  0                   sair");
            cont = leia.nextInt(); leia.nextLine();
            switch (cont) {
                case 1:
                    flag = false;
                    break;
                case 0:
                    flag = true;
                    System.out.println("Obrigado por usar nosso programa");
                    break;
                default:
                    System.out.println("codigo invalido");
                    flag = true;

            }

        } while (!flag);

    }
}
