package org.example;
class Main {
    public static void main(String[] args) {
        int 결과;

        결과 = 계산기.합(10, 20);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 30

        결과 = 계산기.합(30, 20);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 50

        결과 = 계산기.합(30, 70);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 100

        결과 = 계산기.차(30, 70);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : -40

        결과 = 계산기.곱(3, 7);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 21

    }
}

class 계산기{
    int 결과;
    static void 합(){}
    static void 차(){}
    static void 곱(){}
}



// 메소드 오버로딩