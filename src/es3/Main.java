package es3;

import java.util.HashMap;

public class Main {
    private static HashMap<String, String> rubricaTelefonica = new HashMap<>();

    static void main(String[] args) {
        aggiungiContatto("Consuelo", "12345");
        aggiungiContatto("Arturo", "12346");
        aggiungiContatto("Alfio", "12546");
        System.out.println(rubricaTelefonica);

        cancellaContatto("Alfio");
        System.out.println(rubricaTelefonica);

        cercaContatto("12345");
        System.out.println(rubricaTelefonica);

        trovaNumeroDaNome("Consuelo");
        System.out.println(rubricaTelefonica);

        stampaRubrica();
    }

    private static void aggiungiContatto(String nome, String telefono) {
        rubricaTelefonica.put(nome, telefono);
    }

    private static void cancellaContatto(String nome) {
        rubricaTelefonica.remove(nome);
    }

    private static void cercaContatto(String telefono) {
        String ricerca = "";
        for (String nome : rubricaTelefonica.keySet()) {
            if (telefono.equals(rubricaTelefonica.get(nome))) {
                ricerca = nome;
            }
            System.out.println(ricerca);
        }
    }

    private static void trovaNumeroDaNome(String nome) {
        String numero = rubricaTelefonica.get(nome);
        System.out.println(numero);
    }

    private static void stampaRubrica() {
        for (String nome : rubricaTelefonica.keySet()) {
            System.out.println(nome + rubricaTelefonica.get(nome));
        }


    }
}
