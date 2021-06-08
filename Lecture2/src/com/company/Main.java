package com.company;

//ArrayList

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //ArrayList<Integer> arr = new ArrayList<>();
        // {1,2,3,4,5,6,7,8,9}
        //for(int i = 1;i<=9;i++)
        //{
        //   arr.add(i);
        //}
        //System.out.println(arr);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(1, 7, 6, 13)));
        arr.add(new ArrayList<>(Arrays.asList(8, 2, 13, 14)));
        arr.add(new ArrayList<>(Arrays.asList(4, 5, 10, 15)));
        arr.add(new ArrayList<>(Arrays.asList(16, 12, 11, 9)));

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(0).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }

        Collections.sort(arr, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                if (o1.get(1) > o2.get(1)) {
                    return 1;
                } else if (o1.get(1) < o2.get(1)) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println("---------------------------------------------");

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(0).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }


//    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
//
//    //ArrayList<Integer> arr1 = fun(arr);
//    //System.out.println(arr+ " "+ arr1);
//
//    for(int i = 0;i<arr.size();i++)
//    {
//        System.out.print(arr.get(i)+" ");
//    }
//    System.out.println();
//    for(int element:arr)
//    {
//        System.out.print(element+" ");
//    }
//    }

        //   private static ArrayList<Integer> fun(ArrayList<Integer> arr) {
        //       ArrayList<Integer> newArr = (ArrayList<Integer>)arr.clone();
        //       newArr.remove(2);
        //      return newArr;
        //   }
    }
}
