package com.gl.GA.SkyscraperArchitect;

import java.util.*;

public class SkyscraperArchitect 
	{
    public static void main(String[] args)
    	{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total no of floors in the building");
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int i = 1, maxTillNow = n;
        String[] res = new String[n];
        while(i<=n) 
        {
            System.out.println("enter the floor size given on day : " +i);
            int size = sc.nextInt();    
            stack.push(size);
            String s = "";
            while (!stack.isEmpty() && stack.peek() == maxTillNow) 
            {
                s += (stack.pop() + " ");
                maxTillNow--;
            }
            res[i-1] = s;
            i++;
        }
        sc.close();
        for (int j=0; j<n; j++) 
        {
            System.out.println("Day: " +(j+1));
            System.out.println(res[j]);
        }
    }
}