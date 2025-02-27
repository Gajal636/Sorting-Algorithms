import java.util.*;
class Sorting{
    //bubble sort
    public static void sortedArray(int arr[]){
        for(int i =0;i< arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]= { 2,3,6,9,5 };
        //outer loop
        for(int i = 0;i<arr.length-1;i++){
            //inner loop
            for(int j =0;j<arr.length-i-1;j++){
                //swap
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        sortedArray(arr);
    }
}
    

