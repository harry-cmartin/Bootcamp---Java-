import Arvores.BinaryTree;
import Arvores.TreeNode;
import Pilhas.Stack;

import Listas.Filas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {


    public static void main(String[] args) {

    //PILHA
        Random rand = new Random();
        List<Integer> lista = new ArrayList<>();

        for(int i = 0 ; i < 10 ; i++){

            lista.add(i);
        }

        //PILHAS
//        System.out.println(lista);
//
//        Stack nova = new Stack();
//        nova.push(lista, 10);
//        System.out.println("SUA PILHA É : " + lista);
//        nova.pop(lista);
//        System.out.println("SUA PILHA É : " + lista);
//
//
//        // FILAS
//
//        Filas fila = new Filas();
//        fila.add(lista,10);
//        System.out.println("SUA FILA É : " + lista);
//        fila.Remove(lista);
//        System.out.println("SUA FILA É : " + lista);
//        fila.insereNomeio(lista, 45);
//        System.out.println("SUA FILA É : " + lista);


        //ARVORES
        TreeNode raiz = new TreeNode(100, null, null);
        BinaryTree arvore = new BinaryTree();

        // Adicionando nós
        arvore.addNode(raiz, 30);
        arvore.addNode(raiz, 70);
        arvore.addNode(raiz, 20);
        arvore.addNode(raiz, 40);
        arvore.addNode(raiz, 80);
        arvore.addNode(raiz, 90);

        // Testando a busca
        System.out.println("Buscando o valor 40 (deve retornar true): " + arvore.search(raiz, 40).getValor());
        System.out.println("Buscando o valor 90 (deve retornar true): " + arvore.search(raiz, 90).getValor());

        System.out.println("Removendo o 90: "  );
        arvore.removeNode(raiz, 90);

        arvore.printTree(raiz);


    }
}