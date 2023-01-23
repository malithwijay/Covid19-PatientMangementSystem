/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Sajana
 */
public class minHeap {
    private int[] Heap;
    private int size;
    private int maxsize;
 

    private static final int FRONT = 1;
 

    public minHeap(int maxsize)
    {
 

        this.maxsize = maxsize;
        this.size = 0;
 
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }
 

    private int parent(int pos) { return pos / 2; }
 

    private int leftChild(int pos) { return (2 * pos); }
 

    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }
 

    private boolean isLeaf(int pos)
    {
 
        if (pos > (size / 2) && pos <= size) {
            return true;
        }
 
        return false;
    }

    private void swap(int fpos, int spos)
    {
 
        int tmp;
        tmp = Heap[fpos];
 
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }
 

    private void minHeapify(int pos)
    {
 

        if (!isLeaf(pos)) {
            if (Heap[pos] > Heap[leftChild(pos)]
                || Heap[pos] > Heap[rightChild(pos)]) {
 
                
                if (Heap[leftChild(pos)]
                    < Heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                }
 
               
                else {
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }
 

    // insert a node into the heap
    public void insert(int element)
    {
 
        if (size >= maxsize) {
            return;
        }
 
        Heap[++size] = element;
        int current = size;
 
        while (Heap[current] < Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }
 


    public void print()
    {
        for (int i = 1; i <= size / 2; i++) {
 
            System.out.print(
                " PARENT : " + Heap[i]
                + " LEFT CHILD : " + Heap[2 * i]
                + " RIGHT CHILD :" + Heap[2 * i + 1]);
 
            System.out.println();
        }
    }
 
    public int[] printView()
    {   
        int []data=new int[Heap.length];
        for(int c=0;c<Heap.length;c++)
        {
            if(Heap[c]!=0)
                data[c]=Heap[c];
            else
                break;
        }
        return data;
    }

    //remove and return the minimum

    public int remove()
    {
 
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        minHeapify(FRONT);
 
        return popped;
    }
}
