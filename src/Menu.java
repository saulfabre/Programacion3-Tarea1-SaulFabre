import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

     public static void main(String[] args) {

    }

    public static void calculadoraBasica() {

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

    public static void numeroParImpar() {

        System.out.print(">> Ingrese su numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {

            System.out.println(">> Numero Par");
        }

        else {

            System.out.println(">> Numero Impar");
        }
    }

    public static void tablaMultiplicar() {

        System.out.println("================================");
        System.out.println("       Tabla Multiplicar");
        System.out.println("================================");

        System.out.print(">> Ingrese su numero: ");
        int numero = scanner.nextInt();

        System.out.print(">> Ingrese su limite: ");
        int limite = scanner.nextInt();

        System.out.println("================================");
        System.out.println("         Tabla Del " + numero);
        System.out.println("================================");

        System.out.println("--------------------------------");
        for (int i = 1; i <= limite; i++) {

            System.out.println(numero + " * " + i + " = " + (numero * i));

        }
        System.out.println("--------------------------------");
    }
}
