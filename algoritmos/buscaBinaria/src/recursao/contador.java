package recursao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class contador {
    public static int contador(List<Integer>val){
        if (val.isEmpty()){
            return 0;
        }else{
            int primeiro = 1;
            val.remove(0);
            return primeiro + contador(val);
        }
    }
    public static void main(String[]args){
        List<Integer> val = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        int result = contador(val);
        System.out.println(result);
    }
}
