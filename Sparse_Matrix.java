/*
    Sparse Matrix 
    Given a matrix of size N x M, print whether it is a sparse matrix or not.
    Please note that if a matrix contains 0 in more than half of its cells, then it is called a sparse matrix.

Input Format
The first line of input contains N, M - the size of the matrix, 
followed by N lines each containing M integers - elements of the matrix.

Output Format
Print "Yes" if the given matrix is a sparse matrix, otherwise print "No".

Constraints
1 <= N, M <= 100
0 <= ar[i] <= 109

Example
Input
2 3
5 0 0
0 8 0

Output
Yes
 */

import java.io.*;
import java.util.*;

public class Sparse_Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int c=0;
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                if(a[i][j]==0) c++;
            }
        }
        if(c>((m*n)/2)) System.out.println("Yes");
        else    System.out.println("No");
    }
}