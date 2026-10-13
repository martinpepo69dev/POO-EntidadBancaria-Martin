package com.poo.entidadbancomartin.entidades.packclientes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class ClientesEmpresa extends Cliente {
    private String nombrefantasia;
    private String cuit;

    public ClientesEmpresa(int nroCliente, String nombrefantasia, String cuit) {
        super(nroCliente);
        this.nombrefantasia = nombrefantasia;
        this.cuit = cuit;
    }

}