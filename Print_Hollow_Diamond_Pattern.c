/*
    Print Hollow Diamond Pattern 
    Print a hollow diamond pattern using '*'. See examples for more details.

Input Format
The first line of input contains T - the number of test cases. 
It is followed by T lines, each line contains a single odd integer N - the size of the diamond.

Output Format
For each test case, print the test case number as shown, 
followed by the diamond pattern, separated by a new line.

Constraints
1 <= T <= 100
3 <= N <= 201

Example
Input4
3
7
5
15

OutputCase #1:
 *
* *
 *
Case #2:
   *
  * *
 *   *
*     *
 *   *
  * *
   *
Case #3:
  *
 * *
*   *
 * *
  *
Case #4:
       *
      * *
     *   *
    *     *
   *       *
  *         *
 *           *
*             *
 *           *
  *         *
   *       *
    *     *
     *   *
      * *
       *
*/

#include <stdio.h>
#include <stdlib.h>

void Print_Hollow_Diamond_Pattern(int n,int t)
{
    printf("Case #%d:\n",t);

    for(int i=0;i<=n/2;i++)
    {
        for(int j=0;j<(n/2 -i);j++)
        {
            printf(" ");
        }
        if(i == 0)
        {
            printf("*\n");
        }
        else
        {
            printf("*");
            for(int j=0;j<(2*i-1);j++)
            {
                printf(" ");
            }
            printf("*\n");
        }
    }

    for(int i=n/2-1;i>=0;i--)
    {
        for(int j=0;j<(n/2 -i);j++)
        {
            printf(" ");
        }
        if(i == 0)
        {
            printf("*\n");
        }
        else
        {
            printf("*");
            for(int j=0;j<(2*i-1);j++)
            {
                printf(" ");
            }
            printf("*\n");
        }
    }
}
int main() {
    int t;
    scanf("%d",&t);
    for(int i=1;i<=t;i++)
    {
        int n;
        scanf("%d",&n);
        phd(n,i);
    }

        
    return 0;
}