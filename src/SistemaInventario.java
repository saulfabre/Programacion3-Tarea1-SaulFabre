import java.util.ArrayList;

public class SistemaInventario {

    ArrayList<SistemaInventario> inventario = new ArrayList<>();

    private String nombre;
    private String descripcion;
    private int stock;
    private float precioProducto;

    public SistemaInventario() {

        setNombre(nombre);
        setDescripcion(descripcion);
        setStock(stock);
        setPrecioProducto(precioProducto);
    }

    public SistemaInventario(String nombre, String descripcion, int stock, float precio) {

        setNombre(nombre);
        setDescripcion(descripcion);
        setStock(stock);
        setPrecioProducto(precio);
    }

    public String getNombre() {

        return nombre;
    }

    public String getDescripcion() {

        return descripcion;
    }

    public int getStock() {

        return stock;
    }

    public float getPrecioProducto() {

        return precioProducto;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;
    } 

    public void setStock(int stock) {

        this.stock = stock;
    } 

    public void setPrecioProducto(float precio) {

        this.precioProducto = precio;
    }

    public void agregarProducto(SistemaInventario producto) {

        inventario.add(producto);
        System.out.println(">> Producto " + producto.getNombre() + " agregado correctamente");
        System.out.println("--------------------------------");
    }

    public void eliminarProducto(String nombre) {

            for (SistemaInventario producto : inventario) {

            if (nombre.equals(producto.getNombre())) {

            inventario.remove(producto);
            System.out.println(">> Producto " + producto + " eliminado correctamente");

            }
        }         
        System.out.println(">> Producto no encontrado");
            
        }

    public float calcularValorInventario() {

        float valorInventario = 0;

        for (SistemaInventario producto : inventario) {

            valorInventario+= producto.getPrecioProducto() * producto.getStock();
        }

        return valorInventario;
    }

    public void mostarProducto() {

        System.out.println("================================");
        System.out.println("       Inventario Basico");
        System.out.println("================================");
        System.out.println("--------------------------------");

        for (SistemaInventario producto : inventario) {

        System.out.println(">> Nombre del producto: " + producto.getNombre());
        System.out.println(">> Descripcion del producto: " + producto.getDescripcion());
        System.out.println(">> Stock del producto: " + producto.getStock());
        System.out.println("--------------------------------");

        }
    }  

    public void mostrarValorTotal() {
        System.out.println(">> Valor total del inventario: " + calcularValorInventario());
        System.out.println("--------------------------------");
    }
}
