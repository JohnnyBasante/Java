package Actividades;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar la palabra o frase
        System.out.print("Ingrese la palabra verificar: ");
        String palabra = scanner.nextLine().toLowerCase().replaceAll("[^a-záéíóúüñ]","");
        //System.out.print(palabra + "\n");

        String palabraInvertida = "";
        for (int i= palabra.length() - 1; i >= 0; i--){
            char caracter = palabra.charAt(i);
            palabraInvertida += caracter;
        }

        System.out.print("Palabra Invertida: "+ palabraInvertida +"\n");

        if(palabra.equals(palabraInvertida)){
            System.out.print("La palabra " +  palabra +" Es palindroma");
        }else {
            System.out.print("La palabra " + palabra +" No es palindroma");
        }
        scanner.close();
    }
}
