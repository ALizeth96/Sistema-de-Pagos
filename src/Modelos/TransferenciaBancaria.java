package Modelos;

public class TransferenciaBancaria extends MetodoPago {

    public TransferenciaBancaria(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void realizarPago(double monto) {
        double total = monto + 5;

        if (saldoDisponible >= total) {
            saldoDisponible -= total;
            System.out.println("Pago de $" + monto + " con Transferencia realizado (comisión $5).");
        } else {
            System.out.println("Saldo insuficiente en Transferencia.");
        }
    }
}
