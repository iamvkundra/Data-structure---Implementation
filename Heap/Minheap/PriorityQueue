import java.util.ArrayList;
public class PriorityQueue<T> {

    private ArrayList<Element<T>> queue;
    public PriorityQueue(){
        this.queue = new ArrayList<>();
    }

    public void insert(T value, int priority){
        Element<T> element = new Element<>(value,priority);
        queue.add(element);

        int childindex = queue.size()-1;
        int parentindex = (childindex-1)/2;
        while(childindex >0) {
            if (queue.get(childindex).Priority < queue.get(parentindex).Priority) {
                Element temp = queue.get(childindex);
                queue.set(childindex, queue.get(parentindex));
                queue.set(parentindex, temp);
                childindex = parentindex;
                parentindex = (childindex-1)/2;
            } else {
                return;
            }
        }
    }
    public void insertMaxHeap(T value, int priority){

        Element<T> element = new Element<>(value,priority);
        queue.add(element);

    }
    public T getMin() throws PriorityException{
        if(isEmpty()){
            throw new PriorityException();
        }
        return queue.get(0).value;
    }
    public T removeMin() throws PriorityException{
        if(isEmpty()){
            throw new PriorityException();
        }
        Element<T> removed = queue.get(0);
        T ans = removed.value;
        queue.set(0, queue.get(queue.size()-1));
        queue.remove(queue.size()-1);

        int parentIndex=0;
        int leftchild = (2*parentIndex)+1;
        int rightchild = (2*parentIndex)+2;

        while (leftchild < queue.size()) {
            int minIndex = parentIndex;
            if (queue.get(leftchild).Priority < queue.get(minIndex).Priority) {
                minIndex = leftchild;
            }
            if (rightchild < queue.size() && queue.get(rightchild).Priority < queue.get(minIndex).Priority) {
                minIndex = rightchild;
            }
            if(minIndex == parentIndex){
                break;
            }
            Element<T> element = queue.get(minIndex);
            queue.set(minIndex, queue.get(parentIndex));
            queue.set(parentIndex, element);
            parentIndex = minIndex;
            leftchild = (2 * parentIndex) + 1;
            rightchild = (2 * parentIndex) + 2;
        }
        return (T) removed;
    }

    public int size(){ return queue.size(); }

    public boolean isEmpty(){
        if(size() == 0){ return true;
        }else{ return false; }
    }
}
