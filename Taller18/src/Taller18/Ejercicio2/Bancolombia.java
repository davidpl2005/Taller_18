package Taller18.Ejercicio2;

public class Bancolombia implements Transferencia, PagoFactura{

    @Override
    public void transferir(double monto) {
        System.out.println("Transferencia de " + monto + " realizada en linea");
    }

    @Override
    public void pagarFactura(String servicio, double monto) {
        System.out.println("Pagando factura de " + servicio + " por " + monto + " en linea");
    }
    
}
