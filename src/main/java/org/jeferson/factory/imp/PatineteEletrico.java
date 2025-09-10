package org.jeferson.factory.imp;

import org.jeferson.factory.VeiculoEletrico;

public class PatineteEletrico implements VeiculoEletrico {

    @Override
    public void carregar() {
        System.out.println("Carregando patinete");
    }
}
