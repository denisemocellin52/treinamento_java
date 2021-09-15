import java.util.ArrayList;
import java.util.Scanner;

//Escreva um programa que procura por um nome digitado pelo usuário 
//dentro do ArrayList de nomes

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> listaDeNomes = new ArrayList<>();
        String nomeProcurado;

        listaDeNomes.add("Denise");
        listaDeNomes.add("Daniel");
        listaDeNomes.add("Raimundo");
        listaDeNomes.add("Kelly");
        listaDeNomes.add("Amanda");

        System.out.println(listaDeNomes);

        System.out.println("Digite o nome:");
        nomeProcurado = teclado.nextLine();

        boolean naoAchou = true;
        for (String nome : listaDeNomes) {
            if(nome.equals(nomeProcurado)) {
                System.out.println("Encontrado " + nome);
                naoAchou = false; // achou o nome
                break;
            } 
        }
        if(naoAchou) {
            System.out.println("Não encontrado.");
        }

        teclado.close();
    }
}