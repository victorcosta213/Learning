package busca_Binaria;

public class buscaBinaria {

    public static int buscaBinaria(int[]vet, int num){
        int baixo=0;
        int alto = vet.length -1;
        while(baixo<=alto){
            int meio= (alto+baixo)/2;
                    if(num == vet[meio]){
                        return meio;
                    }
                    else if (num < vet[meio]){
                        alto = meio - 1;
                    }else {
                        baixo = meio + 1;
                    }
        }
        return -1;
    }


    public static void main(String[]args){
        int[] vet = {1,2,3,4,5,6,7,8,9,10};
        int num =5;
        int result = buscaBinaria(vet,num);

        if (result == -1){
            System.out.println("O numero "+num+" não se encontra na lista");
        }else {
            System.out.println("O numero "+num+" está na posicao "+result);
        }
    }
}
