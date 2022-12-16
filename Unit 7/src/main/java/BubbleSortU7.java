

public class BubbleSortU7 {
    static void sort(int arr[])
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < arr.length - 1; i++)
        {
            swapped = false;
            for (j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }
}