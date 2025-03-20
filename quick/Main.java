public class Main {
    public static void main(String[] args) {
        int a[] = { 7, 14, 78, 47, 3, 54, 41, 65, 69 };
        int n = a.length;
        System.out.println("\nBefore sorting array elements are - ");
        Quick q1 = new Quick();
        q1.printArr(a, n);
        q1.quick(a, 0, n - 1);
        System.out.println("\nAfter sorting array elements are - ");
        q1.printArr(a, n);
        System.out.println();
    }
}
