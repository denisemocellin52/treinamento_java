import java.util.HashMap;

public class Exemplo03 {
    public static void main(String[] args){
        HashMap<Integer, Pessoa> mapa1 = new HashMap<>();

        mapa1.put(123, new Pessoa(123, "Denise", "dregert26@gmail.com"));
        mapa1.put(456, new Pessoa(456, "Kelly", "kjds@gmail.com"));
        mapa1.put(789, new Pessoa(789, "Daniel", "dadanet@gmail.com"));
    
        System.out.println(mapa1.get(456));

        HashMap<String, Pessoa> mapa2 = new HashMap<>();

        mapa2.put("dregert26@gmail.com", new Pessoa(123, "Denise", "dregert26@gmail.com"));
        mapa2.put("kjds@gmail.com", new Pessoa(456, "Kelly", "kjds@gmail.com"));
        mapa2.put("dadanet@gmail.com", new Pessoa(789, "Daniel", "dadanet@gmail.com"));
        if(mapa2.containsKey("dadanet@gmail.com")){
            System.out.println("Achei!");
        }else{
            System.err.println("Não achei!");
        }        
        System.out.println(mapa2.get("dadanet@gmail.com"));
}
}
