package com.poo.entidadbancomartin.testentidadbancomartin;

import com.poo.entidadbancomartin.entidades.packclientes.Cliente;
import com.poo.entidadbancomartin.entidades.packclientes.ClientesEmpresa;
import com.poo.entidadbancomartin.entidades.packcuentas.CuentaConvertibilidad;
import com.poo.entidadbancomartin.entidades.packcuentas.CuentaCorriente;

public class testConvertibilidad {
    public static void main(String[] args) {

        CuentaCorriente cuenta8 = new CuentaConvertibilidad(999, null, 1000, 10.0);

        Cliente cliente8 = new ClientesEmpresa(999, "Poo", "953533");
        ClientesEmpresa cliente10 = new ClientesEmpresa(333, "nombrefantasia", "i842842");
        CuentaConvertibilidad cuenta9 = new CuentaConvertibilidad(888, cliente10, 0, 0);

        System.out.println(cuenta8.getCliente());
        System.out.println(cuenta9.getCliente());
        System.out.println(cliente8.getNroCliente());
        cuenta9.convertirDolaresAPesos(5, 200);
        System.out.println(cuenta9.getSaldo());
        cuenta9.depositarDolares(1000);
        cuenta9.convertirDolaresAPesos(100, 1500);
        System.out.println(cuenta9.getSaldo());

    }

}
