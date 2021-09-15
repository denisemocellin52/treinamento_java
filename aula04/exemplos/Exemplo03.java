package exemplos;

public class Exemplo03 {

	public static void main(String[] args) {
	//printf( Formatação, Dados) == print formatado
	//formatação = como exibir
	//dados = o que exibir

	//caracter de controle:
	//%d = int
	//%s = String
	//%f = números com decimal
	// \n = pula linha

		System.out.printf("Sua idade é %d\n", 23);
		System.out.printf("Sua idade é %d e seu telefone é %s\n", 23, "48-985050313");
		System.out.printf("Sua idade: %d altura: %f peso: %f\n", 23, 1.50, 80.12345);
	
}
}