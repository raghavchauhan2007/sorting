public class sorting {

    public static void conquer(int si, int mid, int ei, int[] arr) {
        int[] merged = new int [ei-si+1];
        int idx1 = si;//array1
        int idx2 = mid+1;//array2
        int x = 0;//mergedTracker

        while(idx1 <= mid && idx2 <= ei) {
            if(arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            }
            else {
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while(idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for(int i=0, j=si; i<merged.length; i++, j++) {
            arr[j] = merged[i];
        }


    }

    public static void divide(int si, int ei, int [] arr) {

        if(si>=ei) {
            return;
        }

        int mid = si + (ei-si)/2;
        divide(si, mid, arr);
        divide(mid+1, ei, arr);
        conquer(si, mid, ei, arr);
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        divide(0, n-1, arr);
        for(int i=0; i<n; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}