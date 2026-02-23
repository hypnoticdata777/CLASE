public class Profesor extends Usuario {
    private String departamento;

    public Profesor(String nombre, String departamento) {
        super(nombre);
        this.departamento = departamento;
    }

    @Override
    public void mostrartipo() {
        System.out.println("Soy un profesor");
    }

    @Override
    public String toString() {
        return "Profesor{nombre='" + nombre + "', departamento='" + departamento + "'}";
    }
}
