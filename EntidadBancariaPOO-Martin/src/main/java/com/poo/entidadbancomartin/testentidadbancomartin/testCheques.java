package com.poo.entidadbancomartin.testentidadbancomartin;

// importamos las clases necesarias para el test:
import com.poo.entidadbancomartin.entidades.packcuentas.Cheque;
import com.poo.entidadbancomartin.entidades.packcuentas.CuentaCorriente;

public class testCheques {
    public static void main(String[] args) {
        
        CuentaCorriente cuenta1 = new CuentaCorriente(111, null, 1000);

        Cheque primercheque = new Cheque(4321, 1500, "PololoBank", "27/01/22");
        cuenta1.depositarCheques(primercheque); // depositamos el cheque en la cuenta corriente
        System.out.println(cuenta1.getSaldo()); // visualizamos el saldo de la cuenta corriente (1500)
        System.out.println(cuenta1.getSaldo()); // visualizamos el saldo de la cuenta corriente (700)
        primercheque.imprimirCheque(); // visualizamos los datos del cheque depositado
        cuenta1.depositarCheques(null); // probamos depositar un cheque nulo ( no nos deja)

        CuentaCorriente cuenta2 = new CuentaCorriente(222, null, 1000);
        cuenta2.extraereft(500);
        System.out.println(cuenta2.getSaldo()); // Extraemos 500 que son de el monto autorizado y el saldo es -500
        cuenta2.extraereft(600); // Probamos extraer 600 que superan el monto autorizado y nos da un mensaje de
                                 // error
        cuenta2.extraereft(300); // Probamos extraer 300
        System.out.println(cuenta2.getSaldo()); // Extraemos 300 que son de el monto autorizado y el saldo es -800

    }
}
