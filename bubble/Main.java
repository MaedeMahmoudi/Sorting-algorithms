public class Main {
    public static void main(String[] args) {
        int a[] = {7, 14, 78, 47, 3, 54, 41, 65, 69};
        Bubble b1 = new Bubble();
        System.out.println("Before sorting array elements are - ");
        b1.print(a);
        b1.bubbleSort(a);
        System.out.println();
        System.out.println("After sorting array elements are - ");
        b1.print(a);

    }
}