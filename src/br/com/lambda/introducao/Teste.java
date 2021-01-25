package br.com.lambda.introducao;

public class Teste {

    public static void main(String[] args) {
        
        Runnable runnableSemLambda = new Runnable() {
            @Override
            public void run() {
                System.out.println("Exemplo sem lambda");
            }
        };

        Runnable runnableComLambdaComVariasInstrucoes = () -> {
            System.out.println("Exemplo com lambda");
            System.out.println("Multiplas linhas");
        };

        Runnable runnableApenasUmaLinha = () -> System.out.println("Exemplo lambda com uma instrução");

        //Executando comandos
        runnableSemLambda.run();
        runnableComLambdaComVariasInstrucoes.run();
        runnableApenasUmaLinha.run();
    }

}
