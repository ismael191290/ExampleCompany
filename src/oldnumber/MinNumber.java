/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oldnumber;

import java.util.Scanner;

/**
 *
 * @author Isma 101101 is product of 143 and 707 and . 793397 is product of 869
 * and 913.
 */
public class MinNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa numero");
        int numero = s.nextInt();

        int mod = 0;

        if (numero >= 101101 && numero < 1000000) {
            for (int i = 1; i < 1000; i++) {
                if ((numero % i) == 0) {
                    int aux = i;
                    if (aux > 99 && aux < 1000) {
                        mod = i;
                    }
                }
            }
            if (mod != 0) {
                int divNumero = (numero / mod);
                System.out.println("Numeros divisores " + mod + " - " + divNumero);
                System.out.println("" + numero);
            } else {
                System.out.println("Tu numero solo es divisible entre la unidad");
            }

        } else {

            System.out.println("El numero debe ser mayor a 101,101 y menor a 1,000,000");

        }

    }

}
