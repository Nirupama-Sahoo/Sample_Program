package sample.array;

public class BinarySearchSortedArray {
    public int binarySearch(int arr[], int key, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low)/ 2;
        if (arr[mid] == key) {
            return mid;
        } else if (key < arr[mid]) {
            return binarySearch(arr, key, low, mid - 1);
        } else {
           return binarySearch(arr, key, mid + 1, high);
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        BinarySearchSortedArray binarySearchSortedArray = new BinarySearchSortedArray();
        System.out.println("Key is found at position : "+ binarySearchSortedArray.binarySearch(arr,6,0, arr.length -1));

    }
}
