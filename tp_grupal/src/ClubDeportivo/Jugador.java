package ClubDeportivo;

public class Jugador{
    private Deporte deporte;
    private Categoria categoria;
    private int nroCamiseta;
    private Persona persona;


    //Constructor
    public Jugador(Deporte deporte, Categoria categoria, int nroCamiseta, Persona persona) {
        this.deporte = deporte;
        this.categoria = categoria;
        this.nroCamiseta = nroCamiseta;
        this.persona = persona;
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


    @Override
    public String toString() {
        return this.persona.toString() + "\n[Deporte: "+ this.deporte.toString() + ", Categoria: " + this.categoria +
                ", Numero de Camiseta: " + this.nroCamiseta + "]";
    }
}
