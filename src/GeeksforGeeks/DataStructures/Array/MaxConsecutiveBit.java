package GeeksforGeeks.DataStructures.Array;

// TASK: Given an array arr[] consisting of only 0’s and 1’s,
// return count of the maximum number of consecutive 1’s or 0’s present in the array.
// DIFFICULTY: EASY
// LINK: https://www.geeksforgeeks.org/problems/max-consecutive-one/1
// INPUT: arr[] = [0, 1, 0, 1, 1, 1, 1]
// OUTPUT: 4

public class MaxConsecutiveBit {

    private static int maxConsecBits(int[] arr) {
        // code here
        int oCount = 0, lCount = 0, maxCon = 0;
        
        for(int i : arr) {
            if(i == 0) {
                oCount++; 
                lCount = 0;
            }
            else {
                oCount = 0; 
                lCount++;
            }
            
            int newMax = Math.max(oCount, lCount);
            if(newMax > maxCon) {
                maxCon = newMax;
            }
        }
        
        return maxCon;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 1, 1};
        System.out.println("Input: ");
        display(arr);

        int output = maxConsecBits(arr);
        System.out.println("Output: "+output);
    }

    public static void display(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}
