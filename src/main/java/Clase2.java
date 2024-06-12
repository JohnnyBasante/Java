import java.util.Scanner;

public class Clase2 {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de cambio de pesos a dolar");
        double tipoCambio= scanner.nextDouble();

        System.out.println("Ingrese la cantidad de pesos a convertir");
        double cantidaPesos= scanner.nextDouble();

        double cantidaDolares = cantidaPesos / tipoCambio;

        System.out.println("Son: "+cantidaDolares+" Dolares");
        scanner.close();
    }
}
