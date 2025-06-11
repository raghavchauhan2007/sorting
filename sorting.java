public class sorting {

    public static void printArray(int arr[]){
        for(int a=0; a<arr.length; a++){
            System.out.print(arr[a]+" ");

        }
    }

    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2,10,-1};
        //insertion sort
        for(int i=1; i<arr.length; i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        printArray(arr);
    }
}