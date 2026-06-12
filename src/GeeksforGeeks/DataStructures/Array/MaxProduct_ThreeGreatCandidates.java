package GeeksforGeeks.DataStructures.Array;

// TASK: The hiring team aims to find 3 candidates who are great collectively.
// Each candidate has his or her ability expressed as an integer. 3 candidates
// are great collectively if the product of their abilities is maximum.
// Given the abilities of some candidates in an array, arr[], return the maximum
// collective ability from the pool of candidates.
// DIFFICULTY: EASY
// LINK: https://www.geeksforgeeks.org/problems/three-great-candidates0515/1
// INPUT: arr[] = [10, 3, 5, 6, 20]
// OUTPUT: 1200

public class MaxProduct_ThreeGreatCandidates {
    int maxProduct(int[] arr) {
        // code here
        int MIN_INT = Integer.MIN_VALUE;
        int firstLast = MIN_INT, secoundLast = MIN_INT, thirdLast = MIN_INT;
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        
        for(int n : arr) {
            
            if(n > firstLast) {
                thirdLast = secoundLast;
                secoundLast = firstLast;
                firstLast = n;
            }
            else if(n > secoundLast) {
                thirdLast = secoundLast;
                secoundLast = n;
            }
            else if(n > thirdLast) {
                thirdLast = n;
            }
            
            if(n < first) {
                second = first;
                first = n;
            } else if (n < second) {
                second = n;
            }
        }
        
        return Math.max(firstLast * secoundLast * thirdLast, 
            first * second * firstLast);
    }
}
