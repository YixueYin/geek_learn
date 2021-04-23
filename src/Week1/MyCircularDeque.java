package Week1;

class MyCircularDeque {

    /** Initialize your data structure here. Set the size of the deque to be k. */
    //使用循环数组来实现
    //设置两个指针，front和rear
    //设置容量
    private int[] deque;
    private int rear;
    private int front;
    private int capacity;

    public MyCircularDeque(int k) {
        //此处浪费一个元素位置，非常巧妙
        //因为可以避免判定当前的队列空和满的条件重合
        this.deque = new int[k+1];
        this.front = 0;
        this.rear = 0;
        this.capacity = k+1;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(this.isFull()) {
            return false;
        }else {
            front = (front-1+capacity)%capacity;
            deque[front] = value;
            return true;
        }
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(this.isFull()) {
            return false;
        }else {
            deque[rear] = value;
            rear = (rear+1)%capacity;
            return true;
        }
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(this.isEmpty()){
            return false;
        }else {
            front = (front+1)%capacity;
            return true;
        }
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(this.isEmpty()) {
            return false;
        }else {
            rear = (rear-1+capacity)%capacity;
            return true;
        }
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if(this.isEmpty()) {
            return -1;
        }else {
            return deque[front];
        }
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if(this.isEmpty()) {
            return -1;
        }else {
            return deque[(rear-1+capacity)%capacity];
        }
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        if(front == rear) {
            return true;
        }else {
            return false;
        }
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if((rear + 1)%capacity == front) {
            return true;
        }else {
            return false;
        }
    }
}

/**
 * Your Week1.MyCircularDeque object will be instantiated and called as such:
 * Week1.MyCircularDeque obj = new Week1.MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */