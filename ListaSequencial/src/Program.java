public class Program {
    public static void main(String[] args) {
        ListaSequencial lista = new ListaSequencial();


        System.out.println("Iniciando lista");
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
        System.out.println("Inserindo no começo");
        lista.inserirNoComeco(3);
        lista.imprimir();
        System.out.println("inserindo no final");
        lista.inserirNoFinal(7);
        lista.imprimir();
        System.out.println("Buscando elemento");
        lista.buscarElemento(6);
        System.out.println("Eliminando elemento");
        lista.eliminarElemento(3);
        lista.imprimir();

    }
}
