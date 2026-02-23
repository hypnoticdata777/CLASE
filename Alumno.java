public class Alumno extends Usuario {
    private String matricula;

    public Alumno(String nombre, String matricula) {
        super(nombre);
        this.matricula = matricula;
    }

    public Alumno(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    public Alumno() {
        super();
    }

    @Override
    public void mostrartipo() {
        System.out.println("Soy un alumno");
    }

    @Override
    public String toString() {
        return "Alumno{nombre='" + nombre + "', matricula='" + matricula + "'}";
    }
}
