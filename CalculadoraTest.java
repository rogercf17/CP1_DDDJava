package CP1;
public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.soma(2,3) == 5
            ? "Teste de soma, concluído com sucesso!"
            : "Teste de soma falhou.");

        System.out.println(calculadora.subtracao(10, 5) == 5
            ? "Teste de subtração, concluído com sucesso"
            : "Teste de subtração falhou.");

        System.out.println(calculadora.multiplicacao(2, 5) == 10
            ? "Teste de multiplicação, concluído com sucesso!"
            : "Teste de multiplicação falhou.");

        System.out.println(calculadora.divisao(10,2) == 5
            ? "Teste de divisão, concluído com sucesso!"
            : "Teste de divisão falhou.");

        // Teste de divisão por zero
        try {
            calculadora.divisao(10,0);
            System.out.println("Teste de divisão por zero falhou.");
        }catch (IllegalArgumentException e) {
            System.out.println("Teste de divisão por zero, concluído com sucesso!");
        }
    }
}
