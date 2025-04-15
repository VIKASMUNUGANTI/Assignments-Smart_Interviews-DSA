
/*
 
    Alternate Seating 
    You are given an integer N, denoting the number of people who need to be seated,
    and a list of M seats, where 0 represents a vacant seat and 1 represents an already occupied seat.
    Find whether all N people can find a seat, provided that no two people can sit next to each other.

Input Format
The first line of the input contains N denoting the number of people. 
The second line of input contains M denoting the number of seats. 
The third line of input contains the seats.

Output Format
If all N people can find seats, print YES otherwise NO.

Constraints
1 ≤ N ≤ 105
1 ≤ M ≤ 105
Ai ∈ {0, 1}

Example
Input
2
7
0 0 1 0 0 0 1

Output
YES

Explanation

The two people can sit at index 0 and 4.
 
 */



import java.io.*;
import java.util.*;

public class Alternate_Seating {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            if(a[i]==0 && (i==0 || a[i-1]==0) && (i==n-1 || a[i+1]==0))
            {
                num--;
                a[i]=1;
            }
            if(num==0) break;
        }
        System.out.println(num==0 ? "YES" : "NO"); 

    }
}