package com.company;

import java.util.*;

public class hashMap {

    public static void main(String[] args)
   {
       //HashMap<Integer,Integer> map = new HashMap<>();
//       map.put(1000,7);
//       map.put(256565,14);
//       map.put(3334454,21);
//       map.put(484848,28);
//       System.out.println(map.keySet());
//       //Keys and values present in the HashMap
//       for(int i:map.keySet())
//       {
//           System.out.println("Key: "+ i+ " Value: " + map.get(i));
//       }
//       //Check whether key present or not
       System.out.println(minimumDifference(new ArrayList<>(Arrays.asList(3,2,3,2,4,5,6,8)),5));
//       System.out.println(map.containsKey(10000));
//       System.out.println(map.containsKey(1000));
       //3,2,3,2,4,5,6,7 ===> {3->2,2->2,4->1,5->1,6->1,7->1}

   }
    public static int minimumDifference(ArrayList<Integer> A,int B)
    {   HashMap<Integer,Integer> map = new HashMap<>(); //val of A,Frequency
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int val : A)
        {   min = Math.min(val,min);
            max = Math.max(val,max);
            if(map.containsKey(val))
            {
                map.put(val,map.get(val)+1);
            }
            else
            {
                map.put(val,1);
            }
        }
        while(B>0)
        {
            int minValCount = map.get(min);
            int maxValCount = map.get(max);
            B--;
        }
     return 0;
    }
}
