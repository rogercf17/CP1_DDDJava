package CP1;
public class Calculadora {
    public int soma(int a, int b)  {return a + b;}

    public int subtracao(int a, int b) {return a - b;}

    public int multiplicacao(int a, int b) {return a * b;}

    public int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
