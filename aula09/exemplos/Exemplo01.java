package exemplos;
import java.util.ArrayList;

public class Exemplo01 {

    public static void main(String[] args) {
        // Integer é uma classe do Java para guardar números do tipo inteiro (int)
        // Integer é o tipo de dado que será armazenado dentro do ArrayList
        ArrayList<Integer> lista = new ArrayList<>();
        
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(55);
        lista.add(2);

        System.out.println(lista);

        int procurado = 2;
        for (int i = 0; i < lista.size(); i++) {
            if(procurado == lista.get(i)) {
                System.out.println("Localizado no índice " + i);
                break; // interrompe o laço
            }
        }

        //foreach == para cada item da coleção faça
        for (Integer numero : lista) { // para cada 'número' da "lista"
            if(procurado == numero) {
                System.out.println("Localizado no índice " + lista.indexOf(numero));
                break; // interrompe o laço
            }
        }


    }
}