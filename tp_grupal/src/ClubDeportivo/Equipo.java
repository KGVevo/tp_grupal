package ClubDeportivo;

public class Equipo {

    private String nombre;
    private Deporte deporte;
    private String entrenador;
    private Jugador jugador;

    public Equipo(String nombre_equipo, String entrenador) {
        this.nombre = nombre_equipo;
        this.entrenador = entrenador;
    }

    public void agregarDeporte(String nombre, String descripcion, boolean pelota, double dimensionesCancha)
    {
        this.deporte = new Deporte(nombre, descripcion, pelota, dimensionesCancha);
    }

    public void agregarJugador(Categoria categoria, int nroCamiseta)
    {
        this.jugador = new Jugador(this.deporte, categoria, nroCamiseta);
    }

}
