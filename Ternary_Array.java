/*
    Ternary Array 
    Given an array A of size N, find the minimum cost to convert it to a ternary array B. 
    A ternary array can only have 0 or 1 or 2. After conversion, ensure that A[i] != B[i]. 
    The cost of converting A[i] to B[i] is | A[i] - B[i] |.

Input Format
The first line of input contains a single integer N - the size of the array and the second line contains array elements.

Output Format
Print the minimum cost to convert array A to B.

Constraints
1 <= N <= 10000
-100000 <= A[i] <= 100000

Example
Input
5
1 -1 2 0 5

Output
7

Explanation

Given A = {1, -1, 2, 0, 5} can be converted to B = {2, 0, 1, 1, 2}, 
with a cost of |1-2| + |-1-0| + |2-1| + |0-1| + |5-2| = 1 + 1 + 1 + 1 + 3 = 7.
 */



import java.io.*;
import java.util.*;

public class Ternary_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(a[i]==0 || a[i]==1) c[i]=a[i]+1;
            if(a[i]==2) c[i]=a[i]-1;
            if(a[i]>2)  c[i]=2;
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Math.abs(a[i]-c[i]);
        }
        System.out.println(sum);
    }
}