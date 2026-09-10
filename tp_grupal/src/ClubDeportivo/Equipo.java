package ClubDeportivo;

public class Equipo {

    private String nombre;
    private Deporte deporte;
    private Persona entrenador;
    private Jugador jugador;

    public Equipo(String nombre_equipo) {
        this.nombre = nombre_equipo;
    }



    //Metodos
    public void agregarDeporte(String nombre, String descripcion, boolean pelota, double dimensionesCancha)
    {
        this.deporte = new Deporte(nombre, descripcion, pelota, dimensionesCancha);
    }

    public void agregarJugador(Categoria categoria, int nroCamiseta, Persona persona)
    {
        this.jugador = new Jugador(this.deporte, categoria, nroCamiseta, persona);
    }

    public void agregarEntrenador(String nombre, String fecha_nacimiento, String dni)
    {
        this.entrenador = new Persona(nombre, fecha_nacimiento, dni);
    }





    //Getters
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
