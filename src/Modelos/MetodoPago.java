package Modelos;

import Interfaces.Pagos;

public abstract class MetodoPago implements Pagos {
    protected double saldoDisponible;

    public MetodoPago(double saldoInicial) {
        this.saldoDisponible = saldoInicial;
    }

    @Override
    public void reembolsarPago(double monto) {
        saldoDisponible += monto;
        System.out.println("Reembolso de $" + monto + " realizado.");
    }

    public abstract void realizarPago(double monto);

    public double getSaldoDisponible() {
        return saldoDisponible;
    }
}

