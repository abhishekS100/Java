class Stack {
    
    private int[] arr;
    private int capacity;
    private int top;
    
    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    
    public void push(int x){
        if(isFull()){
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }
        // System.out.println("Inserting : " + x);
        arr[++top] = x;
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            System.exit(1);
        }
        return arr[top--];
    }
    
    public int size(){
        return top + 1;
    }
    
    public Boolean isEmpty(){
        return top == -1;
    }
    
    public Boolean isFull(){
        return top == capacity - 1;
    }
    
    public void printStack(){
        for(int i = top; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println("STACK");
        
        Stack st = new Stack(5);
        
        st.push(5);
        st.push(2);
        st.push(8);
        st.push(1);
        
        System.out.println(st.isEmpty());

        st.printStack();
    }
}
