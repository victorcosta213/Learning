package recursao;


public class buscaBinaria {
    public static int buscar(int[]vet,int inicio, int fim, int num){
        if (fim>=inicio){
            int meio = (inicio+fim)/2;
            if (vet[meio]==num){
                return meio;
            } else if (vet[meio]>num){

                buscar(vet,inicio,meio-1,num);

            }else if(vet[meio]>num){

                buscar(vet,meio+1,fim,num);
            }
        }
        return -1;
    }


    public static void main(String[]args){
        int[]vet = {1,2,3,4,5,6,7,8,9,10};
        int inicio=0;
        int fim= vet.length-1;
        int num=5;
        int result= buscar(vet,inicio,fim,num);

        if (result!=-1){
            System.out.println("O elemento: "+num+", está na posicao: "+result);
        }else{
            System.out.println("O elemento não se encontra no array!");
        }


    }

}
