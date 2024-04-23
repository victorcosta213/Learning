package tabelaHash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class vote {
    public static void main(String[]args){
        Map<String,String> votaram = new HashMap<>();
        Scanner sc = new Scanner(System.in);


        for (int i =0 ; i<5;i++) {
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();
            if (votaram.get(nome) == null) {
                System.out.println("pode votar");
                votaram.put(nome, "votou");
            } else {
                System.out.println("Não pode votar");
            }
        }

   }
}
