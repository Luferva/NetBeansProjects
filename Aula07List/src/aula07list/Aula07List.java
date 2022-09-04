package aula07list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Aula07List {

    public static void main(String[] args) {

        List<Pessoa> listaPessoa1 = new ArrayList<>();
        List<Pessoa> listaPessoa2 = new ArrayList<>();

        List<String> listaString = new ArrayList<>();
        List<Integer> listaInteger = new LinkedList<>();

        if (listaPessoa2.isEmpty()) {
            System.out.println("Empty");
        }

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setName("João");
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setName("Pedro");
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setName("Paulo");

        listaPessoa1.add(pessoa1);
        listaPessoa1.add(pessoa2);
        listaPessoa1.add(pessoa3);

        System.out.println("Constains: " + listaPessoa1.contains(1));
        
        for (Pessoa itemPessoa : listaPessoa1) {
            if (itemPessoa.getName().contains("Pedro")) {
                System.out.println("FOR Pessoa: true - " + itemPessoa.getName());
            } else {
                System.out.println("FOR Pessoa: false - " + itemPessoa.getName());
            }
        }

        listaPessoa2.addAll(listaPessoa1);

        if (listaPessoa1.contains(pessoa1)) {
            System.out.println("True:" + pessoa1.getName());
        }

        for (int i = 0; i < 100; i++) {
            listaString.add("a" + i);
            listaInteger.add(i, i);
        }
        listaInteger.add(98, 98);

        for (String item : listaString) {
            System.out.println(item);
        }

        for (Integer item : listaInteger) {
            System.out.println(item);
        }

        for (Integer item : listaInteger) {
            if (item.equals(9)) {
                System.out.println("FOR: true");
            } else {
                System.out.println("FOR: false");
            }
        }

        System.out.println("Posição (50): " + listaString.get(50));

        System.out.println(listaInteger.contains(9));
    }

}
