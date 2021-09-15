
import java.util.Scanner;

public class Exercicio02 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;
            
        System.out.print("Digite a sua primeira nota:");
        nota1 = teclado.nextDouble();
        System.out.print("Digite a sua segunda nota:");
        nota2 = teclado.nextDouble();

        media = (nota1 + nota2) / 2;
        System.out.println("A sua nota média é: " + media);
        teclado.close();
    }
}