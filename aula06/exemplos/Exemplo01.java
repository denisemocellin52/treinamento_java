
public class Exemplo01 {
    public static void main(String[] args){
        linha(); // chamada de método
        System.out.println("Meu programa");
        linha();
        System.out.println("08/09");
        linha2(2);
        linha2(15);
        linha3(10, '*');
        linha3(20, '@');
    }

    static void linha(){  //não tem retorno
        System.out.println("-----------------");
    }

    static void linha2(int tamanho){ //tamanho é um parâmetro
        for(int i = 0; i < tamanho; i++){
            System.out.println("-");
    }
    System.out.println();
}
    static void linha3(int tamanho, char letra){ //tamanho é um parâmetro
        for(int i = 0; i < tamanho; i++){         
            System.out.print(letra);
        }
        System.out.println();
    }
}