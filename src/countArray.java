import java.util.Scanner;

public class countArray {
    public static int countArray(int arr[]){
        int size=arr.length;
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<size;i++){
            if(arr[i]==max){
                count++;
            }
        }
        return size-count;
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[3];
    for(int i=0;i<arr.length;i++){
        arr[i]= sc.nextInt();
    }
    int count=countArray(arr);
    System.out.println("count number"+count);
    }
}
