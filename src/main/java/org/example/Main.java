package org.example;
public class Main{
    public static void main( String[] args) {

        계산기.합( 10,  20);
        계산기.합( 30, 40);
        계산기.합( 40, 30);
        // 계산기.합(true,10) ..타입
        // 계산기.합(10,200,30); .. 개수
        // 계산기.합(10); .. 개수
    }
}
class 계산기{
    static void 합(int a, int b){
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println(a+b);
    }


    };

// 메소드 오버로딩