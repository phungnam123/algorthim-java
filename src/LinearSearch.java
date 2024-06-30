import  java.util.*;
public class LinearSearch {

    public static int linearSearch(int arr[],int target) {

        for(int i = 0;i < arr.length;i++) {
            if(arr[i] == target) {
                return  i;
            }
        }

        return - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,3,1,5,6};
        System.out.println("Nhap vi tri can tim:");
        int target = sc.nextInt();

        int result = linearSearch(arr,target);
        if(result != - 1) {
            System.out.println("Phan tu " + target + " duoc tim thay tai vi tri:" + result);
        }
        else {
            System.out.println("Khong tim thay " + target + " trong mang");
        }

    }
}
