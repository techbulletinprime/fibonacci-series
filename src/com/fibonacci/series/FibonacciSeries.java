package com.fibonacci.series;
public class FibonacciSeries {

    public static void printFibonacciSeries(int n){
        int first =0;
        int next=1;
        System.out.println(first);
        System.out.println(next);
        for(int i=2;i<=n-2;i++){
            int sum=first+next;
            System.out.println(sum);
            first=next;
            next=sum;
        }

    }

    public static int fib(int n){

        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }



    public static void
    main(String args[])
    {

        for(int i=0;i<=10;i++){
            System.out.println(fib(i));
        }

    }
}
