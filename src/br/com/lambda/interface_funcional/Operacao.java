package br.com.lambda.interface_funcional;

@FunctionalInterface
public interface Operacao {

    int calcular(int x, int y);

    static double dividir(int x, int y){
        return x / y;
    }

    default int comparar(int x, int y) {
        if(x > y) return 1;
        if(x < y) return -1;

        return 0;
    }

}
