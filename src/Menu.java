import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

     public static void main(String[] args) {

        int opcion;

        do {

        System.out.println("================================");
        System.out.println("        MENU DE OPCIONES ");
        System.out.println("================================");
        System.out.println("[1] Calculadora basica");
        System.out.println("[2] Numero par o impar");
        System.out.println("[3] Tabla de multiplicar");
        System.out.println("[4] Contador de vocales");
        System.out.println("[5] Promedio de notas");
        System.out.println("[6] Clase Estudiante");
        System.out.println("[7] Cuenta Bancaria");
        System.out.println("[8] Herencia de vehiculos");
        System.out.println("[9] Matriz 3x3");
        System.out.println("[10] Sistema basico de inventario");
        System.out.println("[11] Salir de la aplicacion\n");
        System.out.print("Opcion: ");

        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                calculadoraBasica();
                break;

            case 2:
                numeroParImpar();
                break;

            case 3:
                tablaMultiplicar();
                break;

            case 4:
                contadorVocales();
                break;

            case 5:
                promedioNotas();
                break;

            case 6:
                Estudiante estudiante = new Estudiante("Saul", "Fabre Fernandez", "1000-5958", "Ing. Sistemas", "saulfabre_@ucne.edu.do", 6, 1);
                estudiante.mostrarDatos();

                Estudiante estudiante2 = new Estudiante();
                estudiante2.setNombre("Pedro");
                estudiante2.setApellido("Hidalgo");
                estudiante2.setMatricula("123-456");
                estudiante2.setCarrera("Ing. Sistemas");
                estudiante2.setCorreo("algo@gmail.com");
                estudiante2.setCuatrimestre(3);
                estudiante2.setIndice(4);
                estudiante2.mostrarDatos();
                break;

            case 7:
                CuentaBancaria cuenta = new CuentaBancaria("Pedro", 65, 1, "Ahorros");
                CuentaBancaria cuenta2 = new CuentaBancaria("Maria", 100, 2, "Corriente");

                cuenta.mostrarDatos();
                cuenta2.mostrarDatos();

                cuenta.enviarBalance(2, cuenta2, 5);

                cuenta.mostrarDatos();
                cuenta2.mostrarDatos();

                cuenta.ingresarBalance(100);
                cuenta.mostrarDatos();
                
                cuenta.retirarBalance(50);
                cuenta.mostrarDatos();
                break;

            case 8:
                Carro carro = new Carro("Toyota", "Camry", "Blanco", 4);
                carro.mostrarDatos();
                carro.encenderVehiculo();
                carro.apagarVehiculo();

                Autobus autobus = new Autobus("Mercedes-Benz", "Tourismo", "Amarillo", 44);
                autobus.mostrarDatos();
                autobus.encenderVehiculo();
                autobus.apagarVehiculo();
                break;

            case 9: 
                matriz3x3();
                break;

            case 10:
                SistemaInventario inventario = new SistemaInventario();

                SistemaInventario arroz = new SistemaInventario("Arroz", "Pimco Premium", 15, 50);
                SistemaInventario chocolate = new SistemaInventario("Chocolate", "Blanco", 25, 15);
                SistemaInventario pan = new SistemaInventario();

                pan.setNombre("Pan");
                pan.setDescripcion("Pan");
                pan.setStock(1);
                pan.setPrecioProducto(5);

                inventario.agregarProducto(arroz);
                inventario.agregarProducto(chocolate);
                inventario.agregarProducto(pan);
                inventario.mostarProducto();
                inventario.calcularValorInventario();
                
                inventario.mostrarValorTotal();
                break;
        }

        } while (opcion != 11);

    }

    //Ejercicio 1
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

    //Ejercicio 2
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

    //Ejercicio 3
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

    //Ejercicio 4
    public static void contadorVocales() {

        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        System.out.print(">> Ingrese su palara: ");
        String palabra = scanner.nextLine();

        palabra = palabra.toLowerCase();
        char[] palabraChar = palabra.toCharArray();

        for (int i = 0; i < palabra.length(); i++) {

            switch (palabraChar[i]) {
                case 'a':
                    contadorA++;
                    break;
                
                case 'e':
                    contadorE++;
                    break;

                case 'i':
                    contadorI++;
                    break;

                case 'o':
                    contadorO++;
                    break;
                
                case 'u':
                    contadorU++;
                    break;
            
                default:
                    continue;
            }
        }

        System.out.println("================================");
        System.out.println("         Palabra: " + palabra);
        System.out.println("================================");
        System.out.println("--------------------------------");
        System.out.println(">> Vocal A: " + contadorA);
        System.out.println(">> Vocal E: " + contadorE);
        System.out.println(">> Vocal I: " + contadorI);
        System.out.println(">> Vocal O: " + contadorO);
        System.out.println(">> Vocal U: " + contadorU);
        System.out.println(">> Cantidad Total: " + (contadorA + contadorE + contadorI + contadorO + contadorU));
        System.out.println("--------------------------------");

    }

    //Ejercicio 5
    public static void promedioNotas() {

        System.out.println("================================");
        System.out.println("         Promedio Notas");
        System.out.println("================================");

        System.out.print(">> Cantidad de asignaturas: ");
        int cantidadAsignaturas = scanner.nextInt();

        float[] notas = new float[cantidadAsignaturas];

        float sumatoriaNotas = 0;

        for (int i = 0; i < cantidadAsignaturas; i++) {

            System.out.print(">> Calificacion asignatura " + (i + 1) + ": ");
            notas[i] = scanner.nextFloat();
            sumatoriaNotas+= notas[i];
        }

        float promedio = sumatoriaNotas / cantidadAsignaturas;

        System.out.println("--------------------------------");    
        for (int i = 0; i < notas.length; i++) {

            System.out.println(">> Nota " + (i + 1) + ": " + notas[i]);
        }    

        System.out.println(">> Promedio: " + promedio);

        if (promedio >= 70) {

            System.out.println(">> Aprobaste");

        }

        else {
            System.out.println(">> Desaprobaste");
        }
        System.out.println("--------------------------------");
    }

    //Ejercicio 9
    public static void matriz3x3() {

        int[][] matrizVacia = new int[3][3];

        for (int i = 0; i < matrizVacia.length; i++) {

            for (int j = 0; j < matrizVacia.length; j++) {

                System.out.print(">> Rellene su matriz en " + i + "," + j + ": ");
                matrizVacia[i][j] = scanner.nextInt();
            }
        }

        System.out.println("================================");
        System.out.println(" Matriz ingresada por el usuario");
        System.out.println("================================");
        System.out.println("--------------------------------");

        for (int i = 0; i < matrizVacia.length; i++) {

            for (int j = 0; j < matrizVacia.length; j++) {

                System.out.print(matrizVacia[i][j] + "   ");

            }
            System.out.println();
        }
        System.out.println("--------------------------------");
    }

}
