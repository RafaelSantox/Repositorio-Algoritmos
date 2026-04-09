public class Node {
    public Object item; //dado armazenado (generico)
    public Node next; // referencia ao proximo no
    // TODO: crie um construtor node (Object item) que inicializa this.item e coloca next = null
    // TODO: crie um segundo construtor Node(Object item, Node next)
    //       que permite ja encadear na criação

    public Node(Object item) {
        this.item = item;
        this.next = null;
    }

    public Node(Object item, Node next){
        this.item = item;
        this.next = next;
    }
    
    public static class ListaSimples {
        private Node head;

        public ListaSimples(){
            this.head = null;
        }

        // Insere 'item' no inicio da lista (0(1)).
        public void insertFirst(Object item){
            //TODO: cire um novo Node cujo 'next aponta para o head atual'
            //TODO: atualize head para apontar para o novo Node
            Node novo = new Node(item,head);
            head = novo;
        }

        //Percorre a lista e imprime todos os elementos
        public void imprimir(){
            Node atual = head;
            while (atual != null){
                System.out.print(atual.item + " -> ");
                atual = atual.next;
            }
            System.out.println("null");
        }
        
        public static void main(String[] args) {
            ListaSimples lista = new ListaSimples();
            lista.insertFirst("C");
            lista.insertFirst("B");
            lista.insertFirst("A");
            lista.imprimir(); // A -> B -> C -> Null
        }
    }
}
