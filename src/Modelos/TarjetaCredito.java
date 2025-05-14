package Modelos;

public class TarjetaCredito extends MetodoPago {

    public TarjetaCredito(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void realizarPago(double monto) {
        if (saldoDisponible >= monto) {
            saldoDisponible -= monto;
            System.out.println("Pago de $" + monto + " con Tarjeta realizado.");
        } else {
            System.out.println("Saldo insuficiente en Tarjeta.");
        }
    }
}
