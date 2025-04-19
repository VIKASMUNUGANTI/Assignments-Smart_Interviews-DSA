/*
    Half Diamond with Numbers 

Given a value N, print a half diamond pattern with numbers. See examples for
more details.


Input Format
First and only line of input contains an integer N.


Output Format
Print the half diamond pattern using numbers.

Constraints
1 <= N <= 100

Example
Input
5 

Output
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
1 2 3 4 
1 2 3 
1 2 
1
 */

import java.io.*;
import java.util.*;

public class Half_Diamond_with_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j1=1;j1<=i;j1++)
            {
                System.out.print(j1+" ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
               System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}