package org.jeferson.factory.imp;

import org.jeferson.factory.VeiculoEletrico;

public class CarroEletrico implements VeiculoEletrico {


    @Override
    public void carregar() {
        System.out.println("Carregando carro");
    }
}
