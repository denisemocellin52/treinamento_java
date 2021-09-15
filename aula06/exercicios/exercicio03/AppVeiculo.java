package exercicio03;
public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("Chevrolet", "Cruze", 12.5);

        v.exibirDados();
        
        // v.consumo = -10;
        v.setConsumo(-10);
        
        double consumo  = v.getConsumo();
        System.out.println("Consumo: " + consumo);

    }
}