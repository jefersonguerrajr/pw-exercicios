package org.jeferson.factory3.imp;

import org.jeferson.factory3.Documento;

public class Contrato implements Documento {

    @Override
    public void assinar() {
        System.out.println("Assinando contrato");
    }
}
