import java.util.Arrays;

public class Program {

    public static void quickSort(int[] vetor, int inicio, int fim){
        if(inicio < fim){
            int pivo = separacao(vetor, inicio,fim);
            quickSort(vetor, inicio, pivo);
            quickSort(vetor, pivo+1, fim);
        }
    }
    public static int separacao(int[] vetor, int inicio, int fim){
        int pivo = vetor[(inicio+fim)/2];
        int i = inicio-1;
        int j = fim+1;
         while(true){
             do{
                 i++;
             }while(vetor[i] < pivo);
             do{
                 j--;
             }while(vetor[j] > pivo);
             if(i >= j){
                 return j;
             }
             int aux = vetor[i];
             vetor[i] = vetor[j];
             vetor[j] = aux;
         }
    }
    public static void main(String[] args) {


        int vetor[] = {9,5,7,2,4,1,3,8,6,10};
        /*int[] vetor = new int[10];
        for(int i=0; i< vetor.length;i++){
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }*/

        System.out.println("Vetor Original :" + Arrays.toString(vetor));
        quickSort(vetor,0,9);
        System.out.println("Vetor Ordenado : " + Arrays.toString(vetor));
    }
}
