package exercise;

import java.lang.reflect.Array;
import java.util.Arrays;

/***
 * Bitte fuellen sie die folgenden Felder mit ihren Daten aus!
 *
 * Name: -
 * Vorname:  - 
 * Matrikelnummer:  -
 */
public class Exercise3 {
    static boolean SELECT_IS_IMPLEMENTED = true;
    static boolean SORT_SELECT_IS_IMPLEMENTED = true;

    // Implementieren Sie hier ihre Version des Algorithmus
    static int select(Integer[] numbers, int k) {
        quickSort(numbers,0,numbers.length-1,k);
        return numbers[k];
    }


    public static void quickSort(Integer numbers[], int untereS, int obenS, int k){
        int pivot = pivotSearch(numbers,untereS,obenS);
        if (k>pivot){
            quickSort(numbers,pivot+1,obenS,k);
        }else if (k<pivot){
            quickSort(numbers,untereS,pivot-1,k);
        }else {
            return;
        }


    }

    static int pivotSearch(Integer numbers[], int unterS, int obenS)
    {
        int pivot = numbers[obenS];
        int i = (unterS-1);
        int j = unterS;
        while (j<obenS) {
            if (numbers[j] <= pivot) {
                i++;
                swap(numbers,i,j);
            }
            j++;
        }
        swap1(numbers,i,j);
        return i+1;
    }


    public static void swap(Integer[] numbers, int i , int j){
        int help = numbers[i];
        numbers[i] = numbers[j];
        numbers[j]= help;

    }
    public static void swap1(Integer[] numbers, int i , int j){
        int help = numbers[i+1];
        numbers[i+1] = numbers[j];
        numbers[j]= help;

    }


    static int sortSelect(Integer[] numbers, int k) {
        Arrays.sort(numbers);
        return numbers[k];

        }

    // Ende der Implementierung
}
