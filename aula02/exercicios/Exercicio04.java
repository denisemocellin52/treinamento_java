
import java.util.Scanner;

public class Exercicio04 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salarioMinimo, valorKw, valorTotal, valorComDesconto;
        int qtdeKWConsumido;

        System.out.print("Digite o valor do salário minímo:");
        salarioMinimo = teclado.nextDouble();
        System.out.print("Quantos KW foram consumidos:");
        qtdeKWConsumido = teclado.nextInt();


        valorKw = salarioMinimo / 500;
        valorTotal = valorKw * qtdeKWConsumido;
        valorComDesconto = valorTotal * 0.85;

        System.out.print("Valor por KW:" + valorKw);
        System.out.print("Valor total a pagar:" + valorTotal);
        System.out.print("Valor com desconto:" + valorComDesconto);
        teclado.close();
    }
}