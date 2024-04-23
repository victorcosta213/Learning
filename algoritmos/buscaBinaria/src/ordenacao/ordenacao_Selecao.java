package ordenacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ordenacao_Selecao {
    public static int menor(List<Integer>lista){
        int menor= lista.get(0);
        int indice =0;

        for (int i=0; i<lista.size();i++){
            if(lista.get(i)<menor){
                menor = lista.get(i);
                indice=i;
            }
        }
        return indice;
    }

    public static List<Integer> ordenacao_Selecao(List<Integer> lista){
        List<Integer> novaLista = new ArrayList<>(lista.size());

        while (!lista.isEmpty()) {
            int menor = menor(lista);
            novaLista.add(lista.get(menor));
            lista.remove(menor);
        }

        return  novaLista;
    }
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(5,2,4,9,7));

        System.out.println(ordenacao_Selecao(lista));
    }
}
