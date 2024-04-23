package recursao;

public class regressivo {

    public static void regressivo (int i){
        System.out.println(i);
        if(i > 0){
        regressivo(i-1);}
        else {
            System.out.println("terminou a contagem");
        }
    }
    public static void main(String[]args){
        regressivo(6);
    }
}
