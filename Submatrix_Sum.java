/*
    Submatrix Sum 
    Given a matrix of size N x N and four integers (i, j, k, l), 
    calculate the sum of the sub-matrix from (i, j) to (k, l).

Input Format
The first line of input contains an integer N. 
Second line of input contains four integers i, j, k and l. 
It's followed by N lines each containing N integers - elements of the matrix.

Output Format
Print the sum of the sub-matrix from (i, j) to (k,l).

Constraints
1 <= N <= 100
0 <= i <= k < N
0 <= j <= l < N
1 <= ar[i][j] <= 100

Example
Input
3
1 1 2 2
1 2 3
4 5 6
7 8 9

Output
28

Explanation

Sum of elements from {1,1} to {2, 2} is (5+6+8+9) = 28.
 */

import java.io.*;
import java.util.*;

public class Submatrix_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();

        int a[][]=new int[n][n];
        for(int x=0;x<n;x++)
        {
            for(int y=0;y<n;y++)
            {
                a[x][y]=sc.nextInt();
            }
        }
        int sum=0;
        for(int x=i;x<=k;x++)
        {
            for(int y=j;y<=l;y++)
            {
                sum+=a[x][y];
            }
        }
        System.out.println(sum);
    }
}