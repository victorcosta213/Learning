package recursao;

public class fatorial {
    public static int fatorial(int i){ //pilha de chamada!
        if (i==1){
            return i;
        }else{
            return i * fatorial(i-1);
        }
    }
    public static void main(String[]args){
        int x = fatorial(5);
        System.out.println(x);
    }

}
