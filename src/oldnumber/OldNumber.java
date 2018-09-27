/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oldnumber;

import java.util.Scanner;

/**
 *
 * @author Isma
 */
public class OldNumber {

    /**
     * @param args the command line arguments
     */
    /*

     */
    public static void main(String[] args) {

        Scanner leers = new Scanner(System.in);
        System.out.println("Candiad de Numeros consecutivos a tomar:");
        while (!leers.hasNextInt()) {
            System.out.println("Ingresa solo numeros, por favor");
            leers.next();
        }
        String caracteresNumeroAux = leers.nextLine();
        if (caracteresNumeroAux.length() > 1) {
            Scanner leerss = new Scanner(System.in);
            System.out.println("Candiad de Numeros consecutivos a tomar:");
            System.out.println("Solo debe tener un digito");
            while (!leerss.hasNextInt()) {
                System.out.println("Ingresa solo numeros, por favor");
                leerss.next();
            }
            caracteresNumeroAux = leerss.nextLine();
        }

        int caracteresNumero = Integer.parseInt(caracteresNumeroAux);
        if (caracteresNumero <= 1 && caracteresNumero <= 7) {
            Scanner leerss = new Scanner(System.in);
            System.out.println("Candiad de Numeros consecutivos a tomar:");
            System.out.println("Debe ser Mayor a 1 y menor que 7");
            while (!leerss.hasNextInt()) {
                System.out.println("Ingresa solo numeros, por favor");
                leerss.next();
            }
            caracteresNumeroAux = leerss.nextLine();
        }
        caracteresNumero = Integer.parseInt(caracteresNumeroAux);
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la Serie de numeros");
        String total = "" + leer.nextLine();

        int tCaracteres = total.length();
        int resultMax = 0;
        System.out.println(total);
        System.out.println(caracteresNumero + " " + tCaracteres);
        int resultFull[] = new int[tCaracteres];

        for (int i = 0; i < tCaracteres; i++) {
            int m = Math.max(i, tCaracteres);
            if (total.subSequence(i, m).toString().length() < caracteresNumero) {
                break;
            }
            String cadena = total.substring(i, (caracteresNumero + i));
            int suma = 1;

            for (int j = 0; j < cadena.length(); j++) {
                if (Character.isDigit(cadena.charAt(j))) {
                    int aux = Integer.parseInt("" + cadena.charAt(j));
                    suma *= aux;
                }
            }
            resultFull[i] = suma;
        }
        resultMax = resultFull[0];
        for (int l = 1; l < resultFull.length; l++) {
            if (resultMax < resultFull[l]) {
                resultMax = resultFull[l];
            }
        }
        System.out.println("EL valor maximo de la Serie es: " + resultMax);
    }
}
