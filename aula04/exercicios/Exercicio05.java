package exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int numero, pares = 0, impares = 0;

	for(int i= 0; i < 10; i++) {
    System.out.printf("Digite o %d° número: ", i);
	numero = entrada.nextInt();
	if(numero % 2 == 0) { //verifica se o número é par
		pares++;
	}else{
	impares++;
}
	System.out.println("O total de pares é: " + pares);
	System.out.println("O total de impares é: " + impares);
}

entrada.close();
}
}