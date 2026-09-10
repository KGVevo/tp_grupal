package ClubDeportivo;

import java.util.Objects;

public class Persona {
    private String nombre;
    private String fecha_nacimiento;
    private String dni;

    public Persona(String nombre, String fecha_nacimiento, String dni)
    {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getDni() {
        return dni;
    }


    @Override
    public boolean equals(Object obj)
    {
        boolean rta = true;

        if(obj == null)
        {
            rta = false;
        }
        else
        {
            if(obj instanceof Persona)
            {
                Persona p = (Persona) obj;
                if(p.getDni() == this.dni)
                {
                    rta = true;
                }
            }
        }

        return rta;
    }

    public int hashcode()
    {
        return Objects.hash(this.getDni());
    }

    @Override
    public String toString()
    {
        return "Persona [Nombre: "+this.nombre+", Fecha de Nacimiento: "+this.fecha_nacimiento
                +", DNI: "+this.dni+"]";
    }

}
