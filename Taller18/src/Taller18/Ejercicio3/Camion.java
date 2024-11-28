package Taller18.Ejercicio3;

public class Camion implements Conduccion, TransporteMercancia{
    @Override
    public void conducir() {
        System.out.println("El camion esta siendo conducido");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("Cargando mercancia en el camion");
    }
}
