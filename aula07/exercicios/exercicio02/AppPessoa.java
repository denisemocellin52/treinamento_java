public class AppPessoa {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Denise", "(48) 985050313");
        Estudante e = new Estudante("Kelly", "(48) 98828-8732", "Fotografa");
        Professor s = new Professor("Marcos", "(48) 9988-2570", 3500);

        System.out.println(p);
        System.out.println(e);
        System.out.println(s);
    }
}
