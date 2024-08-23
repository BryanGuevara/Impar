package clases;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("=================================================== <[Entrada]> ==================================================");
            System.out.print("Escriba hasta que numero quiere calcular los impares: ");
            int num = scan.nextInt();
            
            System.out.println("=================================================== <[Calculo]> ==================================================");
            if (num > 0) {
                for (int i = 0; i <= num; i++) {
                    if (i % 2 == 1) {
                        System.out.println(i);
                    }
                }
            } else {
            System.out.println("=================================================== <[Error]> ====================================================");
                System.err.println("El numero debe ser mayor a 0");
            System.out.println("==================================================================================================================");
            }
            System.out.println("==================================================================================================================");
        } catch (InputMismatchException e) {
            System.out.println("=================================================== <[Error]> ====================================================");
            System.err.println("Error, solo se admiten numeros");
            System.out.println("==================================================================================================================");
        }
    }

}
