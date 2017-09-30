# HR_Dynamic_Array
Initial project HR - Dynamic Array - ArrayList of datatype ArrayLists

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

