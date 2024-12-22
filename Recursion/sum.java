class sum {
    public static int sumofNumber(int n){
        if(n==0){
            return 0;

        }
        else{
            return (n%10) * sumofNumber(n/10);
        }
    }
    public static void main(String args[]){
        int n=1234;
        int result=sumofNumber(n);
        System.out.println(result);

    }
    
}
