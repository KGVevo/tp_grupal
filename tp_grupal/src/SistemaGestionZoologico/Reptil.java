package SistemaGestionZoologico;

public class Reptil extends Animal{

    private boolean esVenenoso;
    private boolean tienePatas;

    public Reptil(String nombre, String especie, int hambre, int salud, int higiene, boolean esVenenoso, boolean tienePatas)
    {
        super(nombre, especie, hambre, salud, higiene);
        this.esVenenoso = esVenenoso;
        this.tienePatas = tienePatas;
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


    @Override
    public String toString()
    {
        String venenoso;
        String tiene_patas;

        if(this.esVenenoso == true)
        {
            venenoso = "Si";
        }
        else
        {
            venenoso = "No";
        }

        if(this.tienePatas == true)
        {
            tiene_patas = "Si";
        }
        else
        {
            tiene_patas = "No";
        }

        return "Animal [Nombre: "+super.getNombre()+", Especie: "+super.getEspecie()+", Hambre: "+super.getHambre()+
                ", Salud: "+super.getSalud()+", Higiene: "+super.getHigiene()+", tiene veneno: "+venenoso
                +", tiene patas: "+tiene_patas+"]";
    }
}
