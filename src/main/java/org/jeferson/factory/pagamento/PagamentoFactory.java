package org.jeferson.factory.pagamento;

import org.jeferson.factory.pagamento.imp.Boleto;
import org.jeferson.factory.pagamento.imp.CartaoCredito;
import org.jeferson.factory.pagamento.imp.CartaoDebito;

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
