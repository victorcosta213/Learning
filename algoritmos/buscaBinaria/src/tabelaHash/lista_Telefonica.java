package tabelaHash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class lista_Telefonica {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int ref =0;
        Map<String,String> agenda = new HashMap<>();

        while (ref!=3){
            System.out.println("1- Adicionar número na agenda:");
            System.out.println("2- Pesquisar número por nome:");
            System.out.println("3- Sair da Agenda");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            int i =  sc.nextInt();
            sc.nextLine();
            switch (i){
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome= sc.nextLine();
                    System.out.print("Digite o número: ");
                    String num = sc.nextLine();
                    agenda.put(nome,num);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Digite o nome: ");
                    String name = sc.nextLine();
                    System.out.println(agenda.get(name));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Saindo da Agenda...");
                    System.out.println("Programa Finalizado!");
                    ref = 3;
                    break;
            }

        }
    }
}
