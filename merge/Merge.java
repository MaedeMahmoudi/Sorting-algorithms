public class Merge {

    private int a[];
    private int begin ;
    private int mid ;
    private int end ;

    public Merge(int[] a, int begin, int mid, int end) {
        this.a = a;
        this.begin = begin;
        this.mid = mid;
        this.end = end;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    /* Function to merge the subarrays of a[] */
    void merge()
    {
        int i, j, k;
        int n1 ;
       n1= getMid() - getBegin() + 1;
        int n2;
        n2 = getEnd() - getMid();

        int LeftArray[n1] ;
        int RightArray[n2]; //temporary arrays

        /* copy data to temp arrays */
        for (int i = 0; i < n1; i++)
            LeftArray[i] = a[begin + i];
        for (int j = 0; j < n2; j++)
            RightArray[j] = a[mid + 1 + j];

        /* initial index of first sub-array */
        i = 0;
        /* initial index of second sub-array */
        j = 0;
        /* initial index of merged sub-array */
        k = begin;

        while (i < n1 && j < n2)
        {
            if(LeftArray[i] <= RightArray[j])
            {
                a[k] = LeftArray[i];
                i++;
            }
            else
            {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<n1)
        {
            a[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j<n2)
        {
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }
}
