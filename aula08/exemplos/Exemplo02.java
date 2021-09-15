public class Exemplo02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        String entrada;
    
    try { //tente fazer isso
        //System.out.println("Digite um valor inteiro: ");
        numero = teclado.nextInt(); */
    
        System.out.println("Digite um valor inteiro: ");
        entrada = teclado.nextLine();
        numero = Integer.parseInt(entrada); // transforma a String em um int
        System.out.println("Você digitou: " + numero);
    } catch (InputMismatchException e) { //se tiver problema (Exception), erro de execução
        System.out.println("Você não digitou um valor inteiro!");
        System.out.println(e);
    } catch (NumberFormatExpection e) {
        System.out.println("Você não digitou um valor inteiro!");
        System.out.println(e.getMessage());
    } catch (Exception e) {
        System.out.println("Erro: " + e);
    } finally { //sempre execute esse bloco (se deu erro ou se não deu erro)
        teclado.close();
        System.out.println("Final do programa...");
    }
    // Ler 
    }
    }
