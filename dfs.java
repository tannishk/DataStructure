/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tannishk
 */
public class dfs {
    static boolean[] visited = new boolean[5];
    public static void main(String [] args)
    {
        int graph[][] = new int[5][5];
        graph[0][1]=1;graph[1][0]=1;
        graph[1][2]=1;graph[2][1]=1;
        graph[2][3]=1;graph[2][3]=1;
        graph[3][4]=1;graph[4][3]=1;
        graph[4][0]=1;graph[0][4]=1;
        graph[1][4]=1;graph[4][1]=1;
        graph[1][3]=1;graph[3][1]=1;
        DFS(graph);
        
    }
    static void DFS(int graph[][])
    {
        for(int i=0;i<5;i++)
        {
            visited[i]=false;
        }
        for(int i=0;i<5;i++)
        {
            if(!visited[i])
            {
                dfs(i);
            }
        }
    }
    static void dfs(int i)
    {
        visited[i] = true;
        System.out.println(i);
        for(int j=0;j<5;j++)
        {
            if(!visited[j])
            {
                dfs(j);
            }
        }
    }
}
