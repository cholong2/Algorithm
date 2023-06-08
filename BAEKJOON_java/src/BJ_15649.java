/*
백준 : 15649번 N과 M(1)
알고리즘 : 백트래킹
뮨제 : 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
- 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
입력 : 1 <= m <= n 8
시간 : 1초
start : 2023-06-04 16:00
end : 2023-06-04 16:55
 */

import java.io.*;
import java.util.*;

public class BJ_15649 {
    static int n, m;
    static boolean v[];
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void dfs (int depth)
    {
        if (depth == m){
            for (int var:arr){
                sb.append(var).append(" ");
            }
            sb.append('\n');
            return;
        }
        for (int i = 0 ; i < n ; i++){
            if (!v[i]){
                v[i] = true;
                arr[depth] = i+1;
                dfs(depth+1);
                v[i] = false;
            }
        }
    }
    public static void main (String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = new boolean[n];
        arr= new int[m];
        dfs(0); // 0은 depth
        System.out.println(sb.toString());
    }

}
























