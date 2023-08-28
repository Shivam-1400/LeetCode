class MyStack {
    Queue<Integer> qe;
    public MyStack() {
        qe= new LinkedList<>();
    }
    
    public void push(int x) {
        qe.add(x);
        for(int i=0; i< qe.size()-1; i++){
            qe.add(qe.peek());
            qe.poll();
        }
    }
    
    public int pop() {
        int top= qe.poll();
        return top;
    }
    
    public int top() {
        int top= qe.peek();
        return top;
    }
    
    public boolean empty() {
        return qe.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */