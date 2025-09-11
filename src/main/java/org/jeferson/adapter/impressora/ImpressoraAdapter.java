package org.jeferson.adapter.impressora;

public class ImpressoraAdapter implements NovaImpressora {

    private final ImpressoraAntiga impressoraAntiga;

    public ImpressoraAdapter(ImpressoraAntiga impressoraAntiga) {
        this.impressoraAntiga = impressoraAntiga;
    }

    @Override
    public void imprimirDocumento(String doc) {
        impressoraAntiga.printar(doc);
    }

}
