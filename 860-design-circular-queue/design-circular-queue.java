class MyCircularQueue {
    public int front;
    public int rear;
    public int[] arr;

    public MyCircularQueue(int k) {
        front = -1;
        rear =-1;
        arr = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(isEmpty())
        {
            front++;
            rear++;
            arr[rear] = value;
            return true;
        }
        if(isFull())
        {
            return false;   
        }
        rear = (rear+1)%arr.length;
        arr[rear] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())
        {
            return false;
        }
        if(front == rear)
        {
            int temp = arr[rear];
            front = -1;
            rear = -1;
            return true;
        }
        front = (front+1)%arr.length;
        return true; 
    }
    
    public int Front() {
        
        if(isEmpty())
        {
            return -1;
        }
        
        return arr[front];   
    }
    
    public int Rear() {
        if(isEmpty())
        {
            return -1;
        }
        return arr[rear];
    }
    
    public boolean isEmpty() {
        if(front == -1)
        {
            return true;
        }
        return false;
        
    }
    
    public boolean isFull() {
        if(front == 0 && rear == arr.length-1)
        return true;
        else if(front == rear+1)
        return true;
        else
        return false; 
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */