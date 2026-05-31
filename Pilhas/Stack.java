package Pilhas;

import java.util.List;

public class Stack {



    public void push(List<Integer> y , int x){

        if(y != null){

            y.add(x);

        }


    }


    public void pop(List<Integer> y){

        if (y != null){

            y.remove(y.size() - 1);

        }else{

            System.out.println("Pilhas.Stack is empty");

        }




    }

    public int numberOfElements(List y){

        return y.size() - 1;
    }




}


