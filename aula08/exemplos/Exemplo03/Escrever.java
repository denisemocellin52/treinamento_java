public class Escrever implements Printable {

    @Override
    public void print(String msg) {
        System.out.println("Escrevendo na tela: " + msg);
    }

}