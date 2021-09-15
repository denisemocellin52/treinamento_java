public class AppPrint {
    public static void main(String[] args) {
        Printable tela = new Escrever();
        Printable impressora = new Imprimir();

        Gerente.exibir(tela, "Olá mundo");
        Gerente.exibir(impressora, "Olá mundo");
    }
}