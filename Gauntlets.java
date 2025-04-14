/*
    Gauntlets 
    
    You have a collection of N gauntlets, each with a specific color represented by A[i].
    Your goal is to maximize the number of pairs by repeatedly pairing up gauntlets of the same color. 
    Determine the maximum number of pairs that can be formed.

Input Format
The first line of input contains an integer N. The second line of input contains an array of size N.

Output Format
For the given input, print a single line representing the answer.

Constraints
1 ≤ N ≤ 102
1 ≤ Ai ≤ 103

Example
Input
6
4 1 7 4 1 4

Output
2

Explanation

You can do the operation twice as follows.Choose two gauntlets with the color 1 and pair them.
Choose two gauntlets with the color 4 and pair them.Then, you will be left with one gauntlet 
with the color 4 and another with the color 7, so you can no longer do the operation. 
There is no way to do the operation three or more times, so you should print 2.
 */

 import java.io.*;
 import java.util.*;
 
 public class Gauntlets {
 
     public static void main(String[] args) {
 
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         Arrays.sort(a);
         int p1=0;
         int p2=1;
         int c=0;
         while(p1<n-1 && p2<n)
         {
             if(a[p1]==a[p2])
             {
                 p1=p2+1;
                 p2=p2+2;
                 c++;
             }
             else{
                 p1++;
                 p2++;
             }
         }
         System.out.println(c);
 
     }
 }
