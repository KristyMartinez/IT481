

import java.util.List;

//**Unit 7 Assignment**\\


public class Unit7 {
    public static void main(String[] args) {
        int[] set1 = grabNumbers(30);
        int[] set2 = grabNumbers(2000);
        int[] set3 = grabNumbers(40000);
        List<int[]> sets = List.of(set1, set2,set3);
        sets.forEach(x -> {
            quicksort_and_print(x);
            bubblesort_and_print(x);
        });
    }

    static void quicksort_and_print(int[] array) {
        long starttime = System.currentTimeMillis();
        QuickSortU7.sort(array, 0, array.length-1);
        long runtime = System.currentTimeMillis() - starttime;
        System.out.println("Runtime and Length for quicksort: " +array.length + ": " + runtime + "ms");
       System.out.println("");
    }

    static void bubblesort_and_print(int[] array) {
        long starttime = System.currentTimeMillis();
        QuickSortU7.sort(array, 0, array.length-1);
        long runtime = System.currentTimeMillis() - starttime;
        System.out.println("Runtime and Length for bubblesort: " +array.length + ": " + runtime + "ms");
    }

    public static int[] grabNumbers(int size) {
        int[] numbers = new int[size];
        int x = 0;
        GeneratorU7 numberGeneratorIterator = new GeneratorU7(size);
        while (numberGeneratorIterator.hasNext()) {
            numbers[x] = numberGeneratorIterator.next();
            x++;
        }
        return numbers;
    }
}
