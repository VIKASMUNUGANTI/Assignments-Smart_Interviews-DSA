/*
    Reverse Bits 
    Given a number, reverse the bits in the binary representation 
    (consider 32-bit unsigned data) of the number, and print the new number formed.

Input Format
The first line of input contains T - the number of test cases. Each of the next T lines contains a number integer N.

Output Format
For each test case, print the new number formed after reversing the bits, separated by a new line.

Constraints
1 <= T <= 100000
0 <= N <= 109

Example
Input
4
4
15
6
1000000000

Output
536870912
4026531840
1610612736
5462492

Explanation

Test-Case 1
Binary Representation of 4: 000...100
After reversing the bits: 001...000 (536870912)

Test-Case 2
Binary Representation of 15: 000...1111
After reversing the bits: 1111...000 (4026531840)
 */



import java.io.*;
import java.util.*;

public class Reverse_Bits {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            long n=Long.parseLong(br.readLine());
            long c=0;
            for(int i=0;i<32;i++)
            {
                c <<= 1;
                c |= (n&1);
                n >>= 1;
            }
            bw.write(c + "\n");
        }
        bw.flush();
    }
}