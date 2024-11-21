package br.pipeline;

public class MinhaClasse {
    public int soma(int a, int b) {
        return a + b;
    }

    public int subtrai(int a, int b) {
        return a - b;
    }

    public int multiplica(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divisão por zero não é permitida");
        return (double) a / b;
    }
}
