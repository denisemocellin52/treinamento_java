package exercicios;

import java.util.Scanner;

public class rascunho {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma;
	
	soma = 0;
	numero = 1;
	while(numero != 0) { //enquanto o número não for zero
		System.out.println("Digite o %d número (0=fim): ");
		numero = entrada.nextInt();
		soma = soma + numero;
    }
		System.out.println("A soma dos valores é: " + soma);
    
		entrada.close();
}
}