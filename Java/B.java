package Java;

public class B {
    public static int x =0;
    public int y =5;
    public int temp = -5;
    public int sum = 2;
    public B(){
        y =temp + 3;
        sum = 3 + temp +2;
    }
    public B (B b){
        sum = b.sum;
        x =b.x;
        b.methodB(2, 3);
    }
    public void methodA(int m, int n){
        int x=2;
        y= y +m + (temp++);
        x=x+5+n;
        B.x=this.x + x;
        sum = sum + x + y;
        System.out.println(x+" "+y+" "+sum);
    }
    public void methodB(int m, int n){
        int y=0;
        y= y + this.y;
        x= this.y+2+temp;
        methodA(x,y);
        sum = sum + x + y;
        System.out.println(x+" "+y+" "+sum);
    }
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B(b1);
        b1.methodA(1, 2);
        b2.methodB(3,2 );
    }
}
