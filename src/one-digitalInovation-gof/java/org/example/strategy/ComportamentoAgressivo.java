package org.example.strategy;

public class ComportamnetoAgressivo implements Comportamento{

    @Override
    public void mover(){
        System.out.println("Movendo-se agressivamente...");
    }
}
