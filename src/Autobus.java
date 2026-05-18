public class Autobus extends Vehiculos {

    private int numeroPasajeros;

    public Autobus(String marca, String modelo, String color, int numueroPasajeros) {

        super(marca, modelo, color);
        this.numeroPasajeros = numueroPasajeros;
    }

    public void mostrarDatos() {

        System.out.println("--------------------------------");
        System.out.println("Autobutos hereda de vehiculo: ");
        super.mostrarDatos();
        System.out.println("--------------------------------");
        System.out.println("Atributo del autobus: ");
        System.out.println(">> Numero de pasajeros: " + numeroPasajeros);
        System.out.println("--------------------------------");
    }  
}
