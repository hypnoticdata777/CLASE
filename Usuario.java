public class Usuario {
    protected String nombre;
    protected int edad;

    public Usuario(String nombre) {
        this.nombre = nombre;

    }
    public Usuario(String nimbre, int edad){
        this.nombre = nombre;
        this.edad = edad;

    }

    public Usuario (){

    }
    public void mostrartipo(){
        System.out.println("Soy un usuario");
    }
}
