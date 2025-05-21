class StockSpanner {
    private Deque<int[]> deque;

    public StockSpanner() {
        deque = new ArrayDeque<>();
    }
    
    public int next(int price) {
        int span = 1;
        while (!deque.isEmpty() && deque.peekLast()[0] <= price) {
            span += deque.pollLast()[1];
        }
        deque.addLast(new int[]{price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */