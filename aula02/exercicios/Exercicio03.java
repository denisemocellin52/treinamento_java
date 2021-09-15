
import java.util.Scanner;

public class Exercicio03 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, novoSalario;
            
        System.out.print("Digite o primeiro salário do funcionário:");
        salario = teclado.nextDouble();

        novoSalario = salario + salario * 0.25;
        novoSalario = salario * 1.25;

        System.out.println("O novo salário do funcionário é: " + novoSalario);
        teclado.close();
    }
}