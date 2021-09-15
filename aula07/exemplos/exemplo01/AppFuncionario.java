public class AppFuncionario {
    public static void main(String [] args) {
        Funcionario funcionario = new Funcionario("Denise", 3000);
        Funcionario funcionario2 = new Funcionario("Kelly");
        Funcionario funcionario3 = new Funcionario();
        Gerente gerente = new Gerente("Douglas", 5000, 4);

        System.out.println(funcionario.exibirDados());
        System.out.println(funcionario2.exibirDados());
        System.out.println(funcionario3.exibirDados());
        System.out.println(gerente.exibirDados());

        funcionario.aumentarSalario(10);
        gerente.aumentarSalario(10);
        System.out.println("Novos salários:");
        System.out.println(funcionario.exibirDados());
        System.out.println(gerente.exibirDados());
    }
}
