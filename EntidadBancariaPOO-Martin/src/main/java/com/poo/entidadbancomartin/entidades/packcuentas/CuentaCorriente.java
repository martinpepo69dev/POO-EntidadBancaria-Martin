package com.poo.entidadbancomartin.entidades.packcuentas;

import com.poo.entidadbancomartin.entidades.packclientes.Cliente;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class CuentaCorriente extends Cuenta {
    private double montoautorizado;

    public CuentaCorriente(int numerocuenta, Cliente cliente, double montoautorizado) {
        super(numerocuenta, cliente);
        this.montoautorizado = montoautorizado;
    }

    @Override
    public void depositareft(double monto) {
        if (monto > 0)
            this.saldo += monto;
        else
            System.out.println("No se pueden depositar montos negativos");
    }

    @Override
    public void extraereft(double monto) {
        if (monto > 0 && monto <= (this.saldo + this.montoautorizado)) {
            this.saldo -= monto;
        } else {
            System.out.println("El monto es inválido o supera la cantidad del saldo y descubierto permitidos.");
        }
    }

    public double getMontoautorizado() {
        return montoautorizado;
    }

    // METODO DEPOSITAR CHEQUE

    public void depositarCheques(Cheque cheque) {
        // Validamos que el cheque no sea nulo y que su monto sea mayor a 0
        if (cheque != null && cheque.getMonto() > 0) {

            // Aumentamos el saldo extrayendo el monto del cheque
            this.saldo += cheque.getMonto();

            System.out.println("Depósito de cheque exitoso. Se sumaron $" + cheque.getMonto() + " a la cuenta.");
        } else {
            System.out.println("Error: Cheque inválido o el monto del cheque debe ser mayor a cero.");
        }
    }

}