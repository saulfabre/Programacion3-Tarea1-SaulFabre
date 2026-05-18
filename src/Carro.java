public class Carro extends Vehiculos {
    
    private int cantidadPuertas;

    public Carro(String marca, String modelo, String color, int cantidadPuertas) {

        super(marca, modelo, color);
        this.cantidadPuertas = cantidadPuertas;
    }

    public void mostrarDatos() {

        System.out.println("--------------------------------");
        System.out.println(">> Carro hereda de vehiculo: ");
        super.mostrarDatos();
        System.out.println("--------------------------------");
        System.out.println("Atributo del carro: ");
        System.out.println(">> Cantidad de puertas: " + cantidadPuertas);
        System.out.println("--------------------------------");
    }
}
