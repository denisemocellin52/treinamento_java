
public class Exercicio01 {
    public static void main(String[] args) {
        boolean resultado;

        resultado = ehPar(8);

        if(resultado == true)  {
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");
        }
        }
        static boolean ehPar(int numero) {
            if(numero % 2 == 0){
                return true;
            }else{
                return false;
            }
        }
    }
