public class Usuario {
    protected String nombre;
    protected int edad;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Usuario() {
    }

    public void mostrartipo() {
        System.out.println("Soy un usuario");
    }

    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', edad=" + edad + "}";
    }
}
