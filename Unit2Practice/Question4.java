class Question4{
    public static void main(){
        for(int a=1;a<=500;a++){
            for(int b=1;b<=500;b++){
                for(int c=1;c<=500;c++){
                    if((a*a+b*b==c*c) && (a+b+c==1000) && (a!=b) && (b!=c) && (a!=c) && (a<b)) System.out.println(a*b*c);
                }
            }
        }
    }
}