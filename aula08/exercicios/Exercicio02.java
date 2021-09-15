import java.util.Scanner;

// ALT + SHIFT + O = organizar os import's

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        boolean invalida = true;

        do {
            try {
                System.out.println("Digite um número inteiro:");
                numero = Integer.parseInt( teclado.nextLine() );
                System.out.println("Você digitou " + numero);
                invalida = false;
            } catch (Exception e) {
                System.out.println("Você não digitou um valor inteiro.");
                // invalida = true;
            }
        } while (invalida);

        teclado.close();
    }
}