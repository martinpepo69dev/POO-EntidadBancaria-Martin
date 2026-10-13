package com.poo.entidadbancomartin.testentidadbancomartin;

import com.poo.entidadbancomartin.entidades.packclientes.Cliente;
import com.poo.entidadbancomartin.entidades.packclientes.ClientesEmpresa;
import com.poo.entidadbancomartin.entidades.packclientes.ClientesIndividuales;
import com.poo.entidadbancomartin.entidades.packcuentas.CajaAhorro;
import com.poo.entidadbancomartin.entidades.packcuentas.Cuenta;
import com.poo.entidadbancomartin.entidades.packcuentas.CuentaConvertibilidad;
import com.poo.entidadbancomartin.entidades.packcuentas.CuentaCorriente;

public class testAsociacionBancaria {
    public static void main(String[] args) {

        ClientesEmpresa cliente1 = new ClientesEmpresa(101, "Papa Loca", "9249249");
        // creamos un nuevo objeto de la clase clientes empresa apodado cliente1 el cual
        // es un cliente empresa
        Cliente cliente2 = new ClientesIndividuales(202, "Alex", "Rowss", "4358333");
        // creamos un nuevo cliente individual apodado cliente2

        Cuenta cuenta1 = new CuentaCorriente(111, cliente1, 1000);
        Cuenta cuenta2 = new CajaAhorro(222, cliente2, 10);
        CuentaCorriente cuenta3 = new CuentaConvertibilidad(333, cliente1, 1000, 0.5);
        // se puede visualizar los datos del cliente asociado a dicha cuenta
        System.out.println(cuenta3.getCliente());
        System.out.println(cuenta2.getCliente());
        System.out.println(cuenta1.getCliente());

        // se puede visualizar los numeros de cuenta de cada cuenta creada
        System.out.println(cuenta3.getNumerocuenta());
        System.out.println(cuenta2.getNumerocuenta());
        System.out.println(cuenta1.getNumerocuenta());

        // se puede visualizar todos los saldos de cada cuenta creada ( todos inician en
        // 0 )
        System.out.println(cuenta3.getSaldo());
        System.out.println(cuenta2.getSaldo());
        System.out.println(cuenta1.getSaldo());

        // se puede depositar
        cuenta2.depositareft(1000);
        System.out.println(cuenta2.getSaldo());
        // se puede extraer
        cuenta2.extraereft(250);
        System.out.println(cuenta2.getSaldo());

        cuenta1.depositareft(2000);
        System.out.println(cuenta1.getSaldo());
        cuenta1.extraereft(1500);
        System.out.println(cuenta1.getSaldo());

        CajaAhorro cuenta4 = new CajaAhorro(444, cliente2, 10);
        cuenta4.depositareft(1000);
        // cobramos el interes de la caja de ahorro
        cuenta4.cobrarInteres(0.5);
        // visualizamos el saldo luego de cobrar el interes
        System.out.println(cuenta4.getSaldo());

    }

}
