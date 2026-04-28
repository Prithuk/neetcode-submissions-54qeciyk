class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        // Default PriorityQueue in Java is a Min-Heap
        this.minHeap = new PriorityQueue<>();
        
        for (int x : nums) {
            add(x);
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        
        // If heap exceeds size k, remove the smallest element
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        
        // The root of the Min-Heap is the kth largest element
        return minHeap.peek();
    }
}