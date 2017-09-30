package com.example.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            This is a solution for HackerRank problem Dynamic Array.

            Create a list,seqList , of N empty sequences, where each sequence is indexed from 0 to N-1.
            The elements within each of the N sequences also use 0-indexing.

            Create an integer, lastAnswer, and initialize it to 0 .

            The two types of queries that can be performed on your list of sequences () are described below:
                Query 1 : 1 x y
                    Find the sequence, seqi , at index ((x^lastAnswer)%N) in seqList.
                    Append integer y to sequence seqi.
                Query 2 : 2 x y
                    Find the sequence, seqi, at index ((x^lastAnswer)%N) in seqList .
                    Find the value of element y % size in seqi(where size is the size of seqi ) and assign it to
                        lastAnswer.
                    Print the new value of lastAnswer on a new line

                    as shown below after 1st row next is 1 0 5 => Query 1, x=0, y=5


         */
/*
        Sample input
        2 5
        1 0 5   => query 1, x=0, y=5
        1 1 7
        1 0 3
        2 1 0   => query 2, x=1, y=0
        2 1 1
                the result is: 7 3
*/

        Scanner in = new Scanner(System.in);
        int numSeqN = in.nextInt();
        int numQueQ = in.nextInt();
        int type = 0, x = 0, y = 0, lastAnswer = 0, numSeqList = 0, result = 0;


        //Create a object ArrayList of a data type ArrayLists
        ArrayList<ArrayList<Integer>> seqList1 = new ArrayList<ArrayList<Integer>>(numSeqN);

        //Create new object ArrayList and add it to the main ArrayList seqList1
        for (int i = 0; i < numSeqN ; i++) {

            seqList1.add(new ArrayList<Integer>());
        }



        /*
            Query 1 : 1 x y
                Find the sequence, seqi , at index ((x^lastAnswer)%N) in seqList.
                Append integer y to sequence seqi.
            Query 2 : 2 x y
                Find the sequence, seqi, at index ((x^lastAnswer)%N) in seqList .
                Find the value of element y % size in seqi(where size is the size of seqi ) and assign it to
                    lastAnswer.
                Print the new value of lastAnswer on a new line
         */
        for (int i = 0; i < numQueQ; i++) {

            type = in.nextInt();
            x = in.nextInt();
            y = in.nextInt();

            numSeqList = (x^lastAnswer)%numSeqN;
            ArrayList<Integer> arr = seqList1.get(numSeqList);

            if (type == 1){
                arr.add(y);
            }
            if (type == 2){
                result = arr.get(y%arr.size());
                lastAnswer = result;
                System.out.println(result);
            }

        }

    }
}
