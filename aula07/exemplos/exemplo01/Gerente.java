    public class Gerente extends Funcionario {
        private int numFuncionarios;

        //extends => gerente é um "funcionario - herança"
        public Gerente(String nome, double salario, int numFuncionarios) {
            
            super(nome, salario); // chama o construtor da superClasse: Funcionario
            this.numFuncionarios = numFuncionarios;
        }
@Override // este método é uma sobrescrita do original na classe base
public String exibirDados() {
    return getNome() + " : " + getSalario() + " : " + numFuncionarios;
}
@Override
public void aumentarSalario(double porcentagem) {
    super.aumentarSalario(porcentagem + 20);
}
    }