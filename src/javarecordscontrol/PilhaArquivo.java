/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javarecordscontrol;

/**
 *
 * @author rulli
 */
import java.io.*;
import java.util.Stack;

public class PilhaArquivo {

    public static void salvarPilha(Stack<String> pilha, String JavaPilhaInterfaceGrafica) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(JavaPilhaInterfaceGrafica))) {
            outputStream.writeObject(pilha);
            System.out.println("Pilha salva com sucesso no arquivo: " + JavaPilhaInterfaceGrafica);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Stack<String> carregarPilha(String JavaPilhaInterfaceGrafica) {
        Stack<String> pilha = new Stack<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(JavaPilhaInterfaceGrafica))) {
            pilha = (Stack<String>) inputStream.readObject();
            System.out.println("Pilha carregada com sucesso do arquivo: " + JavaPilhaInterfaceGrafica);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return pilha;
    }

    public static void main(String[] args) {
        Stack<String> minhaPilha = new Stack<>();
        minhaPilha.push("Item 1");
        minhaPilha.push("Item 2");
        minhaPilha.push("Item 3");

        String JavaPilhaInterfaceGrafica = "pilha.dat";

        // Salvar pilha em um arquivo
        salvarPilha(minhaPilha, JavaPilhaInterfaceGrafica);

        // Carregar pilha do arquivo
        Stack<String> pilhaCarregada = carregarPilha(JavaPilhaInterfaceGrafica);

        // Exibir pilha carregada
        System.out.println("Conteúdo da pilha carregada:");
        while (!pilhaCarregada.isEmpty()) {
            System.out.println(pilhaCarregada.pop());
        }
    }
}

