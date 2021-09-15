import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notas[] = new double[5]; // índices : 0, 1, 2, 3, 4

        for (int i = 0; i < notas.length; i++) { // notas.length = tamanho do vetor
            System.out.printf("Digite a %dª nota: ", i+1); // i + 1 = apenas para mostrar na tela, não altera a variável
            notas[i] = teclado.nextDouble(); // i = índice do vetor
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota[%d] = %.2f\n", i,  notas[i]); // .2f = 2 casas depois da vírgula
        }

        teclado.close();
    }
}
