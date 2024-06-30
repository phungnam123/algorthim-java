public class BubbleSort {

    // thuat toan sap xep noi bot
    public static void bubbleSort(int []arr) {
        for(int i = 0 ;i < arr.length;i++) {
            for(int j = 0;j < arr.length - i - 1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int a[] = {2,3,1,4,5,7,6,9,8};
        System.out.println("Mang ban dau:");
        printArr(a);
        System.out.println("Mang khi sap xep:");
        bubbleSort(a);
        printArr(a);
    }
}
