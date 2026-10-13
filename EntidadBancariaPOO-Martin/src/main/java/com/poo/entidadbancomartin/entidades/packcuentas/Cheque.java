package com.poo.entidadbancomartin.entidades.packcuentas;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class Cheque {
    private double numerocheque;
    private double monto;
    private String bancoemisor;
    private String fechadepago;

    public Cheque(double numerocheque, double monto, String bancoemisor, String fechadepago) {
        this.numerocheque = numerocheque;
        this.monto = monto;
        this.bancoemisor = bancoemisor;
        this.fechadepago = fechadepago;
    }

    public void imprimirCheque() {
        System.out.println("Cheque del banco: " + bancoemisor);
        System.out.println("Monto: $" + monto);
        System.out.println("Fecha de pago: " + fechadepago);
        System.out.println("Numero de cheque es" + numerocheque);
    }

}
