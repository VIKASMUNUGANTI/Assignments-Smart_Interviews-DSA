/*
    Implement Binary Search 
    Given a sorted array A of size N, along with an integer target K, 
    implement Binary Search to find the target K in the given array.

Input Format
The first line of input contains an integer N - the size of an array and target K. 
The second line contains the elements of the array.

Output Format
For each iteration of Binary Search, print the values of low, high, and mid. 
At the end, if the target K is found in the array, print "True" otherwise, print "False".

Constraints
1 <= N <= 20
1 <= A[i] <= 103

Example
Input 1
9 12
1 4 6 7 10 11 12 20 23

Output 1
0 8 4
5 8 6
True

Input 2
10 21
3 5 8 11 15 17 19 23 26 30

Output 2
0 9 4
5 9 7
5 6 5
6 6 6
False
 */



import java.io.*;
import java.util.*;

public class Implement_Binary_Search {

    public static void main(String[] args) {
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int p1=0;
        int p2=n-1;
        int c=0;
        while(p1<=p2){
            int mid=p1+(p2-p1)/2;
            System.out.println(p1+" "+p2+" "+mid);
            if(a[mid]==k) {
                c=1;
                break;
            }
            else if(a[mid]<k) p1=mid+1;
            else p2=mid-1;
        }
        System.out.println(c==1 ? "True" : "False");
    }
}