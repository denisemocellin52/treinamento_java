public class AppAnimal {
    public static void main(String[] args) {
        Animal a = new Animal("Jade", "Siames", 2014);
        Animal a2 = new Animal("Ninhauxa", "Felina", 2005);

        Proprietario p = new Proprietario("Ricardo", "(11)87654-1234");
        Animal a3 = new Animal("Lulu", "Pitbull", 2020, p);

        System.out.println(a);
        System.out.println(a2);
        System.out.println(a3);
    }
}
