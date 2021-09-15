
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
        double salarioBruto, valorMaximo, prestacao;

    System.out.println("Informe o salário bruto do funcionário é:");
    salarioBruto = entrada.nextDouble();
    System.out.println("Informe o valor da prestação:");
    prestacao = entrada.nextDouble();

    valorMaximo = salarioBruto * 0.3;
    if(prestacao <= valorMaximo){
    System.out.println("O empréstimo pode ser concedido.");
}else {
    System.out.println("Não é possível fazer o empréstimo.");
}
entrada.close();
}
}