package Actividad1;

public class Videojuego {

    // Atributos
    private String nombre;
    private String desarrollador;
    private String genero;
    private float precio;

    // Constructor
    public Videojuego(String nombre, String desarrollador, String genero, float precio) {
        this.nombre = nombre;
        this.desarrollador = desarrollador;
        this.genero = genero;
        this.precio = precio;
    }

    // Métodos
    public void ejecutarVideojuego() {
        System.out.println("El videojuego se está ejecutando.");
    }

    public void expulsarVideojuego() {
        System.out.println("El videojuego ha sido expulsado.");
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
