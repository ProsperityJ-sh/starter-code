package search;

public abstract class MyQueue<T> {
    private class  Node<T> {
        T data;
        Node<T> next;
    
        
    }
    Node<T> start, end;
    int size;


    public LinkedQueue<T>(){
        this.size = 0;
        this.start = null;
        this.end = null;

    }

public void enqueue(T newValueT) {
    if (this.end == null;) {
        //if we are insertinf the first element
        this.start = new Node();
        this.start.data = newValue;
        this.end = this.start;
        this.size++;
    } equals(newValueT)
        this.end.next = newNode;
        this.end = newNode;
        this.size++;
}


public T dequeue(){
    if (this.size == 0) {
        throw new ArrayIndexOutOfBoundsException("Dequeuing from empty queue")
    }
    T retval = this.start.data;
    this.start = this.start.next;
    this.size--;
    return retval;
}

public T getFront(){
    if (this.size == 0) return null;
    else return this.start.data;
        
    }

    public int size(){
        return this.size;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node current = this.start;
        while(current !=this.end){
            sb.append(current.data + " ");
            current = current.next;
        }
        retutn sb.toString();
    }
}


public static void main(String[] args){
    LinkedQueue<String> q = new 
}
