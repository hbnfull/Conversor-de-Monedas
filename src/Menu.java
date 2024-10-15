import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void menu() throws IOException, InterruptedException {
        int opcion = 1;
        while (opcion != 7){
            opcion = seleccionarOpcion();
            compararOpciones(opcion);
        }
    }

    public static int seleccionarOpcion(){
        System.out.println("**********************************************");
        System.out.println("Sea bienvenido/a al conversor de monedas c:");
        System.out.println("");
        System.out.println("1.- Dolar a Peso Argentino");
        System.out.println("2.- Peso Argentino a Dolar");
        System.out.println("3.- Dolar a Real Brasileño");
        System.out.println("4.- Real Brasileño a Dolar");
        System.out.println("5.- Dolar a Peso Colombiano");
        System.out.println("6.- Peso Colombiano a Dolar");
        System.out.println("7.- Salir");
        System.out.println("");
        System.out.println("Elija una opcion valida:");
        System.out.println("**********************************************");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void compararOpciones(int opcion) throws IOException, InterruptedException {
        switch (opcion) {
            case 1:
                System.out.println("Ingrese los Dolares a convertir en Peso Argentino");
                Request.conversor("USD", "ARS", ingresarMonedas());
                break;
            case 2:
                System.out.println("Ingrese los Pesos Argentinos a convertir en Dolares");
                Request.conversor("ARS", "USD", ingresarMonedas());
                break;
            case 3:
                System.out.println("Ingrese los Dolares a convertir en Reales Brasileños");
                Request.conversor("USD", "BRL", ingresarMonedas());
                break;
            case 4:
                System.out.println("Ingrese los Reales Brasileños a convertir en Dolares");
                Request.conversor("BRL", "USD", ingresarMonedas());
                break;
            case 5:
                System.out.println("Ingrese los Dolares a convertir en Pesos Colombianos");
                Request.conversor("USD", "COP", ingresarMonedas());
                break;
            case 6:
                System.out.println("Ingrese los Pesos Colombianos a convertir en Dolares");
                Request.conversor("COP", "USD", ingresarMonedas());
                break;
            case 7:
                System.out.println("Hasta pronto!");
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

    public static Double ingresarMonedas(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
