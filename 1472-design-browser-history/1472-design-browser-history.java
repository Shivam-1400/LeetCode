class BrowserHistory {
    Stack<String> back;
    Stack<String> forward;

    // O(1)
    public BrowserHistory(String homepage) {
        back = new Stack<>();
        forward = new Stack<>();
        back.push(homepage);
    }

    // O(1)
    public void visit(String url) {
        forward = new Stack<>();
        back.push(url);
    }

    // O(steps)
    public String back(int steps) {

        while (!back.isEmpty() && steps >= 1) {
            forward.push(back.pop());
            steps--;
        }
        if (back.isEmpty())
            back.push(forward.pop());

        return back.peek();
    }

    // O(steps)
    public String forward(int steps) {

        while (!forward.isEmpty() && steps >= 1) {
            back.push(forward.pop());
            steps--;
        }
        return back.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */