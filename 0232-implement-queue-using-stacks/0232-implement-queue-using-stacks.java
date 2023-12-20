class MyQueue { 
    Stack<Integer>first;
    Stack<Integer>second;
    public MyQueue() {
        first=new Stack<>();
        second=new Stack<>();
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        if(first.size() ==1){
            return first.pop();
        }
        int a= first.pop();
        int x= pop();
        first.push(a);

        return x;
        // while(first.size()>1)
        // {
        //     second.push(first.pop());
        // }
        // int x=first.pop();
        // while(!second.isEmpty())
        // {
        //     first.push(second.pop());
        // }
        // return x;
    }
    public int peek() {
        if(first.size() ==1){
            int a= first.peek();
            return a;
        }
        int a= first.pop();
        int x= peek();
        first.push(a);

        return x;
        // while(first.size()>1)
        // {
        //     second.push(first.pop());
        // }
        // int x=first.peek();
        // while(!second.isEmpty())
        // {
        //     first.push(second.pop());
        // }
        // return x;
    }
    
    public boolean empty() {
        if(first.isEmpty())
            return true;
        
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */