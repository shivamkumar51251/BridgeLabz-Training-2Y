package Arrays.Logical_Problems;

public class arraysrevers {
  public static void revers(int arr[],int a, int b)
  {   a=0;
      b= arr.length-1;
    while(a<b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        a++;
        b--;

}
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");

        }
    }

}
