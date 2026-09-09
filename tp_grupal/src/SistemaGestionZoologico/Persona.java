package SistemaGestionZoologico;

public abstract class Persona {
    private static int contadorid = 1;
    private String nombre;
    private String dni;
    private int legajo;
    private double salario;

    //Constructor
    public Persona (String nombre, String dni, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.legajo = contadorid;
        this.salario = salario;
        contadorid++;
    }


    //Metodos
    public String getNombre()
    {
        return this.nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getLegajo() {
        return legajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public abstract String toString();
}
