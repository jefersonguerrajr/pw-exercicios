package org.jeferson.factory.documento.imp;

import org.jeferson.factory.documento.Documento;

public class Contrato implements Documento {

    @Override
    public void assinar() {
        System.out.println("Assinando contrato");
    }
}
