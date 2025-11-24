package org.example;

// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.

class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격("브라이언", "칼");
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.재공격();
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.공격("필립", "창");
        // 필립이(가) 창(으)로 공격합니다.

        a전사.공격("마크", "지팡이");
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.
    }
}

class 전사 {
    // 데이터 오래 저장 지역변수보다는 전역변수 사용
    // 전역변수 사용
    String lastName;
    String lastWeapon;

    void 공격(String name, String weapon) {
        System.out.println(name + "이(가)" + weapon + "(으)로 공격합니다.");
        this.lastName = name;
        this.lastWeapon = weapon;
    }

    void 재공격() {
        System.out.println(this.lastName + "이(가)" + this.lastWeapon + "(으)로 공격합니다.");
    }
}


// 지역변수 전역변수







// 이전의 공격 방식
// 인스턴스 변수 복습
// this 복습 28강 복습