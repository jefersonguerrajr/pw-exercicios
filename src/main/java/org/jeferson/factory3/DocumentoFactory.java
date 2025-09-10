package org.jeferson.factory3;

import org.jeferson.factory3.imp.Contrato;
import org.jeferson.factory3.imp.NotaFiscal;
import org.jeferson.factory3.imp.Recibo;

public class DocumentoFactory {

    public static Documento criarTipoDeDocumento(String tipo) {
        switch (tipo.toLowerCase()) {
            case "contrato":
                return new Contrato();
            case "notafiscal":
                return new NotaFiscal();
            case "recibo":
                return new Recibo();
            default:
                throw new IllegalArgumentException("O Tipo: " + tipo + " é inválido.");
        }
    }
}
