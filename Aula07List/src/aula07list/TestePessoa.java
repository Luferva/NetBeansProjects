/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class TestePessoa {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        List<Pessoa> listaPessoas = new ArrayList<>();
        Pessoa pessoa = null;

        while (true) {
            System.out.println("Digite o seu nome (digite 1 para sair || 2 para remover || 3 listar: ");
            String nome = scann.next();
            if (nome.equals("1")) {
                System.out.println("Lista de Nomes Digitados");
                imprimirListaPessoa(listaPessoas);
                break;
            } else if (nome.equals("2")) {
                System.out.println("Digite o nome da pessoa que será removida:");
                nome = scann.next();
                for (Pessoa itemPessoa : listaPessoas) {
                    if (itemPessoa.getName().equals(nome)) {
                        System.out.println("Pessoa removida: " + itemPessoa.getName());
                        listaPessoas.remove(itemPessoa);
                        break;
                    }
                    System.out.println("Nome: " + itemPessoa.getName());
                }
            } else if (nome.equals("3")) {
                imprimirListaPessoa(listaPessoas);                
            } else {
                pessoa = new Pessoa();
                pessoa.setName(nome);
                listaPessoas.add(pessoa);
            }
        }
    }

    private static void imprimirListaPessoa(List<Pessoa> listaPessoas) {
        for (Pessoa itemPessoa : listaPessoas) {
            System.out.println("Nome: " + itemPessoa.getName());
        }
    }

}
