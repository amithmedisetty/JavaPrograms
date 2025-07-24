package Polymorphism;
class Calculator{
    public int add(int a,int b) {
        return a+b;
    }
    public double add(double a, double b) {
        return a+b;
    }
    public int add(int... arr) {
        int sum=0;
        for(int num:arr)sum+=num;
        return sum;
    }
}
public class ComplietimeExample {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.add(10,20));
        System.out.println(c.add(10.5,11.6));
        System.out.println(c.add(1,2,3,4,5));
    }
}
