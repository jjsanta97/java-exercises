package Actividad2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Actividad2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1;

        try {
            System.out.println("Ingresa un número positivo:");
            num1 = scanner.nextInt();

            if (num1 < 0) {
                System.out.println("Debes ingresar un número positivo, inténtalo de nuevo.");
            } else {
                for (int i = 0; i <= num1; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i + " es par");
                    } else if (i % 2 == 1) {
                        System.out.println(i + " es impar");
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar un número entero.");
        } finally {
            scanner.close();
        }
    }
}
