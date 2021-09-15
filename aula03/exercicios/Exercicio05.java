

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            String senha; // String = texto

                System.out.println("Informe a senha:");
                senha = entrada.nextLine();

                if(senha.equals("R10p5")) {
                    System.out.println("Acesso permitido!");
                }else{
                    System.out.println("Acesso negado!");
                    }
            entrada.close();
}
}