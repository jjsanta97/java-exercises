package Actividad1;

public class Actividad1 {

    public static void main(String[] args) {

        Videojuego mi_videojuego = new Videojuego("The Last of Us", "Naughty Dog", "Acción", 95000);
        double precio_videojuego = mi_videojuego.getPrecio();
        System.out.println("El precio del videojuego es: $" + precio_videojuego);

        mi_videojuego.ejecutarVideojuego();
        mi_videojuego.expulsarVideojuego();
    }
}
