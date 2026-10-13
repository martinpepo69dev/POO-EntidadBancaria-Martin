package com.poo.entidadbancomartin.entidades.packcuentas;

import com.poo.entidadbancomartin.entidades.packclientes.Cliente;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor

public abstract class Cuenta {
    private final int numerocuenta;
    private final Cliente cliente;
    protected double saldo;

    public abstract void depositareft(double monto);

    public abstract void extraereft(double monto);

}
