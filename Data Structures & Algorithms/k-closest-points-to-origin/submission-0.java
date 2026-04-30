class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
/*
dis = root(x2-x1)2+(y2-y1)2
dis = x2+y2

*/

PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> (b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1])); 

for(int i=0; i<points.length; i++){
    queue.offer(points[i]); 
    if(queue.size()>k){
       queue.poll(); 
    }

}

int[][] result = new int[k][2];
        
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();   // get closest points
        }

        return result;
    }
}
