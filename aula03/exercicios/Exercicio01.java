

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
Scanner teclado = new Scanner(System.in);
        int numero;
	//entrada
        System.out.println("Digite um valor inteiro:");
	numero = teclado.nextInt();

	//processamento
	if(numero > 20) {
        //System.out.println("A metade de " + numero + " é "")
        System.out.println("A metade de " + numero + " é " + ((double)numero / 2));
        }
    
	
	teclado.close();
    }
}