public class Imprimir implements Printable {
    @Override
    public void print(String msg) {
        System.out.println("Imprimindo na impressora: " + msg);
    }
}