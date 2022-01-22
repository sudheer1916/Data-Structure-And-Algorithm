import java.util.HashMap;
//Difficult 
//LRU -> Least receantly used, the concept used by LRU is temporial locality 
//Miss :- if something is not there in the cache we call it miss
//Hit :- if we are accessing something which is already in the cache we call it hit
//method 1 (using array) T.C of hit=O(n),miss=O(n)
class CacheDesignLRU {
    class NodeC { 
        int key; 
        int value; 
        NodeC prev; 
        NodeC next; 
    
        public NodeC(int key, int value) 
        { 
            this.key = key; 
            this.value = value; 
        } 
        
    } 
    private HashMap<Integer,NodeC> map;
    private int capacity,count;
    private NodeC head,tail;

    public CacheDesignLRU(int capacity){    //capacity of cache
        this.capacity = capacity;
        map = new HashMap<>();
        head = new NodeC(0, 0);
        tail = new NodeC(0,0);
        head.prev = null;
        head.next = tail;
        tail.prev = head;
        tail.next = null;
        count = 0;
    }

    public void deleteNode(NodeC node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public void addToHead(NodeC node){
        node.next = head.next;
        node.next.prev = node;
        node.prev = head;
        head.next = node;
    }
    public int get(int key){
        if(map.get(key) != null){
            NodeC node = map.get(key);
            int result = node.value;
            deleteNode(node);
            addToHead(node);
            System.out.println("Got the value : " + result + " for the key: " + key);
            return result;
        }
        System.out.println("Did not get any value" + " for the key: " + key);
        return -1;
    }
    public void set(int key,int value){
        System.out.println("Going to set the (key, "+ "value) : (" + key + ", " + value + ")");
        //if the map contains mapping for the key
        if(map.get(key) != null){   
            NodeC node = map.get(key);
            node.value = value;
            deleteNode(node);
            addToHead(node);
        }else{
            NodeC node = new NodeC(key, value);
            map.put(key, node);
            if(count < capacity){      //checks if the cache is full or not
                count++;
                addToHead(node);
            }else{
                map.remove(tail.prev.key);
                deleteNode(tail.prev);
                addToHead(node);
            }
        }
    }
}
class CacheMain{
    public static void main(String[] args) {
        CacheDesignLRU cache = new CacheDesignLRU(2);
        //it will store a key (1) with value 10 in the cache.
        cache.set(1,10); 
        //it will store a key (2) with value 20 in the cache.   
        cache.set(2,20);
        System.out.println("value for the key: 1 is "+cache.get(1));    //returns 10

        // removing key 2 and store a key (3) with value 30 in the cache. 
		cache.set(3, 30); 

        System.out.println("Value for the key: 2 is " + cache.get(2)); // returns -1 (not found)

        // removing key 1 and store a key (4) with value 40 in the cache. 
		cache.set(4, 40);

        System.out.println("Value for the key: 1 is " + cache.get(1)); // returns -1 (not found) 
		System.out.println("Value for the key: 3 is " + cache.get(3)); // returns 30 
		System.out.println("Value for the key: 4 is " + cache.get(4)); // return 40 
        
    }
}
