package es1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digita il numero di elementi da inserire ");
        int n = Integer.parseInt(sc.nextLine());

        HashSet<String> paroleDistinte = new HashSet<>();
        HashSet<String> paroleDuplicate = new HashSet<>();

        for (int i = 0; i < n; i++) {
            System.out.println("digita la parola " + (i + 1) + " da inserire");
            String parola = sc.nextLine();

            if (paroleDistinte.contains(parola)) {
                paroleDuplicate.add(parola);
            } else {
                paroleDistinte.add(parola);


            }
        }
        System.out.println("Parole duplicate: " + paroleDuplicate);
        System.out.println("Numero parole distinte: " + paroleDistinte.size());
        System.out.println("Parole distinte: " + paroleDistinte);
    }
}