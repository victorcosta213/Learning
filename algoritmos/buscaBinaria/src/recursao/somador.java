package recursao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class somador {


    public static int somador(List<Integer>val){
        if (val.isEmpty()){
            return 0;
        }else{
            int primeiroElemento = val.get(0);
            val.remove(0);
            return primeiroElemento + somador(val);
        }
   }


    public static void main(String[]args){
        List<Integer> valores = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        int result= somador(valores);
        System.out.println(result);
    }

}
