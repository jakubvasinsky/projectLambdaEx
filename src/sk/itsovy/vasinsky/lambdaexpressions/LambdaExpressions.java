package sk.itsovy.vasinsky.lambdaexpressions;

public class LambdaExpressions {


        int operation(int a, int b, MyInterface op){
          return op.myFunction(a,b);
        }
    interface MyInterface{
        int myFunction(int a, int b);
    }


    public static void main(String[] args) {
        LambdaExpressions lambdaExpression1 = new LambdaExpressions();
        MyInterface fAdd = (a,b) -> a+b;
        MyInterface fDiagonale = (a,b) ->(int) Math.sqrt(a*a + b*b);
        System.out.println(lambdaExpression1.operation(12,14,fAdd));
    }
}