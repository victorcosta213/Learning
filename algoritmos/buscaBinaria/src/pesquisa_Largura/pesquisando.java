package pesquisa_Largura;

import java.util.*;

public class pesquisando {
    private static Map<String, List<String>> graph = new HashMap<>();

    private static boolean search(String name) {
        Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));
        // This list is how you keep track of which people you've searched before.
        List<String> searched = new ArrayList<>();

        while (!searchQueue.isEmpty()) {
            String person = searchQueue.poll();
            // Only search this person if you haven't already searched them
            if (!searched.contains(person)) {
                if (person_is_seller(person)) {
                    System.out.println(person + " is a mango seller!");
                    return true;
                } else {
                    searchQueue.addAll(graph.get(person));
                    // Marks this person as searched
                    searched.add(person);
                }
            }
        }

        return false;
    }

    private static boolean person_is_seller(String name) {
        return name.endsWith("m");
    }
    public static void main(String[] args) {
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", Arrays.asList("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());

        search("you");
    }
}

/*glosarrio:
função search


1- Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));: Cria uma fila (searchQueue) e
inicializa-a com os vizinhos da pessoa fornecida como argumento (name) no grafo.

2- List<String> searched = new ArrayList<>();: Cria uma lista (searched) para rastrear as pessoas que
já foram pesquisadas.

3- while (!searchQueue.isEmpty()) {: Inicia um loop que continua enquanto a fila de busca não estiver vazia.

4- String person = searchQueue.poll();: Remove e obtém o primeiro elemento da fila.
Esse elemento representa uma pessoa a ser verificada.

5- if (!searched.contains(person)) {: Verifica se essa pessoa já foi pesquisada anteriormente.

6- if (person_is_seller(person)) {: Se a pessoa for identificada como um "vendedor de mangas"
(conforme a função person_is_seller()), imprime uma mensagem indicando que encontrou um vendedor
de mangas e retorna true, indicando sucesso na busca.

7- else {: Se a pessoa não for um vendedor de mangas, adiciona todos os vizinhos (conexões) dessa
pessoa à fila de busca (searchQueue) para continuar a busca em largura.

8- searchQueue.addAll(graph.get(person));: Adiciona os vizinhos da pessoa atual à fila de busca.

9- searched.add(person);: Marca a pessoa atual como pesquisada, para evitar pesquisá-la novamente.

}

}

return false;: Se o loop termina e nenhum vendedor de mangas é encontrado, a função retorna false.

 */
