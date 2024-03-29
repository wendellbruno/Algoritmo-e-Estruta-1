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

    public void iniciarLista(int numero) {
        lista[0] = numero;
        posicaoInicial++;
        posicaoFinal++;
    }

    public void inserir(int numero) {
        posicaoFinal++;
        lista[posicaoFinal] = numero;
    }

    public void inserirNoComeco(int numero) {
        if (lista[posicaoInicial] != 0) {
            int aux = lista[posicaoFinal];
            if (posicaoFinal < 9) {
                posicaoFinal++;
            }
            lista[posicaoFinal] = aux;
        }
        if (lista[posicaoFinal] != 0) {
            for (int i = posicaoFinal; i <= lista.length; i--) {
                lista[i] = lista[i - 1];
                if (lista[i] == lista[posicaoInicial]) {
                    lista[posicaoInicial] = numero;
                    break;
                }
            }
        }
    }

    public void inserirNoFinal(int numero) {
        if (posicaoFinal < 9) {
            posicaoFinal++;
            lista[posicaoFinal] = numero;
        } else {
            for (int i = posicaoInicial; i <= lista.length; i++) {
                lista[i] = lista[i + 1];
                if (lista[i] == lista[posicaoFinal]) {
                    lista[posicaoFinal] = numero;
                    break;
                }
            }
        }
    }
    public void buscarElemento ( int posicao){
            for (int i : lista) {
                if (lista[i] == lista[posicao]) {
                    System.out.println(lista[i]);
                    break;
                }
            }
        }
    public void eliminarElemento(int posicao){
        for (int i:lista) {
            if(lista[i] == lista[posicao]){
                lista[i] = 0;            }
        }
    }

        public void imprimir () {
            System.out.println(Arrays.toString(lista));
        }

        /* Ignorar tudo abaixo.
        public void empurrar ( int posicao){
            int aux;
            for (int i = 0; i <= posicaoFinal; i++) {
                if (lista[i] == lista[posicao]) {
                    aux = lista[i + 1];
                    lista[i + 1] = lista[i];
                    lista[i] = aux;
                    break;
                }
            }
        }
        public void puxar ( int posicao){
            int aux;
            for (int i = 0; i <= posicaoFinal; i++) {
                if (lista[i] == lista[posicao]) {
                    aux = lista[i - 1];
                    lista[i - 1] = lista[i];
                    lista[i] = aux;
                    break;
                }
            }
        }*/
    }

