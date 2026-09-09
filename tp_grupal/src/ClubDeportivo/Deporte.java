package ClubDeportivo;

import java.util.Objects;

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


    @Override
    public String toString() {
        return "[Nombre: "+ this.nombre + ", Descripcion: "+ this.descripcion+", Pelota: "+ this.pelota +
                ", Dimensiones de la Cancha: "+ this.dimensionesCancha+ "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }

        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        Deporte aux = (Deporte) obj;
        return Objects.equals(this.nombre, aux.nombre);
    }
}
