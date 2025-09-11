package org.jeferson.adapter.cartao;

public class LeitorCartaoChipAdapter implements LeitorCartao {

    private final LeitorCartaoChip leitorCartaoChip;

    public LeitorCartaoChipAdapter(LeitorCartaoChip leitorCartaoChip){
        this.leitorCartaoChip = leitorCartaoChip;
    }

    @Override
    public void lerDados(String dados) {
        leitorCartaoChip.lerChip(dados);
    }

}
