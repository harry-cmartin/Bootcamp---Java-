package Arvores;



public class BinaryTree{

    public void addNode(TreeNode head , int valor){

        //assumindo que nunca terào valores repetidos

        TreeNode novo = new TreeNode(valor , null , null);

        if(head == null){
            head = novo;
            return;
        }

        if(valor > head.getValor()){

            if(head.getDireita() == null){
                head.setDireita(novo);
                return;
            }else{
                addNode(head.getDireita() , valor);
            }

        }else if(valor < head.getValor()){

            if(head.getEsquerda() == null){
                head.setEsquerda(novo);
                return;
            }else {

                addNode(head.getEsquerda() , valor);
            }
        }

    }


    public TreeNode search(TreeNode head , int valor){


       if(head == null ){
           return null;
       }

       if(head.getValor() == valor) {
           return head;
       }

       System.out.println(head.getValor() + " -> ");


       if(valor < head.getValor()){


           return search(head.getEsquerda() , valor);

       }else if(valor > head.getValor()){

           return search(head.getDireita() , valor);
       }

       return null;
    }


    private int removeMaiorDaEsquerda(TreeNode node) {
        TreeNode pai = node;
        TreeNode atual = node.getEsquerda();

        // Desce tudo para a direita
        while (atual.getDireita() != null) {
            pai = atual;
            atual = atual.getDireita();
        }

        int valorMaior = atual.getValor();

        // Remove o nó que continha o maior valor
        if (pai == node) {
            pai.setEsquerda(atual.getEsquerda());
        } else {
            pai.setDireita(atual.getEsquerda());
        }

        return valorMaior;
    }

    public TreeNode removeNode(TreeNode head, int valor) {
        if (head == null) {
            return null;
        }

        if (valor < head.getValor()) {

            head.setEsquerda(removeNode(head.getEsquerda(), valor));
        } else if (valor > head.getValor()) {

            head.setDireita(removeNode(head.getDireita(), valor));
        } else {


            // Caso 1: Nó folha ou Caso 2: Nó com 1 filho (só tem direita)
            if (head.getEsquerda() == null) {
                return head.getDireita();
            }
            // Caso 2: Nó com 1 filho (só tem esquerda)
            else if (head.getDireita() == null) {
                return head.getEsquerda();
            }
            // Caso 3: Nó com 2 filhos
            else {
                // Pega o maior valor da subárvore esquerda e o remove de lá
                int maiorValor = removeMaiorDaEsquerda(head);
                head.setValor(maiorValor);
            }
        }

        return head;
    }
    public void printTree(TreeNode head) {
        if (head != null) {

            printTree(head.getEsquerda());


            System.out.print(head.getValor() + " ");


            printTree(head.getDireita());
        }
    }

}
