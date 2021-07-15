import java.util.Arrays;


public class ListaSequencial {

    private Integer posicaoInicial;
    private Integer posicaoFinal;
    private int lista[];


    public ListaSequencial() {
        this.posicaoInicial = -1;
        this.posicaoFinal = -1;
        this.lista = new int[10];
    }

    public void iniciarLista(int numero){
        lista[0] = numero;
        posicaoInicial++;
        posicaoFinal++;
        lista[1] = posicaoFinal;
    }

    public void inserir(int numero){
        posicaoFinal++;
        lista[posicaoFinal] = numero;
     }

     public void inserirNoComeco(int numero) {

         for (int i = posicaoFinal; i <= lista.length; i--) {
                /* if(lista[posicaoFinal] != 0){
                     posicaoFinal++;
                     lista[posicaoFinal] = lista[i];
                 }*/
                    lista[i] = lista[i - 1];
                 if(lista[i] == lista[posicaoInicial]){
                     lista[posicaoInicial] = numero;
                     break;
                 }
             }
         }
     public void inserirNoFinal(int numero){
         for (int i = posicaoInicial; i <= lista.length ; i++) {
             lista[i] = lista[i+1];
             if(lista[i] == lista[posicaoFinal]){
                 lista[posicaoFinal] = numero;
                 break;
             }
         }
     }
     public void empurrar(int posicao){
        int aux;
      for (int i=0; i<=posicaoFinal; i++){
          if(lista[i] == lista[posicao]){
              aux = lista[i+1];
              lista[i+1] = lista[i];
              lista[i] = aux;
              break;
          }
      }
    }
    public void puxar(int posicao){
        int aux;
        for (int i=0; i<=posicaoFinal; i++){
            if(lista[i] == lista[posicao]){
                aux = lista[i-1];
                lista[i-1] = lista[i];
                lista[i] = aux;
                break;
            }
        }
    }

    public void buscarElemento(int posicao){
        for (int i: lista) {
            if(lista[i] == lista[posicao]){
                System.out.println(lista[i]);
                break;
            }
        }
    }

    public void imprimir(){
        System.out.println(Arrays.toString(lista));
    }

}
