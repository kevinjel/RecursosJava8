package br.com.lambda.interface_suplier;

import java.util.Random;

public class Teste {

    public void fazerAlgo() {
        Cronometro.<Integer>cronometrar( () -> {
            for (int i = 0; i < 100000 + new Random().nextInt(10000); i++) {}
            return 100;
        });
    }

    public static void main(String[] args) {
        new Teste().fazerAlgo();
    }
}