/*
    Filled Rectangle 
    Given N and M, print the following rectangle pattern of size N × M. See examples for more details.

Input Format
The first line of input contains N and M.

Output Format
Print the rectangle pattern.

Constraints
1 <= N <= 10
1 <= M <= 10

Example
Input
3 5

Output
*****
*****
*****
 */

import java.io.*;
import java.util.*;

public class Filled_Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}