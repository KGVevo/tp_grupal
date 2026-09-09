package SistemaGestionZoologico;

public class Cuidador extends Persona {

    //Atributos
    private Especialidad especialidad;

    //Getter
    public Cuidador(String nombre, String dni, double salario, Especialidad especialidad) {
        super(nombre, dni, salario);
        this.especialidad = especialidad;
    }

    //Metodos
    public String alimentar(){
        return "Ha alimentado al animal";
    }
    public String vacunar(){
        return "Ha vacunado al animal";
    }
    public String limpiar(){
        return "Ha limpeado al animal";
    }


    @Override
    public String toString() {
        return "[Nombre: "+ super.getNombre() + ", DNI: "+ super.getDni() +", Legajo: "+
                super.getLegajo() + ", Salario: "+ super.getSalario() + ", Especialidad: "+ this.especialidad +"]";
    }



    @Override
    public boolean equals(Object obj) {
        boolean rta = false;

        if(obj == this){
            rta = true;
        }

        if(obj == null || getClass() != obj.getClass()){
            rta = false;
        }


        Cuidador aux = (Cuidador) obj;
        rta = this.getLegajo() == aux.getLegajo();

        return rta;
    }


}
