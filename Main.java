public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Alumno("Daniel", "A001");
        Usuario u2 = new Profesor("Laura", "Sistemas");
        Usuario u3 = new Alumno("Ana", 20, "B042");

        // toString() - display object data
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);

        System.out.println("---");

        // mostrartipo() - polymorphism in action
        u1.mostrartipo();
        u2.mostrartipo();
        u3.mostrartipo();
    }
}
