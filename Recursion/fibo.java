class fibo {
    public static int fibonacci(int n){
        if(n<=1)
        return n;
        else 
        return fibonacci(n-1) + fibonacci(n-2);
        
    }
    public static void main(String argg[]){
        int n = 10;
        System.out.println("Fibonacci series of " + n + " numbers:");
        for(int i=0; i<n; i++)
            System.out.print(fibonacci(i) + " ");
        
    }
    
}
