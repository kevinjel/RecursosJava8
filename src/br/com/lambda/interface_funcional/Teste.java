package br.com.lambda.interface_funcional;

public class Teste {

    public static void main(String[] args) {
        Operacao operacaoSoma = (x, y) -> {return x + y;};
        Operacao operacaoSubtracao = (x, y) -> {return x - y;};
        Operacao operacaoMultiplicacao = (x, y) -> {return x * y;};

        int resultadoSoma = operacaoSoma.calcular(10, 20);
        int resultadoSubtracao = operacaoSubtracao.calcular(10, 20);
        int resultadoMultiplicacao = operacaoMultiplicacao.calcular(10, 20);

        System.out.println(resultadoSoma);
        System.out.println(resultadoSubtracao);
        System.out.println(resultadoMultiplicacao);
    }

}
