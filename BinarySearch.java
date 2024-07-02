public class BinarySearch {
    public static int Binarysearch(int arr[],int low,int high,int key)
    {
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(arr[mid]==key)
                {
                    return mid;
                }
                else if(arr[mid]<key)
                {
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            return -1;
    }
    public static void main(String[] args) {
        // first the array should be in sorted manner
          int arr[]={1,2,3,4,5,6,7,8,9};
          int key=6;
          int low=0;
          int high=arr.length-1;
          int result=Binarysearch(arr, low, high, key);
          System.out.println("element found at index of"+result);
    }
}
