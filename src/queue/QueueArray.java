package queue;

public class QueueArray {
    int size, front, rear;
    int[] arr;

    QueueArray(int size) {
        this.size = size;
        arr = new int[size];
        front = rear = -1;
    }

    void enqueue(int data) {
        if(rear == size-1) {
            System.out.println("Queue is Full !");
        }else {
            rear++;
            arr[rear] = data;
        }
    }

    int dequeue() {
        int x = -1;
        if(front==rear) {
            System.out.println("Queue is Empty");
        }else {
            front++;
            x = arr[front];
        }
        return x;
    }

    void print() {
        for(int i=front+1; i<=rear; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
