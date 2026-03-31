class MinStack {
    Stack<Pair> stack; 
    public MinStack() {
        stack = new Stack<>(); 
    }
    
    public void push(int val) {
        int min ;
        if(stack.isEmpty()){
            min = val; 
            stack.push(new Pair(val, min)); 
        }else{
Pair pair = stack.peek(); 
        min = pair.y; 
        if(val>min){
        stack.push(new Pair(val, min)); 
        }else{
            min = val; 
             stack.push(new Pair(val, min)); 
        }
        }
        
    }
    
    public void pop() {
        stack.pop(); 
    }
    
    public int top() {
           Pair pair = stack.peek();
          return pair.x; 
    }
    
    public int getMin() {
        Pair pair  = stack.peek();
        return pair.y;  
    }
}

class Pair {
    int x; 
    int y; 

    public Pair(int x , int y){
        this.x = x;
        this.y = y; 
    }
}