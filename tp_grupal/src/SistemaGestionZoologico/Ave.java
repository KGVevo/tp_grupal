package SistemaGestionZoologico;

public class Ave extends Animal {

    private boolean estadoPlumaje;
    private Vuelo capacidadDeVuelo;

    public Ave(String nombre, String especie, int hambre, int salud, int higiene, boolean estadoPlumaje, Vuelo capacidadDeVuelo)
    {
        super(nombre, especie, hambre, salud, higiene);
        this.estadoPlumaje = estadoPlumaje;
        this.capacidadDeVuelo = capacidadDeVuelo;
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
        String estado_plumaje;

        if(this.estadoPlumaje == true)
        {
            estado_plumaje = "Bueno";
        }
        else
        {
            estado_plumaje = "Malo";
        }

        return "Animal [Nombre: "+super.getNombre()+", Especie: "+super.getEspecie()+", Hambre: "+super.getHambre()+
                ", Salud: "+super.getSalud()+", Higiene: "+super.getHigiene()+", Estado Plumaje: "+estado_plumaje
                +", capacidad de vuelo: "+this.estadoPlumaje+"]";
    }

}
