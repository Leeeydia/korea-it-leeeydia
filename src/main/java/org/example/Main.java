package org.example;

// 문제 1 : 자동차 설계도를 만들어주세요.

//class Main {
//    public static void main(String[] args) {
//
//        class Car{
//
//        }
//        System.out.println("Hello world!");
//    }
//}

// 문제 2 : 자동차 객체를 담을 변수를 만들어주세요.


// 문제 3 : 자동차 객체를 만들고 변수에 담아주세요.

//class Main {
//    public static void main(String[] args) {
//        자동차 a = new 자동차();
//
//}
//
//class 자동차 {
//
//}


//class Main {
//    public static void main(String[] args) {
//
//        자동차 a = new 자동차();
//
//        System.out.println(a.speed);
//
//        자동차 b = new 자동차();
//        System.out.println(b.speed);
//    }
//}
//
//class 자동차 {
//   int speed;
//} // Main 클래스와 동급으로 만들어야 함

public class Main {
    public static void main(String[] args) {
        사람 a = new 사람();
        a.age = 25;
        a.name = "김가을";
        a.isMarried= true;
        a.age++;
        a.introduce();
        System.out.println(a.age);


        사람 b = new 사람();

        b.age = 23;
        b.name = "이윤지";
        b.isMarried= false;
        b.introduce();

    }
}
// 인스턴스 설계도
    class 사람 {
    // 필드
    int age;
    String name;
    boolean isMarried = true;

    void introduce(){

        int age = this.age;
        String name = this.name;
        boolean isMarried = this.isMarried;


        // int age = this.age;
        System.out.println("introduce 실행 됨");
        System.out.println("안녕, 나는 25살 기혼, 김가을이야");
    }
}
 //메소드 실행 (함수 실행)
 //이름으로 부른다
// 생명주기 / scope
// this 는 생략도 가능함 ...
// 객체를 왜 쓰는가 ?  ?  = 편해서, 데이터를 주고 받기 위해서
// this = a와 연결된 객체(인스턴스) 의 introduce 메서도 안에서 같은 객체 내부의 필드
// (인스턴스 변수)에 접근해서 안에 있는 값을 가져와
// 그림이랑 매칭시키기 (아마도 25강)

//자바 this 활용법 찾아보기 !!!!!
//TCP class 다시 읽어보기 !!!!!! this와 this()
//프로그래머스 자바 입문 this 문제 풀어보기

//변수의 생명주기
// 변수의 라이프사이클
// 변수의 스코프 정리하기