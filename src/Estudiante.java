public class Estudiante {

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

    public void mostrarDatos() {

        System.out.println("--------------------------------");
        System.out.println(">> Nombre: " + getNombre());
        System.out.println(">> Apellido: " + getApellido());
        System.out.println(">> Matricula: " + getMatricula());
        System.out.println(">> Carrera: " + getCarrera());
        System.out.println(">> Correo: " + getCorreo());
        System.out.println(">> Cuatrimestre: " + getCuatrimestre());
        System.out.println(">> Indice: " + getIndice());
        System.out.println("--------------------------------");
    }

}