import java.util.*;

public class LRUCache extends LinkedHashMap<Integer,Integer>{
    int capacity;
    public LRUCache(int capacity){
        super(capacity,0.75f,true); //access order : what is does? it moves the accessed node to the end of the list, so that the least recently used node is at the beginning of the list.
        this.capacity=capacity;
    }

    public int get(int key){
        return super.getOrDefault(key,-1);
    }

    public void put(int key,int value){
        super.put(key,value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest){         //how it removes the eldest entry? it checks if the size of the map is greater than the capacity, if it is, it removes the eldest entry.
        return size()>capacity;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); // returns 1
        cache.put(3, 3); // evicts key 2
        System.out.println(cache.get(2)); // returns -1 (not found)
        cache.put(4, 4); // evicts key 3
        System.out.println(cache.get(3)); // returns -1 (not found)
        System.out.println(cache.get(4)); // returns 4
    }
}