import java.util.Scanner;

public class Menu {

    static public void main(String[] args) {

    }

    public static void calculadoraBasica() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       Calculadora Basica");
        System.out.println("================================");
        System.out.println("[1] Sumar");
        System.out.println("[2] Restar");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Dividir");
        System.out.println("[5] Salir\n");
        System.out.print(">> Opcion: ");

        int opcion = scanner.nextInt();

        System.out.println("----------------------------------");

        System.out.print(">> Numero 1: ");
        float numero1 = scanner.nextFloat();

        System.out.print(">> Numero 2: ");
        float numero2 = scanner.nextFloat();

        switch ((opcion)) {

            case 1:
                System.out.println(">> Resultado: " + (numero1 + numero2));
                System.out.println("----------------------------------");
                break;
            
            case 2:
                System.out.println(">> Resultado: " + (numero1 - numero2));
                System.out.println("----------------------------------");
                break;
            
            case 3:
                System.out.println(">> Resultado: " + (numero1 * numero2));
                System.out.println("----------------------------------");
                break;

            case 4:
                System.out.println(">> Resultado: " + (numero1 / numero2));
                System.out.println("----------------------------------");
                break;

            default:
                System.out.println(">> Opcion Invalida");
        }
    }

}