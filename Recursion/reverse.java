class reverse {
    public static int reversenum(int n, int reversed){
        if(n==0){
            return reversed;
        }
        return reversenum(n/10, reversed*10+(n%10)); 
    }
    public static void main(String args[]){
        int n=1234;
        int reversednumber=reversenum(n,0);
        System.out.println(reversednumber);

    }

    
}
