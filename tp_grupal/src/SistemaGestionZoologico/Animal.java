package SistemaGestionZoologico;

public abstract class Animal {
    private String nombre;
    private String especie;
    private int hambre;
    private int salud;
    private int higiene;

    public Animal(String nombre, String especie, int hambre, int salud, int higiene) {
        this.nombre = nombre;
        this.especie = especie;
        this.hambre = hambre;
        this.salud = salud;
        this.higiene = higiene;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public int getHambre() {
        return hambre;
    }
    public int getSalud() {
        return salud;
    }
    public int getHigiene() {
        return higiene;
    }


    //Metodos Abstractos
    public abstract String comer();
    public abstract String enfermarse();
    public abstract String ensuciarse();


}
