class zeros {
    public static int countZeros(int n) {
        if(n == 0)
            return 0;
        if(n%10==0){
            return 1+ countZeros(n/10);
        }
        return countZeros(n/10);

    }
    public static void main(String args[]){
        int n=1204000;
        int zeros=countZeros(n);
        System.out.println(zeros);
       

    }
    
}
