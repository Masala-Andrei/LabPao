package Exercitiul_1;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Introduceti un numar intre 0 si 5 (inclusiv): ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while (n < 0 || 5 < n) {
            System.out.print("Numarul introdus este invalid, reincercati: ");
            n = input.nextInt();
        }

        int[] V = new int[n];
        System.out.print("Introduceti " + n + " numere (Daca introduceti mai multe, vor fi considerate doar primele " + n + " elemente): ");

        // Trebuie sa reinitializez scannerul dupa citire in caz ca se citesc mai multe numere (bcz vor ramane in buffer)
        for (int i = 0; i < n; i++)
            V[i] = input.nextInt();
        input = new Scanner(System.in);


        System.out.println("Input: " + Arrays.toString(V));
        reverse(V);
        System.out.println("Output: " + Arrays.toString(V));
    }

    private static void reverse(int[] array){
        int len = array.length, temp;
        for (int i = 0; i < len / 2; i++) {
            temp = array[i];
            array[i] = array[len - i - 1];
            array[len - i - 1] = temp;
        }
    }
}