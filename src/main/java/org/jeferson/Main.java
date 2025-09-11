package org.jeferson;


import org.jeferson.adapter.impressora.ImpressoraAdapter;
import org.jeferson.adapter.impressora.ImpressoraAntiga;
import org.jeferson.adapter.impressora.NovaImpressora;
import org.jeferson.adapter.tomada.SecadorAmericano;
import org.jeferson.adapter.tomada.TomadaAdapter;
import org.jeferson.adapter.tomada.TomadaBrasileira;
import org.jeferson.builder.Computador;
import org.jeferson.builder.ComputadorBuilder;
import org.jeferson.factory.veiculo.VeiculoEletrico;
import org.jeferson.factory.veiculo.VeiculoFactory;
import org.jeferson.singleton.GameSession;
import org.jeferson.singleton.Logger;

public class Main {
    public static void main(String[] args) {

        Logger.getInstance().addLog("Teste123");
        Logger.getInstance().addLog("Teste456");
        Logger.getInstance().addLog("Teste789");
        Logger.getInstance().printAllLogs();

        GameSession.getInstance().printCurrentStatus();
        GameSession.getInstance().addLevel(100);
        GameSession.getInstance().removeLife(20);
        GameSession.getInstance().printCurrentStatus();

        VeiculoEletrico eletrico = VeiculoFactory.criarVeiculo("carro");
        eletrico.carregar();

        Computador computador = new ComputadorBuilder().CPU("Intel").GPU("GTX 5060").build();
        System.out.println(computador.toString());

        SecadorAmericano secadorAmericano = new SecadorAmericano();
        TomadaBrasileira tomadaBrasileira = new TomadaAdapter(secadorAmericano);
        tomadaBrasileira.ligarNaTomada();

        ImpressoraAntiga impressoraAntiga = new ImpressoraAntiga();
        NovaImpressora impressoraAdapter = new ImpressoraAdapter(impressoraAntiga);
        impressoraAdapter.imprimirDocumento("Relatório 123");

    }
}
