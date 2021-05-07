package queue;

public class CircularQueue {
    int front, rear, size;
    int arr[];

    CircularQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = rear = 0;
    }

    void enqueue(int data) {
        if((rear+1)%size==front) {
            System.out.println("Queue is full");
        }else {
            rear = (rear+1)%size;
            arr[rear] = data;
        }
    }
    int dequeue() {
        int x = -1;
        if(front == rear) {
            System.out.println("Queue is Empty");
        }else {
            front = (front+1) % size;
            x = arr[front];
        }
        return x;
    }
    void print() {
        int i = front+1;
        do {
            System.out.print(arr[i]+" ");
            i=(i+1)%size;
        }while (i!=(rear+1)%size);
    }


}
