package org.jeferson.factory.veiculo.imp;

import org.jeferson.factory.veiculo.VeiculoEletrico;

public class PatineteEletrico implements VeiculoEletrico {

    @Override
    public void carregar() {
        System.out.println("Carregando patinete");
    }
}
