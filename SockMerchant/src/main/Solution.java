package main;

import java.util.*;
import java.util.HashMap;

public class Solution {

    private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        int n = in.nextInt();
        
        HashMap<Integer, Integer> inventory = new HashMap<Integer,Integer>();
        
        int matchingPairs = 0;
        
        for(int i=0; i < n; i++)
        {
            int color = in.nextInt();
            
            //This checks if we already have 1 sock of that color and if we do then we increment matchingPairs and set unmatched      
            //socks of that color back to 0
            if(inventory.containsKey(color) && inventory.get(color).equals(new Integer(1)))
            {
                inventory.put(color,0);
                matchingPairs++;
                continue;
            }
            inventory.put(color,1);
        }
        System.out.println(matchingPairs);
    }
}