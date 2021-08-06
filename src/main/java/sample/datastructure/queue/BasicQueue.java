package sample.datastructure.queue;

public class BasicQueue<X> {
    private X[] data;
    private int front;
    private int end;

    public BasicQueue(){
        this(1000);
    }

    public BasicQueue(int size){
        this.front = -1;
        this.end = -1;
        data = (X[]) new Object[size];
    }

    public int size(){
        if(front == -1  && end == -1){
            return  0;
        }
        else{
            return  end- front + 1;
        }
    }

    public void enQueue(X item){
        //first see if the queue is full
        if((end+1) % data.length == front){
            throw new IllegalArgumentException("The Queue is full");
        }
        //otherwise check any item has been added to the queue yet
        else if (size() == 0){
            front++;
            end++;
            data[end] = item;
        }
        //otherwise add the item to the end of the queue
        else {
            end++;
            data[end] = item;
        }
    }

    public X deQueue(){
        X item = null;
        //if the queue is empty we can't dequeue anything
        if(size() == 0){
            throw new IllegalArgumentException("Can't Dequeue because the queue is empty ");
        }

        //otherwise if this is the last item on teh queue, the queue needs to get reset to empty
        else if(front == end ){
            item = data[front];
            front = -1;
            end = -1;
        }

        //otherwise grab the front of the queue, return it and odjust the front pointer
        else{
            item = data[front];
            data[front] = null;
            front++;
        }
        return  item;
    }
     public boolean contains(X item){
        boolean found = false;

        if(size() == 0){
            return found;
        }
        for(int i = front ; i < end ; i++){
            if(data[i]. equals(item)){
                found = true;
                break;
            }
        }
        return found;
     }

     public X access(int position){
        if(size() == 0 && position > size()){
            throw new IllegalArgumentException("No item in the queue or the position is greater than the queue size");
        }
        int trueIndex = 0;
        for(int i = front; i < end ; i++){
            if (trueIndex == position){
                return data[i];
            }
            trueIndex++;
        }
         throw  new IllegalArgumentException("Could not get queue  item at position : " + position);
     }


}
