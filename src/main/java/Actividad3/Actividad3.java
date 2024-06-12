package Actividad3;

import java.util.Scanner;

public class Actividad3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena de texto: ");
        String string_user = scanner.nextLine();
        String[] char_punt = {",", ".", ";"};
        StringBuilder inverted_string = new StringBuilder();

        // Tratamiento de la cadena de texto
        string_user = string_user.toLowerCase().replace(" ", "");

        for (String s : char_punt) {
            string_user = string_user.replace(s, "");
        }

        for (int j = string_user.length() - 1; j >= 0; j--) {
            inverted_string.append(string_user.charAt(j));
        }

        if (string_user.contentEquals(inverted_string)) {
            System.out.println("La cadena de texto es un palíndromo.");
        } else {
            System.out.println("La cadena de texto no es un palíndromo.");
        }

        scanner.close();
    }
}
