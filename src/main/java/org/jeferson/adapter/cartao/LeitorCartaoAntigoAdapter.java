package org.jeferson.adapter.cartao;

public class LeitorCartaoAntigoAdapter implements LeitorCartao {

    private final LeitorCartaoAntigo leitorCartaoAntigo;

    public LeitorCartaoAntigoAdapter(LeitorCartaoAntigo leitorCartaoAntigo){
        this.leitorCartaoAntigo = leitorCartaoAntigo;
    }

    @Override
    public void lerDados(String dados) {
        leitorCartaoAntigo.lerTarjaMagnetica(dados);
    }

}
