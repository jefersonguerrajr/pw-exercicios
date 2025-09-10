package org.jeferson.factory2.imp;

import org.jeferson.factory2.Pagamento;

public class CartaoDebito implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagando com cartão de crédito");
    }
}
