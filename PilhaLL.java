
public class PilhaLL {

    static No topo = null;

    public static void main(String[] args) {

        empilhar(5);
        empilhar(9);
        empilhar(3);
        empilhar(12);

        System.out.println("Essa Pilha possui "+tamanho(topo)+" elementos, são eles:");
        exibir(topo);
        
        desempilhar();
        System.out.println("Essa Pilha agora possui "+tamanho(topo)+" elementos, são eles:");
        exibir(topo);
        
        desempilhar();
        System.out.println("Essa Pilha agora possui "+tamanho(topo)+" elementos, são eles:");
        exibir(topo);
        
        desempilhar();
        System.out.println("Essa Pilha agora possui "+tamanho(topo)+" elementos, são eles:");
        exibir(topo);

        desempilhar();
        System.out.println( "Essa Pilha agora possui " + tamanho(topo) + " elementos, são eles:" );
        exibir(topo);
        
    }

    static void empilhar( int x ) {
        No novo = new No(x);
        if ( isEmpty() )
            topo = novo;
        else {
          novo.prox = topo;
          topo = novo;
        }
    }

    static void exibir( No temp ) {
        if ( isEmpty() ) 
            System.out.println("Pilha Vazia, nada a exibir");
        else 
            if ( temp != null ) {
                System.out.println( temp.valor );
                exibir( temp.prox );
            }
    }

    static int tamanho( No temp ) {
        if ( temp != null )
            return 1 + tamanho( temp.prox );

        return 0;
    }
    
    static void desempilhar(){
       No temp = topo;
       
       if( isEmpty() )
          System.out.println( "Lista vazia..." );
       else{
          System.out.println( "Desempilhado: " + topo.valor );
          topo = topo.prox;
       }
    }
    
    static boolean isEmpty(){
       boolean empty = false;
         
         if( topo == null ){
            System.out.println( "Empty List ..." );
            return true;
         }
       return empty;
    }
    
    
    
    
    

}