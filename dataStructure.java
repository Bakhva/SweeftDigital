package com.example.dataStructure;
import java.util.*;

public class DS {
    ArrayList<Integer> myArr;
    HashMap<Integer, Integer>  hash; //hash, where keys are array elements and values - indexes

    // Constructor (creates arr[] and hash)
    public DS()
    {
        myArr = new ArrayList<Integer>();
        hash = new HashMap<Integer, Integer>();
    }
    void remove(int x) // remove function which proceeds in O(1) time
    {
        // Check if element is present
        Integer index = hash.get(x);
        if (index == null)
            return;

        // If present, then remove element from hash
        hash.remove(x);

        // Swap element with last element so that remove from
        // arr[] can be done in O(1) time
        int size = myArr.size();
        Integer last = myArr.get(size-1);
        Collections.swap(myArr, index,  size-1);

        // Remove last element (This is O(1))
        myArr.remove(size-1);

        // Update hash table for new index of last element
        hash.put(last, index);
    }
}
class Main {
    public static void main(String[] args) {
        DS ds = new DS();
        ds.remove(20);
    }
}
