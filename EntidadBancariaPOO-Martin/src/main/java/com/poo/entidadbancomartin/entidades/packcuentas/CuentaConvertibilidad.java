package com.poo.entidadbancomartin.entidades.packcuentas;

import com.poo.entidadbancomartin.entidades.packclientes.ClientesEmpresa;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class CuentaConvertibilidad extends CuentaCorriente {
    private double saldoDolares;

    public CuentaConvertibilidad(int numerocuenta, ClientesEmpresa cliente, double montoautorizado) {
        super(numerocuenta, cliente, montoautorizado);
        this.saldoDolares = 0.0;
    }

    public void depositarDolares(double monto) {
        if (monto > 0) {
            this.saldoDolares += monto;
            System.out.println("Depósito exitoso. Nuevo saldo dólares: u$s " + this.saldoDolares);
        } else {
            System.out.println("El monto a depositar debe ser mayor a cero.");
        }
    }

    public void extraerDolares(double monto) {
        if (monto > 0 && this.saldoDolares >= monto) {
            this.saldoDolares -= monto;
            System.out.println("Extracción exitosa. Nuevo saldo dólares: u$s " + this.saldoDolares);
        } else {
            System.out.println("Error: Fondos insuficientes en dólares. No se acepta giro en descubierto.");
        }
    }

    public void convertirPesosADolares(double montoPesos, double tasaConversion) {
        if (montoPesos > 0 && tasaConversion > 0) { // agregamos la validacion para que la tasa de conversion sea mayor a 0
            this.saldo -= montoPesos; // Permite girar en descubierto al comprar dólares
            double dolaresComprados = montoPesos / tasaConversion;
            this.saldoDolares += dolaresComprados;
            System.out.println("Conversión exitosa. Compraste u$s " + dolaresComprados);
        }
    }

    public void convertirDolaresAPesos(double montoDolares, double tasaConversion) {
        if (montoDolares > 0 && tasaConversion > 0 && this.saldoDolares >= montoDolares) {
            this.saldoDolares -= montoDolares;
            double pesosObtenidos = montoDolares * tasaConversion;
            this.saldo += pesosObtenidos;
            System.out.println("Conversión exitosa. Vendiste u$s " + montoDolares + " y obtuviste $" + pesosObtenidos);
        } else {
            System.out.println("Error: No tenés suficientes dólares en cuenta para convertir.");
        }
    }
}
