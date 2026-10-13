package com.poo.entidadbancomartin.testentidadbancomartin;

import com.poo.entidadbancomartin.entidades.packclientes.Cliente;
import com.poo.entidadbancomartin.entidades.packclientes.ClientesIndividuales;
import com.poo.entidadbancomartin.entidades.packcuentas.CajaAhorro;


public class testCajaAhorro {
    public static void main(String[] args) {

        Cliente cliente1 = new ClientesIndividuales(1, "Luis", "Rodriguez", "424424444");
        CajaAhorro cajaAhorro1 = new CajaAhorro(123, cliente1, 0.5f);
        cajaAhorro1.depositareft(1000);
        cajaAhorro1.cobrarInteres(0.5f);
        cajaAhorro1.extraereft(200);
        System.out.println(cajaAhorro1.getSaldo());

    }

}
