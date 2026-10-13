package com.poo.entidadbancomartin.entidades.packclientes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true) // llamando al to string de la clase padre

public class ClientesIndividuales extends Cliente {
    private String nombre;
    private String apellido;
    private String dni;

    public ClientesIndividuales(int nroCliente, String nombre, String apellido, String dni) {
        super(nroCliente); // constructor de la clase padre
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;

    }

}