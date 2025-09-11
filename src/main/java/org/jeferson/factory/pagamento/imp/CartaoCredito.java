package org.jeferson.factory.pagamento.imp;

import org.jeferson.factory.pagamento.Pagamento;

public class CartaoCredito implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagando com cartão de debito");
    }
}
