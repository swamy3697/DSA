/***
PROBLEM 74 SEARCH A 2D MATRIX

DIFFICULTY MEDIUM
TOPIC ARRAY ,BINARY SEARCH 

QUESTIONS

You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.



Example 1:

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Example 2:

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false

Constraints:

*  m == matrix.length
*  n == matrix[i].length
*  1 <= m, n <= 100
*  -104 <= matrix[i][j], target <= 104

***/


//SOLUTION
//--------

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int oLeft=0;
        int oRight=matrix.length-1;
        while(oLeft<=oRight){
            int mid=oLeft+(oRight-oLeft)/2;
            if(matrix[mid][0]==target || target== matrix[ mid ] [ matrix[mid].length-1 ]){
                return true;
            }
            if(target>matrix[mid][0] && target< matrix[ mid ] [ matrix[mid].length-1 ] ){
                return binarySearch(matrix[mid],0,matrix[mid].length-2,target);
            }
            if(target<matrix[mid][0]){
                oRight=mid-1;
            }
            else{
                oLeft=mid+1;
            }
        }
        return false;

    }
    public boolean binarySearch(int[] mat,int l,int r,int t){
        while(l<=r){
            int m=l+(r-l)/2;
            if(t==mat[m]){
                return true;
            }
            if(t>mat[m]){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return false;
    }
}