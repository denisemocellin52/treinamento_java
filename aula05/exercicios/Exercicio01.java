import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, maior;

        System.out.println("Digite o primeiro número: ");
        maior = teclado.nextInt();

        for (int i = 0; i < 9; i++) {
            System.out.println("Digite o próximo número: ");
            numero = teclado.nextInt();
            if(numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número digitado foi: " + maior);

        teclado.close();
    }
}