package com.poo.entidadbancomartin.entidades.packcuentas;

import com.poo.entidadbancomartin.entidades.packclientes.Cliente;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class CajaAhorro extends Cuenta {
    private float tasainteres;

    public CajaAhorro(int numerocuenta, Cliente cliente, float tasainteres) {
        super(numerocuenta, cliente);
        this.tasainteres = tasainteres;
    }

    @Override
    public void depositareft(double monto) {
        if (monto > 0)
            this.saldo += monto;
        else
            System.out.println("no se pueden depositar montos negativos");

    }

    @Override
    public void extraereft(double monto) {
        if (monto > 0 && monto <= saldo)
            this.saldo -= monto;
        else
            System.out.println("el monto es invalido o supera la cantidad del saldo");

    }

    // creamos un metodo para cobrar el interes de la caja de ahorro

    public void cobrarInteres(double tasainteres) {
        double interes = this.saldo * (this.tasainteres / 100.0);
        depositareft(interes);
    }

}
