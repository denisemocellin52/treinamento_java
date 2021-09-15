public class Proprietario {
    private String nome, telefone;

    public Proprietario(){
        nome = "Não cadastrado";
        telefone = "() - ";
    }
    
    public Proprietario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return nome + ": " + telefone;
    }
}