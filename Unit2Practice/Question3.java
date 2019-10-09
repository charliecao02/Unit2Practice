class Question3{
    public static void main(){
        int sq=0, nat=0;
        for(int i=1;i<=100;i++){
            nat+=i;
            sq+=i*i;
        }
        System.out.println(Math.abs(sq-nat*nat));
    }
}