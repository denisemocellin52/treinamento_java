import.java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double numero1, numero2;

        System.out.println("Digite os dois números:");
	numero1 = teclado.nextDouble();
	numero2 = teclado.nextDouble();

	if(numero1 > numero2){
        System.out.println(numero1 + ", " + numero2);
}else{
	System.out.println(numero2 + ", " + numero1);
        }
	
	teclado.close();
}
}