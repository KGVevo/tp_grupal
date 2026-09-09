package SistemaGestionZoologico;

public class Mamifero extends Animal{

    private Pelaje tipoPelaje;

    public Mamifero(String nombre, String especie, int hambre, int salud, int higiene, Pelaje tipoPelaje) {
        super(nombre, especie, hambre, salud, higiene);
        this.tipoPelaje = tipoPelaje;
    }

    public Pelaje getTipoPelaje() {
        return tipoPelaje;
    }

    public String comer()
    {
        return "Ejecucion de alimentarse";
    }

    public String enfermarse()
    {
        return "Ejecucion de enfermarse";
    }

    public String ensuciarse()
    {
        return "Ejecucion de ensuciarse";
    }

    public String toString()
    {
        return "Animal [Nombre: "+super.getNombre()+", Especie: "+super.getEspecie()+", Hambre: "+super.getHambre()+
                ", Salud: "+super.getSalud()+", Higiene: "+super.getHigiene()+", Pelaje: "+this.tipoPelaje+"]";
    }

}
