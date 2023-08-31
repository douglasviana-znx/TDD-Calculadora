package app;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
    
    public double calcMedia(double[] numeros) {
        if (numeros.length > 0) {
            double soma = 0;
            for (double num : numeros) {
                soma += num;
            }
            double resultado = soma / numeros.length;
            return resultado;
        } else {
            System.out.println("Erro: Nenhum número fornecido para calcular a média.");
            return 0;
        }
    }

    public int subtraction(int num1, int num2) {
        return num1 - num2; 
    }
}
