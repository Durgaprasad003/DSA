package Sorting_Techniques;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={2,3,1,6,5,8,4};
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int minimum=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minimum])
                {
                    minimum=j;
                }
            }
           int temp=arr[i];
            arr[i]=arr[minimum];
            arr[minimum]=temp;


        }
        System.out.println("sorted array is");
        for (int i : arr) {
            System.out.println(i);
            
        }
    }
}
