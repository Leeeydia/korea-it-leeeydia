// 문제 : 아래가 실행되도록 해주세요.
// 1. 배열 사용 X 버전
// 2. 배열 사용 버전
// 3. ArrayList 버전

package org.example;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {


        ArrayList<String> 사람 = new ArrayList<>();
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}

class 사람인력관리소 {
    int i;

    // 여기 void 왜 써 ? static 왜 안써? -> new 실행하면 되기 때문에
    void add사람(String 이름, int 나이) {
        //조립
        사람 a사람 = new 사람();
        a사람.번호 = this.i + 1;
        a사람.이름 = 이름;
        a사람.나이 = 나이;

        // 활용 (배열 사용 안 한 버전 추가 작성)


        System.out.println("나이가 " + a사람.나이 + "살인 " + a사람.번호 + "번째 사람(" + a사람.이름 + ")이 추가되었습니다.");
        a사람 = a사람;
        this.i=a사람.번호;

    }

    사람 get사람(int 번호) {
        return new 사람();
    }
}


class 사람 {
    int 번호;
    int 나이;
    String 이름;

    void 자기소개() {

    }
}


//System.out.println("나이가 " + 나이 + "살인 " + 3 + "번째 사람(" + 이름 + ")이 추가되었습니다.");