public class Exercicio02 {
    public static void main(String[] args) {
        
    }
    static int menor(int n1, int n2, int n3) {
        if(n1 <= n2 && n2 <= n3) {
            return n1;
        }
        if(n2 <= n1 && n1 <= n3) {
            return n2;
    }
        return n3;
}
}