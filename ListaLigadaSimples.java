

public class ListaLigadaSimples {

    static No inicio = null;

    public static void main(String[] args) {
        inserir(5);
        inserir(9);
        inserir(3);
        inserir(12);

        System.out.println("Essa lista possui " + tamanho(inicio)+" elementos, são eles:");
   
        exibir(inicio);

    }

    static void inserir( int x ) {
        No novo = new No( x );
        if ( inicio == null )
            inicio = novo;
        else {
            No temp = inicio;
            while ( temp.prox != null )
                temp = temp.prox;
            
            temp.prox = novo;
        }
    }

    static void exibir(No temp) {
        if (inicio == null) 
            System.out.println("Lista Vazia, nada a exibir");
        else 
            if ( temp != null ) {
                System.out.println( temp.valor );
                exibir( temp.prox );
            }
    }

    static int tamanho(No temp) {
        if (temp != null)
            return 1 + tamanho(temp.prox);

        return 0;
    }
    
    static void desempilhar(){
    
    }
    
    }
    
    
    
    
    
    
    
    
    
    

