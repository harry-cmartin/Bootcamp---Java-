package Arvores;

public class TreeNode {

    private int valor;
    private TreeNode esquerda;
    private TreeNode direita;

    public TreeNode(int valor, TreeNode esquerda, TreeNode direita) {
        this.valor = valor;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public TreeNode getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(TreeNode esquerda) {
        this.esquerda = esquerda;
    }

    public TreeNode getDireita() {
        return direita;
    }

    public void setDireita(TreeNode direita) {
        this.direita = direita;
    }
}