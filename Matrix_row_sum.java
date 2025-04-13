/*Matrix Row Sum 
Given a matrix of size N x M, print row-wise sum, separated by a newline.

Note: 
 Try to solve this without declaring / storing the matrix.  Input Format
The first line of input contains N, M - the size of the matrix, followed by N lines each containing M integers - elements of the matrix.

Output Format
Print the row-wise sum of the matrix, separated by a newline.

Constraints
1 <= N, M <= 100
-100 <= ar[i] <= 100

Example
Input
2 3
5 -1 3
19 8 -5

Output
7
22*/


import java.io.*;
import java.util.*;

public class Matrix_row_sum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int a[][]=new int[n][m];

        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=sc.nextInt();
            }
            System.out.println(sum);
        }
    
    }
}


/*
         PYTHON CODE

n,m=map(int,input().split())
for _ in range(n):
    row=sum(map(int,input().split()))
    print(row)
        
 */