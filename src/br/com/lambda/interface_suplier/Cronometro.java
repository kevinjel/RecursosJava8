package br.com.lambda.interface_suplier;

import java.util.function.Supplier;

final class Cronometro {

    public static <T> T cronometrar(Supplier<T> supplier) {
        long start = System.currentTimeMillis();
        T result = supplier.get();
        long end = System.currentTimeMillis();
        System.out.println("Milisegundos = " + (end - start));
        return result;
    }

}