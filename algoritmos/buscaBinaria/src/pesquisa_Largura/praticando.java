package pesquisa_Largura;

import java.util.*;

public class praticando {
    private static Map<String, List<String>> grafo = new HashMap<>();

    private static boolean pesquisa(String name){
        Queue<String> filaPesquisa = new ArrayDeque<>(grafo.get(name));
        List<String> buscado = new ArrayList<>();

        while (!filaPesquisa.isEmpty()){
            String individuo = filaPesquisa.poll(); // recebe o primeiro elemento da fila de pesquisa

            if (!buscado.contains(individuo)){
                if (pessoa_e_vendedor(individuo)){
                    System.out.println("O "+individuo+" é um vendedor de manga!");
                    return true;
                }else{
                    filaPesquisa.addAll(grafo.get(individuo));
                    buscado.add(individuo);
                }
            }
        }
        return false;
    }

    private static boolean pessoa_e_vendedor(String idividuo){
        return idividuo.endsWith("y");
    }
    public static void main(String[]args){

        grafo.put("you", Arrays.asList("alice","bob","claire"));
        grafo.put("bob", Arrays.asList("anuj","peggy"));
        grafo.put("alice", Arrays.asList("peggy"));
        grafo.put("claire", Arrays.asList("thom","jonny"));
        grafo.put("anuj",Collections.emptyList());
        grafo.put("peggy",Collections.emptyList());
        grafo.put("thom",Collections.emptyList());
        grafo.put("jonny",Collections.emptyList() );

        pesquisa("you");
    }
}
