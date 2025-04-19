
/*
    Rope Selling 
    You are given a rope of length N units. The rope can be cut into different sizes 
    and each size has a selling price associated with it. Determine the maximum profit that 
    can be obtained by cutting the rope and selling its pieces.

Note:
1. The sizes will range from 1 to N and will be integers.
2. The sum of the pieces cut should be equal to N.

Input Format
The first line of input contains T - number of test cases. It is followed by 2T lines. 
The first line of each test case contains N - the size of the rope and the next line contains N integers - 
the selling prices of the segments of lengths from 1 to N.

Output Format
For each test case, print the maximum profit that can be obtained by selling the pieces, separated by a new line.

Constraints
30 points
1 <= N <= 20

70 points
1 <= N <= 103

General Constraints
1 <= T <= 100
1 <= ar[i] <= 105

Example
Input
2
5
2 4 11 6 7
8
3 4 6 7 1 8 9 21

Output
15
24

Explanation

Test Case 1:
Few possible partitions are:(1, 1, 1, 1, 1), profit = (2 + 2 + 2 + 2 + 2) = 10
(1, 1, 1, 2), profit = (2 + 2 + 2 + 4) = 10
(1, 1, 3), profit = (2 + 2 + 11) = 15
(1, 4), profit = (2 + 6) = 8
(5), profit = (7) = 7
(2, 3), profit = (4 + 11) = 15
(1, 2, 2), profit = (2 + 4 + 4) = 10
The maximum profit generated is 15.
 */

import java.io.*;
import java.util.*;

public class Rope_Selling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]= new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int dp[]=new int[n+1];
            dp[0]=0;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    dp[i]=Math.max(dp[i],a[j-1]+dp[i-j]);
                }
            }
            System.out.println(dp[n]);
        }
    }
}