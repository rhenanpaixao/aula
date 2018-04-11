/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rhenan;

import java.util.Scanner;

/**
 *
 * @author RHENAN
 */
public class ExpExer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int media;
        int n1;
        int n2;
        int n3 = 0

        System.out.println("Informe as duas notas ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        media = (n1 + n2) / 2;

        System.out.println("Sua media é " + media);

        if (media < 6) {
            n3 = entrada.nextInt();
            System.out.println("Informe N3");
            int exame = 0;
            exame = (media + n3) / 3;
            System.out.println("Voçe está de exame! ");

        } else {
            System.out.println("Aprovado!" + media);

        }

    }

}
