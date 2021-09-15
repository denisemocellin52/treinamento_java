package exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite, cont;

        System.out.printf("Informe o valor limite:");
		limite = entrada.nextInt();
        entrada.close();

        cont = 1;
        while(cont <= limite) {
            System.out.print(cont + ", ");
            cont *= 2;
        }
    }
}


