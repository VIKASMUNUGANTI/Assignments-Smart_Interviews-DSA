/*
    Number of Connected Components 
    Given an undirected graph, you have to find the number of connected components in the graph.

Input Format
The first line of input contains T - number of test cases. 
First line of each test case contains N - number of nodes and M - number of edges. 
It is followed by M lines, each contains a pair (u,v) - denoting an undirected edge between node u and node v.

Output Format
For each test case, print the number of connected components, separated by new line.

Constraints
1 <= T <= 1000
1 <= N <= 1000
0 <= M <= min(N*N, 1000)
1 <= u, v <= N

Example
Input
2
5 3
1 3
2 4
3 2
10 9
3 4
5 1
2 5
4 6
2 3
6 3
1 4
8 9
8 10

Output
2
3
 */

import java.io.*;
import java.util.*;

public class Number_of_Connected_Components {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
            for(int i=0;i<=n;i++)
            {
                graph.add(new ArrayList<>());
            }
            for(int j=0;j<m;j++)
            {
                int u=sc.nextInt();
                int v=sc.nextInt();
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
            int c=0;
            boolean visited[]=new boolean[n+1];
            for(int i=0;i<n+1;i++){
                if(!visited[i]){    
                    c++;
                    visited[i]=true;
                    bfs(graph,i,visited);
                }
            }
            System.out.println(c-1);
        }
    }

    public static boolean bfs(ArrayList<ArrayList<Integer>> graph,int s,boolean visited[])
    {
        Queue<Integer> q=new PriorityQueue<>();
        q.add(s);
        while(!q.isEmpty())
        {
            int u=q.poll();
            for(int v:graph.get(u))
            {
                if(!visited[v])
                {
                    q.add(v);
                    visited[v]=true;
                }
            }
        }
        return false;
    }
}