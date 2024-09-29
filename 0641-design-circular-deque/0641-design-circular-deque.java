class MyCircularDeque {
    int[] dq;
    int start;
    int end;
    int k;
    int capacity;
    public MyCircularDeque(int k) {
        dq = new int[k];
        this.k = k;
        this.start = 0;
        this.end = k-1;
        this.capacity = k;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;

        start = (start-1+dq.length)%dq.length;
        dq[start] = value;
        k--;
        return true;        
    }
    
    public boolean insertLast(int value) {
        if(isFull())    return false;
        end = (end+1)%dq.length;
        dq[end] = value;
        k--;
        return true;
    
    }    
    
    public boolean deleteFront() {

        if(isEmpty())   return false;
        start = (start+1)%dq.length;
        k++;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty())   return false;

        end = (end-1+dq.length)%dq.length;
        k++;
        return true;

    }
    
    public int getFront() {
        if(isEmpty())   return -1;
        return dq[start];
    }
    
    public int getRear() {
        if(isEmpty())   return -1;

        return dq[end];
    }
    
    public boolean isEmpty() {
        return k == capacity;
    }
    
    public boolean isFull() {
        return k == 0;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */