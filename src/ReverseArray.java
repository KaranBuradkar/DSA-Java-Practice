
// TASK: You are given an array of integers arr[]. You have to reverse the given array.
// DIFFICULTY: EASY
// LINK: https://www.geeksforgeeks.org/problems/reverse-an-array/1
public class ReverseArray {
    public void reverseArray(int[] arr) {
        // code here
        int rep = arr.length / 2;
        int n = arr.length - 1;
        for (int i = 0; i < rep; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;
        }
    }
}