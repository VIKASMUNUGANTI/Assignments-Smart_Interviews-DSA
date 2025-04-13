/*
    Max Min Partition 
    Given an array D of positive integers, 
    your goal is to divide D into two separate arrays, E and F,
    under the following conditions:
    Each element in array D must belong to either array E or array F
    Both arrays E and F are non-empty
    The objective is to minimize the partition's value, calculated as the 
    absolute difference between the maximum value of array E (denoted as max(E)) 
    and the minimum value of array F (denoted as min(F))
    
    Print the resulting integer that represents the value of this partition.

Input Format
The first line of input contains N. The second line of input contains an array of size N.

Output Format
Print the minimized partition value.

Constraints
2 ≤ N ≤ 104
1 ≤ Di ≤ 109

Example
Input
6
7 1 14 16 30 4

Output
2

Explanation

We can partition the array D into E = [7, 1, 14, 4] and F = [16, 30].
The maximum element of the array E is equal to 14.
The minimum element of the array F is equal to 16.
The value of the partition is |14 - 16| = 2. 
It can be proven that 2 is the minimum value out of all the partitions.
 */

 import java.io.*;
import java.util.*;

public class max_min_patition {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);

        int min_val= Integer.MAX_VALUE;

        for(int i=0;i<n-1;i++)
        {
            int max=a[i];
            int min=a[i+1];

            min_val=Math.min((Math.abs(max-min)),min_val);
        }

        System.out.println(min_val);
    }
}