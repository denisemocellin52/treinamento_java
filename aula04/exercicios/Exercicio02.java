package exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
		int numero, cont=0, resultado;
		
		System.out.println("Digite o número da tabuada:");
		numero = entrada.nextInt();

		cont = 0;
		while(cont <=10){
		resultado = numero * cont;
		//System.out.println(numero + " x " + cont + " = " + resultado);
        System.out.printf("%d x %d = %d\n", numero, cont, resultado);
		cont++;
}


		entrada.close();
}
}