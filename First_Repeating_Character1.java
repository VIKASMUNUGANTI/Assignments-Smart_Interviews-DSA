/*
 
    First Repeating Character - 1 
    
    Given a string of characters, find the first repeating character.

Input Format
The first line of input contains T - the number of test cases. 
It's followed by T lines, each line contains a single string of characters.

Output Format
For each test case, print the first repeating character, 
separated by a new line. If there are none, print '.'.

Constraints
1 <= T <= 1000
'a' <= str[i] <= 'z'
1 <= len(str) <= 104

Example
Input
4
datastructures
algorithms
smartinterviews
hackerrank

Output
a
.
s
a
 
 */

import java.io.*;
import java.util.*;

public class First_Repeating_Character1{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            int n=s.length();
            int c=0;
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(s.charAt(i)==s.charAt(j)) 
                    {
                        System.out.println(s.charAt(i));
                        c=1;
                        break;
                    }
                    
                }
                if(c==1) break;
            }
            if(c!=1) System.out.println(".");
        }
    }
}