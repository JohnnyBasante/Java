package Actividades;

//El programa pedirá al usuario que ingrese un número entero positivo.
//Luego, el programa imprimirá todos los números desde 1 hasta el número ingresado,
//indicando si cada número es par o impar.

import java.util.Scanner;

public class Actividad2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Solicitar el numero al usuario
        System.out.print("Ingrese un número entero positivo");
        int num = scanner.nextInt();

        if (num<=0) {
            System.out.print("Error: El número digitado no es positivo");
        }
        else{
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " es par ");
                } else {
                    System.out.println(i + " es impar");
                }
            }
        }
    scanner.close();
    }
}
