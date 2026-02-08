public class Alumno extends Usuario {
    private String matricula;

    public Alumno (String nombre,String matricula ) {
        super(nombre);
        this.matricula = matricula;
    }

    public Alumno (String nombre, int edad, String matricula){
        super(nombre, edad);
        this.matricula = matricula;
    }

    public Alumno(){
        super();
    }
    
}
