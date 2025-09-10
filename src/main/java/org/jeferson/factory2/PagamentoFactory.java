package org.jeferson.factory2;

import org.jeferson.factory2.imp.Boleto;
import org.jeferson.factory2.imp.CartaoCredito;
import org.jeferson.factory2.imp.CartaoDebito;

public class PagamentoFactory {
    public static Pagamento criarTipoPagamento(String tipo) {
        switch (tipo.toLowerCase()) {
            case "debito":
                return new CartaoCredito();
            case "credito":
                return new CartaoDebito();
            case "boleto":
                return new Boleto();
            default:
                throw new IllegalArgumentException("O Tipo: " + tipo + " é inválido.");
        }
    }
}
