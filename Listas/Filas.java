package Listas;


import java.util.List;


public class Filas {



    public void add(List<Integer> x , int y){

        if(x != null){

            x.add(0 , y);


        }

    }


    public void Remove(List<Integer> x){

        x.remove(x.size() - 1);

    }

    public void insereNomeio(List<Integer> x, int y){


        if(x != null){

            int tamanho = x.size();
            System.out.println(tamanho);
            x.add(tamanho/2 , y);

        }

    }

}
