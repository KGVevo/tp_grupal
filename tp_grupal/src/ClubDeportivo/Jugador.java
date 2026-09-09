package ClubDeportivo;

public class Jugador {
    //""Extends"" cuando se haga la Clase Persona

    private Deporte deporte;
    private Categoria categoria;
    private int nroCamiseta;


    //Constructor
    public Jugador(Deporte deporte, Categoria categoria, int nroCamiseta) {
        //super();  //Para la clase Persona

        this.deporte = deporte;
        this.categoria = categoria;
        this.nroCamiseta = nroCamiseta;
    }


    //Getters
    public Deporte getDeporte() {
        return deporte;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public int getNroCamiseta() {
        return nroCamiseta;
    }



}
