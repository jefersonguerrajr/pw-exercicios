package org.jeferson.factory;

import org.jeferson.factory.imp.CarroEletrico;
import org.jeferson.factory.imp.MotoEletrica;

public class VeiculoFactory {

    public static VeiculoEletrico criarVeiculo(String tipo) {
        switch (tipo.toLowerCase()) {
            case "carro":
                return new CarroEletrico();
            case "moto":
                return new MotoEletrica();
            default:
                throw new IllegalArgumentException("O Tipo: " + tipo + " é inválido.");
        }
    }

}
