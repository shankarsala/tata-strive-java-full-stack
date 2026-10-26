package yt_new.oop.v15.InnerClasses;

@FunctionalInterface
interface  B{
    int sum(int a, int b);
}


public class LambdaExpression {
    public static void main(String[] args) {
         B obj = (a,b) -> (a+b);


         int sum = obj.sum(2,4);
        System.out.println(sum);
    }
}
