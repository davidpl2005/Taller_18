package Taller18.Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Conduccion bicicleta = new Bicicleta();
        Conduccion camion = new Camion();
        TransporteMercancia transporteCamion = new Camion();

        bicicleta.conducir();
        camion.conducir();
        transporteCamion.cargarMercancia();
    }
}
