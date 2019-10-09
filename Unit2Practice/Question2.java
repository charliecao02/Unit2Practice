class Question2{
    public static void main(){
        int t1=1,t2=2,t3,sum=2;
        System.out.println(1);
        System.out.println(2);
        while(t1+t2<4000000){
            t3=t1+t2;
            System.out.println(t3);
            if(t3%2==0) sum+=t3;
            t1=t2;
            t2=t3;
        }
        System.out.println("Total: "+sum);
    }
}