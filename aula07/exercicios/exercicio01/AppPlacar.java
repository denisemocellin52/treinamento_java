public class AppPlacar {

    public static void main(String[] args) {
        Placar p1 = new Placar();
        Placar p2 = new Placar("Internacional", "Flamengo");
        Placar p3 = new Placar("Internacional", "Flamengo", 3, 1);

            System.out.println(p1.exibirPlacar());
            System.out.println(p2.exibirPlacar());
            System.out.println(p3.exibirPlacar());
        }

    }

