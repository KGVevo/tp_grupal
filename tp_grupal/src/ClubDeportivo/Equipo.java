package ClubDeportivo;

public class Equipo {

    private String nombre;
    private Deporte deporte;
    private Persona entrenador;
    private Jugador jugador;

    public Equipo(String nombre_equipo) {
        this.nombre = nombre_equipo;
    }

    public void agregarDeporte(String nombre, String descripcion, boolean pelota, double dimensionesCancha)
    {
        this.deporte = new Deporte(nombre, descripcion, pelota, dimensionesCancha);
    }

    public void agregarJugador(Categoria categoria, int nroCamiseta)
    {
        this.jugador = new Jugador(this.deporte, categoria, nroCamiseta);
    }

    public void agregarEntrenador(String nombre, String fecha_nacimiento, String dni)
    {
        this.entrenador = new Persona(nombre, fecha_nacimiento, dni);
    }

    public String getNombre() {
        return nombre;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public Persona getEntrenador() {
        return entrenador;
    }

    public Jugador getJugador() {
        return jugador;
    }
}
