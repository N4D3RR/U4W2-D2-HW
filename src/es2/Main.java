package es2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    //1
    static ArrayList<Integer> generaLista(int N) {

        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            lista.add(random.nextInt(101));
        }
        Collections.sort(lista);
        return lista;
    }

    //2
    static ArrayList<Integer> generaListaInvertita(ArrayList<Integer> lista) {
        ArrayList<Integer> nuovaLista = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            nuovaLista.add(lista.get(i));
        }
        return nuovaLista;

    }
    //3


    static void main(String[] args) {
        int N = 5;
//1
        ArrayList<Integer> lista = Main.generaLista(N);
        System.out.println(lista);

//2
        ArrayList<Integer> nuovaLista = Main.generaListaInvertita(lista);
        System.out.println(lista);
        System.out.print(lista.reversed());


    }
}
