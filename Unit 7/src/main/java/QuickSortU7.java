

public class QuickSortU7 {
    static void swap(int[] array, int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for(int j = low; j <= high - 1; j++)
        {
            if (array[j] < pivot)
            {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return (i + 1);
    }

    static void sort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
        
            sort(array, pi + 1, high);
        }
    }
}