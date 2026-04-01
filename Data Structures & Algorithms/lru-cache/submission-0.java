class LRUCache {
    // Node for doubly linked list
    class Node {
        int key;
        int value;
        Node prev;
        Node next;
        
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
    private Map<Integer, Node> map;
    private int capacity;
    private Node head;  // Most recent
    private Node tail;  // Least recent
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        
        // Create dummy head and tail (makes operations easier)
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        
        // Get node and move to front (most recent)
        Node node = map.get(key);
        moveToFront(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            // Update existing node
            Node node = map.get(key);
            node.value = value;
            moveToFront(node);
        } else {
            // Create new node
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addToFront(newNode);
            
            // If over capacity, remove least recent (tail.prev)
            if (map.size() > capacity) {
                Node leastRecent = tail.prev;
                removeNode(leastRecent);
                map.remove(leastRecent.key);
            }
        }
    }
    
    // Helper: Add node right after head (most recent)
    private void addToFront(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
    
    // Helper: Remove node from anywhere in list
    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    // Helper: Move existing node to front
    private void moveToFront(Node node) {
        removeNode(node);
        addToFront(node);
    }
}