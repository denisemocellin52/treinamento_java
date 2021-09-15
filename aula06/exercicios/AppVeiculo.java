
public class AppVeiculo {

    public static void main(String[] args) {
        // cria um novo objeto Pessoa
        Veiculo v = new Veiculo("Renault", "Sandero", 14.5);

        v.exibirDados();
        double consumo = v.obterConsumo();
        System.out.println("O consumo foi: " + consumo);
    }
}