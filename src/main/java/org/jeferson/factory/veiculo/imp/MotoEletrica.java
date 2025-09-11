package org.jeferson.factory.veiculo.imp;

import org.jeferson.factory.veiculo.VeiculoEletrico;

public class MotoEletrica implements VeiculoEletrico {

    @Override
    public void carregar() {
        System.out.println("Carregando moto");
    }
}
