package Exercitiul_2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int n, m, i;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti un numar n mai mare sau egal cu 5: ");

        n = input.nextInt();
        while (n < 5) {
            System.out.print("Numarul introdus este mai mic decat 5, reincercati: ");
            n = input.nextInt();
        }

        System.out.print("Introduceti un numar m mai mare sau egal cu 5 si diferit de " + n + " : ");
        m = input.nextInt();
        while (m < 5 || m == n) {
            if (m == n)
                System.out.print("Numarul introdus este egal cu " + n + ", reincercati: ");
            else
                System.out.print("Numarul introdus este mai mic ca 5, reincercati: ");
            m = input.nextInt();
        }

        int[] V1 = new int[n], V2 = new int[m], V3 = new int[n + m];

        System.out.print("Introduceti " + n + " elemente pentru primul vector (vor fi luate in considerare doar primele " + n + " elemente): ");
        // Trebuie sa reinitializez scannerul dupa citire in caz ca se citesc mai multe numere (bcz vor ramane in buffer)
        for (i = 0; i < n; i++)
            V1[i] = input.nextInt();
        input = new Scanner(System.in);

        System.out.print("Introduceti " + m + " elemente pentru al doilea vector (vor fi luate in considerare doar primele " + m + " elemente): ");
        for (i = 0; i < m; i++)
            V2[i] = input.nextInt();
        input = new Scanner(System.in);

        sortezVectorii(V1, V2);

        // (vector I, vector II, vector III, nr elem vector I, nr elem vector II)
        interclasare(V1, V2, V3, n, m);
    }

    private static int partitie(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;
        for (int j = left; j <= right - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        array[right] = array[i];
        array[i] = pivot;

        return i;
    }

    private static void qsort(int[] array, int left, int right) {
        if (right <= left) return;
        int pivot = partitie(array, left, right);
        qsort(array, left, pivot - 1);
        qsort(array, pivot + 1, right);
    }

    // Afisare frumoasa + executare sortare
    private static void sortezVectorii(int[] array1, int[] array2) {
        System.out.println("Array1 initial: " + Arrays.toString(array1));
        qsort(array1, 0, array1.length - 1);
        System.out.println("Array1 sortat crescator: " + Arrays.toString(array1));
        System.out.println("Array1 initial: " + Arrays.toString(array2));
        qsort(array2, 0, array2.length - 1);
        System.out.println("Array1 sortat crescator: " + Arrays.toString(array2));
    }

    private static void interclasare(int[] array1, int[] array2, int[] array3, int n, int m) {
        int i = 0, j = 0, k = 0;
        while (i < n && j < m){
            if (array1[i] < array2[j])
                array3[k++] = array1[i++];
            else
                array3[k++] = array2[j++];
        }

        while (i < n)
            array3[k++] = array1[i++];

        while (j < m)
            array3[k++] = array2[j++];

        System.out.println("Output: " + Arrays.toString(array3));
    }
}
