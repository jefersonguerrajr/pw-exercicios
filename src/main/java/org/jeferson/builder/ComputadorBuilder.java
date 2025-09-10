package org.jeferson.builder;

public class ComputadorBuilder {

    Computador computador;

    public ComputadorBuilder(){
        computador =  new Computador();
    }

    public ComputadorBuilder CPU(String cpu){
        computador.setCPU(cpu);
        return this;
    }

    public ComputadorBuilder GPU(String gpu){
        computador.setGPU(gpu);
        return this;
    }

    public ComputadorBuilder RAM(String ram){
        computador.setRAM(ram);
        return this;
    }

    public ComputadorBuilder SSD(String ssd){
        computador.setRAM(ssd);
        return this;
    }

    public ComputadorBuilder placaMae(String placaMae){
        computador.setPlacaMae(placaMae);
        return this;
    }

    public ComputadorBuilder cooler(String cooler){
        computador.setCooler(cooler);
        return this;
    }

    public Computador build(){
        return computador;
    }
}
