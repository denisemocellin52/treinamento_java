public class Pessoa {
    //atributos = o que o objeto TEM
    String nome;
    int idade;

    //método construtor = inicializar o objeto
    Pessoa() {
        System.out.println("");
    }


    //métodos = o que o objeto FAZ
    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
        System.out.printf("Tenho %d anos\n", idade);
    }


}
