
public class Exemplo04 {
    public static void main(String[] args) {
        String nome; // String = texto
        nome = "Denise";

        //equals -> faz diferença maíscula e minúscula
        //equalsIgnoreCase -> não considera maiscúla e minúscula

        //if (nome.equals("Denise") ) {
            if (nome.equalsIgnoreCase("Denise")) {
            System.out.println("Olá Denise");
        }else {
            System.out.println("Você não é a Denise");
        }
        System.out.println();
        }
    }
