package tabelaHash;

import java.util.HashMap;
import java.util.Map;

public class aplicando {
    public static void main(String[]args){
        Map<String,Double> estoque= new HashMap<>();
        estoque.put("maçã",12.50);
        estoque.put("Laranja",8.00);
        estoque.put("abacaxi",10.00);

        System.out.println(estoque.get("maçã"));
    }
}
