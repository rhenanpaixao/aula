/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rhenan;

/**
 *
 * @author aluno
 */
public class testeacrecdecres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int prefixo = 10;
        int sufixo = 40;

        int diferencaPrefixo, diferencaSufixo;

        diferencaPrefixo = ++prefixo;

        System.out.println("Diferenca" + diferencaPrefixo);
        System.out.println("Prefixo" + prefixo);

        diferencaSufixo = sufixo++;

        System.out.println("Diferenca2:" + diferencaSufixo);
        System.out.println("Sufixo" + sufixo);

    }

}
