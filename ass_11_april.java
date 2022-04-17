package Dsa22march;

public class ass_11_april {
    public static void main(String[] args) {


        int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };
        int m = arr1.length;
        int n = arr2.length;
        printUnion(arr1, arr2, m, n);


        int[] a = { 1, 2, 4, 5, 6 };
        System.out.println(findDisappearedNumbers(a));


        if (isSubset(arr1, arr2, m, n))
            System.out.print("arr2[] is "+ "subset of arr1[] ");
        else
            System.out.print("arr2[] is"+ "not a subset of arr1[]");

    }



    public static boolean isSubset(int arr1[],int arr2[],int m, int n)
    {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                if (arr2[i] == arr1[j])
                    break;

            if (j == m)
                return false;
        }


        return true;
    }
    public static int findDisappearedNumbers(int[] nums)
    {
        int n=nums.length;
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++)
            sum-=nums[i];
        return sum;
    }

    public static int printUnion(int arr1[], int arr2[], int m, int n)
    {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++] + " ");
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }


        while (i < m)
            System.out.print(arr1[i++] + " ");
        while (j < n)
            System.out.print(arr2[j++] + " ");

        return 0;
    }

}
