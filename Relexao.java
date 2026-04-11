public class Relexao {
    /*
        Por que inserir no meio de um array é mais lento que inserir no meio de uma lista
        encadeada? Pense no que cada estrutura precisa fazer com os elementos existentes.
        
        R: A diferença está no que cada estrutura precisa fazer quando se insere no meio:
            No array é necessário deslocar elementos, no pior dos casos a complexidade se torna O(n) para um array de tamanho n
            Na lista encadeada só é necessário ajustar ponteiros, se já houver um nó de referência a insersão é O(1), somente 
            caso seja necessário percorer a lista, a complexidade se torna O(n)
        
        Para acessar o k-ésimo elemento, qual estrutura é mais rápida – o array ou a lista? Por
        quê?
        
        R: O array é mais rápido, cada elemento ficam em uma possição contínua na memória, então o acesso ao k-ésimo elemento 
            é direto. Com complexidade O(1)
           Na lista, os elementos estão ligados por ponteiros, para chegar ao k-ésimo elemento é necessário começar no head e percorrer nó a nó até chegar no k, com complexidade O(n)
        
        Seria possível resolver o Problema de Josephus usando um array em vez de uma lista
        circular? Se sim, como ficaria a remoção? Seria mais ou menos eficiente?
        
        R: Sim, é possível resolver o problema de Josephus com um array, utilizando um índice 
        circular e removendo elementos por deslocamento. No entanto, essa abordagem é menos 
        eficiente, pois cada remoção custa O(n), resultando em complexidade total O(n²). 
        Já com uma lista circular, a remoção é feita apenas com ajuste de ponteiros (O(1)), 
        tornando a solução mais eficiente com complexidade O(n).
    */
}
