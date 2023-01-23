/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sajana
 */
public class Heap {
    private int[] Heap;
    private int size;
    private int maxsize;
    public Heap(int maxsize)
    {
        this.maxsize = maxsize;
	this.size = 0;
	Heap = new int[this.maxsize];
    }        
    private int parent(int pos) { 
        return (pos - 1) / 2; 
    }     
    private int leftChild(int pos) {
        return (2 * pos) + 1;
    }        
    private int rightChild(int pos){
        return (2 * pos) + 2; 
    }        
    private boolean isLeaf(int pos)
    {
        if (pos > (size / 2) && pos <= size)
            return true;
        else
            return false;
    }        
    private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }        
    private int maxHeapify(int pos)
    {
        if (isLeaf(pos))
            return 0;

        if (Heap[pos] < Heap[leftChild(pos)] || Heap[pos] < Heap[rightChild(pos)]) {

            if (Heap[leftChild(pos)] > Heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            }
            else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
            return 1;
    }        
    public void insert(int element)
    {
        Heap[size] = element;

        int current = size;
        if(Heap[1]!=0)
        {
            while (Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
            }
        }
            size++;
    }
    public String printToDevelopper()
    {	
        String data="";
        for(int i=0;i<size/2;i++){
            data=data+"Parent Node : " + Heap[i] ;

            if(leftChild(i)<size && Heap[leftChild(i)]!=0)
                data=data+" Left Child Node: " + Heap[leftChild(i)];

            if(rightChild(i)<size && Heap[rightChild(i)]!=0)
                data=data+" Right Child Node: "+ Heap[rightChild(i)];

                data=data+"\n";
            }	
            return data;
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
    public int deleteRootNode()
    {
        int popped = Heap[0];
        Heap[0] = Heap[size--];
        maxHeapify(0);
        return popped;
    }
    public int deleteNode(int element)
    {
        int popped=0;
        for(int c=0;c<Heap.length;c++)
        {
            if(element==Heap[c])
            {
                popped = Heap[c];
                Heap[c] = Heap[size--];
                maxHeapify(c);
            }
        }
        return popped;
    }
}
