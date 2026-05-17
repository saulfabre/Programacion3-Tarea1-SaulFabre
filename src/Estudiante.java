import java.util.Scanner;

public class Estudiante {

    Scanner scanner = new Scanner(System.in);

    private String nombre;
    private String apellido;
    private String matricula;
    private String carrera;
    private String correo;
    private int cuatrimestre;
    private int indice;

    public Estudiante() {

        setNombre(nombre);
        setApellido(apellido);
        setMatricula(matricula);
        setCarrera(carrera);
        setCorreo(correo);
        setCuatrimestre(cuatrimestre);
        setIndice(indice);
    }

    public Estudiante(String nombre, String apellido, String matricula, String carrera, String correo, int cuatrimestre, int indice) {

        setNombre(nombre);
        setApellido(apellido);
        setMatricula(matricula);
        setCarrera(carrera);
        setCorreo(correo);
        setCuatrimestre(cuatrimestre);
        setIndice(indice);
    }

    public String getNombre() {

        return nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public String getMatricula() {

        return matricula;
    }

    public String getCarrera() {

        return carrera;
    }

    public String getCorreo() {

        return correo;

    }

    public int getCuatrimestre() {

        return cuatrimestre;
    }

    public int getIndice() {
        
        return indice;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public void setMatricula(String matricula) {

        this.matricula = matricula;
    }

    public void setCarrera(String carrera) {

        this.carrera = carrera;
    }

    public void setCorreo(String correo) {

        this.correo = correo;

    }

    public void setCuatrimestre(int cuatrimestre) {

        this.cuatrimestre = cuatrimestre;
    }

    public void setIndice(int indice) {
        
        this.indice = indice;
    }

}