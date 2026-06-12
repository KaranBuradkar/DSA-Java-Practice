package GeeksforGeeks.DataStructures.Array;

// TASK: You are given an array arr[] of non-negative integers.
// You have to move all the zeros in the array to the right end
// while maintaining the relative order of the non-zero elements.
// The operation must be performed in place, meaning you should
// not use extra space for another array.
// DIFFICULTY: EASY
// LINK: https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1
// INPUT: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
// OUTPUT: [1, 2, 4, 3, 5, 0, 0, 0]

public class MoveAllZeroesToEnd {

    static void pushZerosToEnd(int[] arr) {
        
        // code here
        int slow = 0, fast = 1, n = arr.length - 1;
        if(n == 0) return;
        
        while(fast <= n) {
            
            if(arr[fast] == 0) fast++;
            else if(arr[slow] != 0) {
                slow++;
                if(slow >= fast) {
                    fast = slow + 1;
                }
            }
            else if(arr[slow] == 0 && arr[fast] != 0) {
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
                
                slow++;
                fast++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println("Input: ");
        display(arr);

        pushZerosToEnd(arr);

        System.out.println("Output: ");
        display(arr);
    }

    public static void display(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}