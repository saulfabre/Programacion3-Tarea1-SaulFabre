public class Vehiculos {

    private String marca;
    private String modelo;
    private String color;

    public Vehiculos(String marca, String modelo, String color) {

        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void encenderVehiculo() {

        System.out.println(">> Vehiculo se enciende...");
    }

    public void apagarVehiculo() {

        System.out.println(">> Vehiculo se apaga...");
    }

    public void mostrarDatos() {

        System.out.println("--------------------------------");
        System.out.println(">> Marca: " + marca);
        System.out.println(">> Modelo: " + modelo);
        System.out.println(">> Color: " + color);
    }
    
}
