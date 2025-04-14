/*

Merge Two Sorted Arrays 
You are given two sorted integer arrays A and B of size N and M respectively. 
Print the entire data in sorted order.

Input Format
First line of input contains N - the size of the array. 
The second line contains N integers - the elements of the first array. 
The third line contains M - the size of the second array. 
The fourth line contains M integers - the elements of the second array.

Output Format
For each test case, print the entire data in sorted order with each element separated by a space, on a new line.

Constraints
1 <= N <= 103
1 <= M <= 103
-105 <= A[i], B[i] <= 105

Example
Input
7
1 1 5 8 10 12 15
5
-1 2 4 5 7

Output
-1 1 1 2 4 5 5 7 8 10 12 15

*/

import java.io.*;
import java.util.*;

public class Merge_Two_Sorted_Arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        int p1=0;
        int p2=0;
        int p3=0;
        int c[]=new int[m+n];
        while(p1<n && p2<m)
        {
            if(a[p1]<=b[p2]) c[p3++]=a[p1++];
            else c[p3++]=b[p2++];
        }
        while(p1<n){
            c[p3++]=a[p1++];
        }
        while(p2<m)
        {
            c[p3++]=b[p2++];
        }
        for(int i=0;i<n+m;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}