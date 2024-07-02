/**
 * LinearSearch
 */
public class LinearSearch {
 
    public static int Lsearch(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                
                return i;
            }

        }
        return -1;
    }
 public static void main(String[] args) {
    int arr[]={10,8,32,24,33,65,87,98,56,54,5,6,7,8};
    int key=56;
    int result=Lsearch(arr, key);
    if(result!=-1)
    {
        System.out.println(key+" is found at index of"+result);

    }
    else{
        System.out.println("element not found in the array");
    }
   
    // System.out.println(key+" is found at index of"+Lsearch(arr,key));
     
 }
}