public class Main {
    public static void main (String[] args){
        Pilha<Integer> pilha = new Pilha<>();

        System.out.println("Topo da pilha: " + pilha.topo());
        System.out.println(pilha);

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println("Pilha após empilhar: " + pilha);

        System.out.println("Desempilhar elemento: " + pilha.desempilha());

        System.out.println("Pilha final: " + pilha);
    }
}