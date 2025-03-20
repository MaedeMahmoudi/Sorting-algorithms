public class Main {
    public static void main(String[] args) {
        int a[] = {7, 14, 78, 47, 3, 54, 41, 65, 69}; // given array
        int val = 55; // value to be searched
        int n = a.length; // size of array
        Binary res = new Binary();
        res.binarySearch(a, 0, n-1, val); // Store result
        System.out.print("The elements of the array are: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Element to be searched is: " + val);
        if (res == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at " + res + " position of array");

    }
}