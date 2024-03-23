package javarecordscontrol;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pilha<T> {
    private int topo;
    private T[] elementos;

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public T[] getElementos() {
        return elementos;
    }

    public void setElementos(T[] elementos) {
        this.elementos = elementos;
    }
    
    public Pilha(int tamanho){
          elementos =(T[]) new Object[tamanho];
          this.topo = -1;
    }
    public boolean isFull(){
        return topo==elementos.length-1;
        /*if(topo==elementos.length-1)
            return true;
        return false; */
    }
    public boolean isEmpty(){
        // return this.topo==-1;
        if(this.topo==-1)
            return true;
        return false;
    }
   public boolean push(T novoDado) {
    if (topo < elementos.length - 1) { // Verifica se há espaço na pilha
        elementos[++topo] = novoDado; // Incrementa o topo e adiciona o novo dado
        return true; // Retorna true indicando sucesso na adição
    } else {
        return false; // Retorna false indicando falha (pilha cheia)
    }
}

    public T pop(){
        T retorno = elementos[topo];
        topo--;
        return retorno;
        //return elementos[topo--];
    }// fim pop
    public int size(){
        return topo+1;
    }
    
    public T peek(){
        return elementos[topo];
    }
    
     public void clear() {
        // Defina a lógica para limpar a pilha aqui
        elementos = (T[]) new Object[999];
        topo = -1;
    }
    @Override
    public String toString(){
        StringBuilder retorno = new StringBuilder();
        for(int i=topo;i>=0;i--)
            retorno.append(elementos[i] + "\n");
        retorno.append("-----------");
        return retorno.toString();
    }

    
}