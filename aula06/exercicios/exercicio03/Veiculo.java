package exercicio03;
public class Veiculo {
    // atributos
    String marca, modelo;
    private double consumo;

    // construtor
    Veiculo(String marca, String modelo, double consumo) {
        // atributo = parâmetro
        this.marca = marca;
        this.modelo = modelo;
        setConsumo(consumo);
    }

    void exibirDados() {
        System.out.printf("Marca: %s Modelo: %s\n", marca, modelo);
    }

    double getConsumo() { //obterConsumo()
        return consumo;
    }

    void setConsumo(double consumo) { //alterarConsumo
        if(consumo > 0) {
            this.consumo = consumo;
        }
    }

}
