class MinStack {
    Stack<Long> st= new Stack<>(); 
   long min; 
    public MinStack() {
      
    }
    
     public void push(int value) {
        long val = (long) value;
        if (st.isEmpty()) {
            min = val;
            st.push(val);
        } else {
            if (val < min) {
                st.push(2 * val - min);
                min = val;
            } else {
                st.push(val);
            }
        }
    }

    public void pop() {
        long poppedValue = st.pop();
        System.out.println("popped value is:" + poppedValue);
        if (poppedValue < min) {
            min = 2 * min - poppedValue;
        }
    }

    public int top() {
        long topValue = st.peek();
        if (topValue < min) {
            return (int) min;
        }
        return (int) topValue;
    }


    public int getMin() {
        return (int) min;
    }
}

