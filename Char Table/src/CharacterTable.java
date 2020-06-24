/*Ioanna Zournatzi*/
//ASKISI 2. 
//import java.util.stream.Stream;
//import java.util.*;
//import java.util.Arrays;

import java.util.Random;
//import java.util.stream.Collectors;

public class CharacterTable {

    static char[] arr = new char[10]; // dilwsi neou pinaka, 10 thesewn
//Sunartisi pou gemizei ton pinaka me tuxaia kefalaia grammata A-Z
    //xrisi rand, kai casting

    public static void filltableRandomly(char[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (rand.nextInt(90 - 65) + 'A');
        }
        System.out.println(arr);

    }
//ektupwsi pinaka orizontiws, me ti voitheia mias for

    public static void printTableΗ(char[] arr) {

        for (char n : arr) {
            System.out.print(n);
        }
    }
//ektupwsh pinaka kathetws me ti voitheia mias for

    public static void printTableV(char[] arr) {

        for (char n : arr) {
            System.out.println(n);
        }
    }
//sunartisi pou kanei swap 2 metavlites, h opoia tha voithisei stin epomeni sunartisi

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
//sunartisi pou tha allazei tis 2 teleutaies metavlites metaksu tous,
    //kaloume ti sunartisi swap pou ftiaksame parapanw

    public static void swapValues(char[] arr) {

        System.out.println(arr[8]);
        System.out.println(arr[9]);

        swap(arr, 8, 9);

        System.out.print("New array, last two digits swapped positions: ");
        System.out.println(arr);

    }
//ektupwnoume ti deyteri parametro tou pinaka kai vriskoume oles tis theseis
    //tou pinaka pou vrisketai.

    public static int LocationChar(char[] arr, char k) {

        System.out.print("H deuterh parametros tou pinaka: ");
        System.out.println(arr[1]);
        k = arr[1];

        for (int b = 0; b < arr.length; b++) {
            if (arr[b] == k) {
                //System.out.println(arr[b]);
                System.out.println("H thesi tou pinaka pou vrisketai to stoixeio einai: " + (b + 1));
            }

        }

        return k;

    }
    //dimourgei enan tuxaio pinaka, dimiourgei enan kainourio
    //kai klwnopoiei ton prwto. 

    public static char[] cloneTable(char[] clonedarray) {

        filltableRandomly(arr);

        for (int i = 0; i < arr.length; i++) {
            clonedarray[i] = arr[i];

        }
        System.out.println(clonedarray);

        return clonedarray;

    }
    static char[] tmp = new char[10];

    static char[] a = new char[5];
    static char[] b = new char[5];
//gia ti sunartisi mergeTables dimiourgoume 2 pinakes 5 thesewn o kathenas
    //kai tous gemizoume me tuxaia grammata.
    //sti sunexeia, dimiourgoume enan trito pinaka, 10 thesewn
    //kai tou thetoume tis times tou a kai tou b. 

    public static char[] mergeTables(char[] a, char[] b) {

        char[] c = new char[a.length + b.length];
        int count = 0;
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (rand.nextInt(90 - 65) + 'A');
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = (char) (rand.nextInt(90 - 65) + 'A');
        }

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }

        for (int j = 0; j < b.length; j++) {
            c[count++] = b[j];
        }
        System.out.print("Array a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
        System.out.print("Array b: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Merged arrays: ");
        System.out.println(c);

        return c;

    }

    ///metatrepoume ton pinaka arr se string
    public static String ConvertToString(char[] arr) {

        String s = new String(arr);
        System.out.println(s);
        return s;

    }
//kanei ton pinaka se string, mporei na allaksoun oi times
    // pou metatrepontai se string apo ti main
    public static String ConvertToString(char[] arr, int a, int b) {
        
        String s = new String(arr, 2, 5);
        System.out.println(s);

        return s;

    }

}
