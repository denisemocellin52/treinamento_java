import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args){
	Scanner teclado = new Scanner(System.in);
	String [] nomes = new String[7];

	for(int i = 0; i < nomes.length; i++){ // 0, 1, 2, 3, 4, 5, 6
	System.err.printf("Digite o %d nome: ", i+1);
	nomes[i] = teclado.nextLine(); //i = indice
}
for(int i = nomes.length - 1; i >= 0; i--){ // 6, 5, 4, 3, 2, 1, 0
	System.err.printf(nomes[i] + " ");
    }
teclado.close();
}
}
