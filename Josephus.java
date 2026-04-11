public class Josephus {
    public static void main(String[] args){
        int N = 6;  //numero de pessoas
        int M = 3;  //salto (elimina a cada M contagens)

        // --- Passo 1: Montar a lista circular --- 
        Node primeiro = new Node(1);
        Node atual = primeiro;
        for (int i = 2; i <= N; i++){
            //TODO: crie um novo Node com valor i
            //TODO: faca atual.next = novo
            //TODO: avance atual para novo
            Node novo = new Node(i);
            atual.next = novo;
            atual = novo;
        }
        
        // TODO: faça atual.next = primeiro (fecha o circulo)
        atual.next = primeiro;

        //  --- Passo 2: Simular a eliminação ---
        Node anterior = atual; // o no antes do atual
        atual = primeiro;

        System.out.println("Ordem de eliminaçao: ");
        while (atual.next != atual) { // enquanto houver mais de 1
            // TODO: avance (anterior, atual) por M-1 posicoes
            //      isto e, remita M-1 vezes:
            //      anterior = atual
            //        atual = atual.next
            // TODO: elimine 'atual' fazendo anterior.next = atual.next
            // TODO: imprima o eliminado: atual.item
            // TODO: avance atual para anterior.next

            for (int i = 1; i < M; i++){
                anterior = atual;
                atual = atual.next;
            }
            anterior.next = atual.next;
            System.out.println(atual.item);
            atual = anterior.next;

        }
        System.out.println("\nSobrevivente: " + atual.item);
    }
}
