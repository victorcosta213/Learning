package dijkstra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class praticando {
    private static Map<String, Map<String, Double>> graph;
    private static List<String> processados = new ArrayList<>();

    private static String menorVertice(Map<String, Double> custo) {
        Double menorCusto = Double.POSITIVE_INFINITY;
        String verticeDeMenorCusto = null;

        for (Map.Entry<String, Double> no : custo.entrySet()) {
            Double menorNo = no.getValue();

            if (menorNo < menorCusto && !processados.contains(no.getKey())) {
                menorCusto = menorNo;
                verticeDeMenorCusto = no.getKey();
            }
        }
        return verticeDeMenorCusto;
    }

    public static void main(String[] args) {
        graph = new HashMap<>();

        graph.put("start", new HashMap<>());
        graph.get("start").put("a", 6.0);
        graph.get("start").put("b", 2.0);

        graph.put("a", new HashMap<>());
        graph.get("a").put("fin", 1.0);

        graph.put("b", new HashMap<>());
        graph.get("b").put("a", 3.0);
        graph.get("b").put("fin", 5.0);

        graph.put("fin", new HashMap<>());

        // tabela de custos
        Map<String, Double> custo = new HashMap<>();
        custo.put("a", 6.0);
        custo.put("b", 2.0);
        custo.put("fin", Double.POSITIVE_INFINITY);

        // tabela de parentes
        Map<String, String> parents = new HashMap<>();
        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("fin", null);

        String no = menorVertice(custo);

        while (no != null) {
            Double cust = custo.get(no);

            Map<String, Double> vizinhos = graph.get(no);
            for (String n : vizinhos.keySet()) {
                double novoCusto = cust + vizinhos.get(n);

                if (custo.get(n) > novoCusto) {
                    custo.put(n, novoCusto);
                    parents.put(n, no);
                }
            }

            processados.add(no);
            no = menorVertice(custo);
        }

        System.out.println(custo);
    }
}

