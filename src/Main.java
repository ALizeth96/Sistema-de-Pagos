package main;

import Modelos.TarjetaCredito;
import Modelos.PayPal;
import Modelos.TransferenciaBancaria;

public class Main {
    public static void main(String[] args) {
        TarjetaCredito tarjeta = new TarjetaCredito(200);
        PayPal paypal = new PayPal(400);
        TransferenciaBancaria transferencia = new TransferenciaBancaria(100);

        System.out.println("\n--- Tarjeta de Crédito ---");
        tarjeta.realizarPago(50);
        tarjeta.reembolsarPago(20);
        System.out.println("Saldo actual: $" + tarjeta);

        System.out.println("\n--- PayPal ---");
        paypal.realizarPago(50);
        paypal.reembolsarPago(10);
        System.out.println("Saldo actual: $" + paypal.getSaldoDisponible());

        System.out.println("\n--- Transferencia Bancaria ---");
        transferencia.realizarPago(60);
        transferencia.reembolsarPago(15);
        System.out.println("Saldo actual: $" + transferencia.getSaldoDisponible());
    }
}
