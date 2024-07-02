public class SelectionSort {

    public static void selectionSort(int arr[]) {
        for(int i = 0; i < arr.length - 1;i++) {
            int minIndex = i;
            for(int j = i + 1;j < arr.length;j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp  = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for(int i = 0;i <arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int arr[]  = {2,1,3};
        System.out.println("Mang truoc sap xep la:");
        printArr(arr);
        System.out.println("Mang khi sap xep la:");
        selectionSort(arr);
        printArr(arr);
    }
}

