package Modelos;

public class PayPal extends MetodoPago {

    public PayPal(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void realizarPago(double monto) {
        double comision = monto * 0.02;
        double total = monto + comision;

        if (saldoDisponible >= total) {
            saldoDisponible -= total;
            System.out.println("Pago de $" + monto + " con PayPal realizado (comisión 2%).");
        } else {
            System.out.println("Saldo insuficiente en PayPal.");
        }
    }
}
