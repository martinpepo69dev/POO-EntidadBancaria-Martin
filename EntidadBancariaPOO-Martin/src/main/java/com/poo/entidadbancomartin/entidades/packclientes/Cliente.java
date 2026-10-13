package com.poo.entidadbancomartin.entidades.packclientes; // paquete que contiene las clases que representan a los clientes de la entidad bancaria, // y que pueden tener una o varias cuentas asociadas a su nombre, y que pueden realizar operaciones

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor

public abstract class Cliente {
    private final int nroCliente;

}
