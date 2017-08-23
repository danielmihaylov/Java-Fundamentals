package JavaOOPAdvanced.Generics.JarOfT.JarOfT;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<E> {

    private Deque<E> contents;

    public Jar(){
        this.contents = new ArrayDeque<E>();
    }

    public void add(E element){
        this.contents.add(element);
    }

    public E remove(){
        return this.contents.pop();
    }

}
