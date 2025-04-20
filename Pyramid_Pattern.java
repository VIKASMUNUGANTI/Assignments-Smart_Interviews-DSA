/*
    Pyramid Pattern
    Print pyramid pattern using '*'. See the example for more details.

Input Format
The first and only line of input contains a single integer N - the size of the pyramid.

Output Format
For the given integer, print the pyramid pattern.

Constraints
1 <= N <= 50

Example
Input 5
Output    
    *
   ***
  *****
 *******
*********
 */

import java.io.*;
import java.util.*;

public class Pyramid_Pattern {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=1;j<= 2*i-1;j++) System.out.print("*");
            System.out.println();
        }
    }
}