public class Quick {

    int partition (int a[], int start, int end)
    {
        int pivot = a[end]; // pivot element
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++)
        {
            // If current element is smaller than the pivot
            if (a[j] < pivot)
            {
                i++; // increment index of smaller element
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i+1];
        a[i+1] = a[end];
        a[end] = t;
        return (i + 1);
    }

    /* function to implement quick sort */
    void quick(int a[], int start, int end) /* a[] = array to be sorted, start = Starting index, end = Ending index */
    {
        if (start < end)
        {
            int p = partition(a, start, end);  //p is partitioning index
            quick(a, start, p - 1);
            quick(a, p + 1, end);
        }
    }

    /* function to print an array */
    void printArr(int a[], int n)
    {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}

