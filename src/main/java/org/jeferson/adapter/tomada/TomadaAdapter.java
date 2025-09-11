package org.jeferson.adapter.tomada;

public class TomadaAdapter implements TomadaBrasileira {

    SecadorAmericano secadorAmericano;

    public TomadaAdapter(SecadorAmericano secadorAmericano) {
        this.secadorAmericano = secadorAmericano;
    }

    @Override
    public void ligarNaTomada() {
        secadorAmericano.plugInFlatPlug();
    }

}
