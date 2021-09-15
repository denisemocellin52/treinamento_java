package exercicio04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(2, 120, 15);
        
        System.out.println(relogio.horaAtual());
    }
}