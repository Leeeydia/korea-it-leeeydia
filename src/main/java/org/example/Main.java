package org.example;

import java.awt.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String msg = greet("Jin"); /// 문자열만 담을 수 있는 변수 msg에 greet 함수 실행 결과를 넣는다.
        System.out.println(msg); /// Jin -> 인자
// greet() -> return 값인 "Hello" + Jin + "!" 출력

        Point point = createPoint(5, 10); /// Point 모양의 객체랑 연결 할 point 변수
        System.out.println("Point create at (" + point.x + ", " + point.y + ")");
// create() -> return 값 x,y 그대로 출력
/// new Point 5,10
        int[] evens = firstNEvenNumbers(5);
        System.out.println("first 5 even numbers : " + Arrays.toString(evens));
    }

    public static String greet(String name) {  /// 문자열 매개변수 1개 바든 greet 함수 선언
        return "Hello, " + name + "!";
    }


    public static Point createPoint(int x, int y) {
        return new Point(x, y);
    }

    public static int[] firstNEvenNumbers(int n) {
        int[] evenNumbers = new int[n];

        for (int i = 0, num = 2; i < n; i++, num += 2) {
            evenNumbers[i] = num;
        }
        return evenNumbers;
    }
}

// 2의 배수만큼 증가                   vb
