package GeeksforGeeks.DataStructures.Array;// User function Template for Java

// TASK: Given a non-negative number represented as an array of digits.
// The task is to add 1 to the number (increment the number represented by
// the digits by 1). The digits are stored such that the most significant
// digit is the first element of the array.
// DIFFICULTY: EASY
// LINK: https://www.geeksforgeeks.org/problems/adding-one2529/1
// INPUT: arr = [9, 9, 9]
// OUTPUT: [1, 0, 0, 0]

import java.util.Vector;

public class AddingOneToArray {
    // Function for adding one to the number represented by the array
    static Vector<Integer> addOne(int[] arr) {
        // code here
        Vector<Integer> v = new Vector<>(arr.length);
        int carry = 1;
        for(int i = arr.length - 1; i >= 0; i--) {
            
            int res = arr[i] + carry;
            int rem = res % 10;
            v.add(0, rem);
            
            carry = res / 10;
        }
        
        if(carry != 0) v.add(0, carry); 
        return v;
    }

    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        Vector<Integer> res = addOne(arr);
        for(int i : res) {
            System.out.print(i);
        }
    }
}