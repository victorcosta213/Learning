package ordenacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class quickSort {
    public static void main(String[]args){
        System.out.println(quickSort(Arrays.asList(9,5,1,7,4,6,3)));
    }

    public static List<Integer> quickSort(List<Integer>list){
        if(list.size()<2){
            return list;
        }else{
            Integer pivot = list.get(0);
            List<Integer> less= list.stream().skip(1).filter(el -> el <= pivot).collect(Collectors.toList());
            List<Integer> greater = list.stream().skip(1).filter(el -> el >pivot).collect(Collectors.toList());

            return Stream.of(
                    quickSort(less).stream(),
                    Stream.of(pivot),
                    quickSort(greater).stream()).flatMap(Function.identity()).collect(Collectors.toList());

        }
    }
}

/* glossario:
    1-    list.stream(): Converte a lista list em um stream. Um stream é uma sequência de elementos que pode ser
        processada em paralelo ou em sequência.

    2-    .skip(1): Pula o primeiro elemento do stream. Isso significa que o primeiro elemento da lista não será
        incluído no novo stream. A operação skip é usada para ignorar os primeiros n elementos do stream.

    3-    .filter(el -> el <= pivot): Filtra os elementos do stream com base na condição fornecida.
        Neste caso, apenas os elementos que são menores ou iguais ao valor da variável pivot são mantidos.

    4-   .collect(Collectors.toList()): Coleta os elementos filtrados em uma lista.
        O método collect é usado para transformar os elementos do stream de volta em uma estrutura de coleção,
         neste caso, uma lista. Collectors.toList() é um coletor que acumula os elementos em uma lista.

        Portanto, a linha de código cria uma nova lista chamada less que contém
        todos os elementos da lista original (a partir do segundo elemento),
        que são menores ou iguais ao valor de pivot. Este tipo de operação é frequentemente utilizado
        em algoritmos de ordenação, onde os elementos são divididos em categorias com base em algum critério,
        como neste caso, menores ou iguais a um determinado valor (pivot).

        */

/*

   5-    Stream.of(...): Cria um stream a partir dos elementos fornecidos como argumentos. Neste caso,
        são três elementos:

   6-   quickSort(less).stream(): O stream dos elementos menores ou iguais ao pivot,
        após serem ordenados recursivamente pelo QuickSort.

   7-    Stream.of(pivot): Um stream contendo apenas o pivot atual.

   8-    quickSort(greater).stream(): O stream dos elementos maiores que o pivot,
        após serem ordenados recursivamente pelo QuickSort.

   9-   .flatMap(Function.identity()): O método flatMap é usado para combinar os três streams em um único stream.
         A função Function.identity() é usada como um mapeamento de identidade, ou seja,
         não faz nenhuma transformação nos elementos. O flatMap é usado aqui para "achatar" o stream de streams
         resultante em um único stream contendo todos os elementos.

  10-   .collect(Collectors.toList()): Coleta os elementos do stream em uma lista.
        Neste ponto, todos os elementos (menores que o pivot, o próprio pivot e maiores que o pivot)
        foram unidos em um único stream e são coletados em uma lista.
        O coletor utilizado aqui é Collectors.toList().

        Portanto, esse trecho de código é a parte central do algoritmo de ordenação QuickSort,
        onde a recursividade é utilizada para ordenar subconjuntos da lista original com base no pivot.
        Essa abordagem de dividir, ordenar recursivamente e combinar é a essência do algoritmo QuickSort.

 */
