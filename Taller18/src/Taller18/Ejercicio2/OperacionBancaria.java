package Taller18.Ejercicio2;

public interface OperacionBancaria {
    void transferir(double monto);
    void retirar(double monto);
    void pagarFactura(String servicio, double monto);
}
