public class Program {
    public static void main(String[] args) {
        ListaSequencial lista = new ListaSequencial();


        lista.iniciarLista(5);
        lista.inserir(6);
        lista.inserir(7);
        lista.inserir(3);
        lista.inserir(2);
        lista.inserir(1);
        lista.inserir(4);
        lista.inserir(8);
        lista.inserir(9);
        lista.inserir(10);
        lista.imprimir();
       // lista.empurrar(2);
       // lista.imprimir();
        //lista.puxar(6);
        //lista.imprimir();
       lista.inserirNoComeco(3);
        //lista.imprimir();
       //lista.inserirNoFinal(7);
       lista.imprimir();

    }
}
