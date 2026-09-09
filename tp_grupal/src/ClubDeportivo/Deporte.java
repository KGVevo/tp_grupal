package ClubDeportivo;

public class Deporte {
    //Atributos
    private String nombre;
    private String descripcion;
    private boolean pelota;
    private double dimensionesCancha;


    //Constructor
    public Deporte(String nombre, String descripcion, boolean pelota, double dimensionesCancha) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pelota = pelota;
        this.dimensionesCancha = dimensionesCancha;
    }



    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public boolean isPelota() {
        return pelota;
    }
    public double getDimensionesCancha() {
        return dimensionesCancha;
    }







}
