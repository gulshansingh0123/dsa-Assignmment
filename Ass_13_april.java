package Dsa22march;

public class Ass_13_april {
    public static void main(String[] args) {
        int[][] arr = new int[][] { {3, 4, 1, 8},
                {1, 4, 9, 11},
                {76, 34, 21, 1},
                {2, 1, 4, 5} };

        int t=4;

        maxelement(4, arr);

        System.out.println(searchMatrix(arr,t));


        int numRay[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };

        for (int i = 0; i < numRay.length; i++) {
            numRay[numRay[i] % numRay.length]= numRay[numRay[i] % numRay.length]+ numRay.length;
        }
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < numRay.length; i++) {
            if (numRay[i] >= numRay.length * 2) {
                System.out.println(i + " ");
            }
        }


    }


    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int l = 0;
        int r = row * col - 1;

        while(l <=r ){
            int mid = l + (r-l)/2;
            int val = matrix[mid/col][mid%col];
            if(val == target) return true;
            if(val > target){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }

        return false;
    }


    public static void maxelement(int no_of_rows, int[][] arr) {
        int i = 0;


        int max = 0;
        int[] result = new int[no_of_rows];
        while (i < no_of_rows) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            result[i] = max;
            max =0;
            i++;

        }
        printArray(result);

    }


    private static void printArray(int[] result) {
        for (int i =0; i<result.length;i++) {
            System.out.println(result[i]);
        }

    }
}
