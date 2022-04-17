package Dsa22march;
import java.util.Arrays;

public class ass_12_april {
    static int arr[] = new int[]{1, 2, 3, 4, 5};


    public static void rotate()
    {
        int i = 0, j = arr.length - 1;
        while(i != j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }



    public static int searchInsert(int[] a , int target)
    {
        int n = a.length;
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] >= target)
                return i;
        }
        return n;
    }




    //*****************************************************************
    public static void main(String[] args) {

        System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));

        rotate();

        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(arr));


        int a[] = {1 , 3 , 5 , 7 , 9} , target = 8;
        System.out.println(searchInsert(a , target));

    }

}
