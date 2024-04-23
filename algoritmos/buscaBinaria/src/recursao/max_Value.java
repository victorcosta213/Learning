package recursao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class max_Value {
    public static int maior(List<Integer>val,int primeiro){
        if (val.isEmpty()){
            return primeiro;
        }else{
            if (val.get(0)>primeiro){
                primeiro = val.get(0);
            }
            val.remove(0);
            return maior(val,primeiro);
        }
    }
    public static void main(String[]args){
        List<Integer>val= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,658));
        int result= maior(val,0);
        System.out.println(result);
    }
}
