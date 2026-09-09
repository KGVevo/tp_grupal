package SistemaGestionZoologico;

public class Cuidador extends Persona {

    //Atributos
    private Especialidad especialidad;

    //Getter
    public Cuidador(String nombre, String dni, int legajo, double salario, Especialidad especialidad) {
        super(nombre, dni, legajo, salario);
        this.especialidad = especialidad;
    }

    //Metodos
    public String alimentar(){

        return "";
    }
    public String vacunar(){


        return "";
    }
    public String limpiar(){


        return "";
    }


    @Override
    public String toString() {
        return "[Nombre: "+ getNombre() + ", DNI: "+ getDni() +", Legajo: "+ getLegajo() + ", Salario: "+ getLegajo() + ", Especialidad: "+ this.especialidad +"]";
    }

}
