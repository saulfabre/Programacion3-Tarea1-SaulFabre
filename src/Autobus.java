public class Autobus extends Vehiculos {

    private int numeroPasajeros;

    public Autobus(String marca, String modelo, String color, int numueroPasajeros) {

        super(marca, modelo, color);
        this.numeroPasajeros = numueroPasajeros;
    }

    public void mostrarDatos() {

        super.mostrarDatos();
        System.out.println(">> Numero de pasajeros: " + numeroPasajeros);
        System.out.println("--------------------------------");
    }

    
}
