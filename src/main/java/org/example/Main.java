package org.example;

// 문제 : 아래 코드가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        샤오미Tv a샤오미Tv = new 샤오미Tv();
        삼성Tv a삼성Tv = new 삼성Tv();
        LGTv aLGTv = new LGTv();

        a샤오미Tv.켜기("샤오미Tv");
        // 출력 => 샤오미Tv 켜집니다.
        a샤오미Tv.끄기("샤오미Tv");
        // 출력 => 샤오미Tv 꺼집니다.
        a샤오미Tv.vr켜기("샤오미Tv");
        // 출력 => 샤오미Tv vr켜기!

        a삼성Tv.켜기("삼성Tv");
        // 출력 => 삼성Tv 켜집니다.
        a삼성Tv.끄기("삼성Tv");
        // 출력 => 삼성Tv 꺼집니다.
        a삼성Tv.ar켜기("삼성Tv");
        // 출력 => 삼성Tv ar켜기!

        aLGTv.켜기("LGTv");
        // 출력 => LGTv 켜집니다.
        aLGTv.끄기("LGTv");
        // 출력 => LGTv 꺼집니다.
        aLGTv.게임모드전환("LGTv");
        // 출력 => LGTv 게임모드전환!
    }
}

class TV {
    void 켜기(String name) {
        System.out.println(name+"켜집니다.");
    }

    void 끄기(String name) {
    }
}


class 샤오미Tv extends TV {
    void vr켜기(String name) {
        System.out.println(name + "꺼집니다.");
    }
}

class 삼성Tv extends TV {
    void ar켜기(String name) {
        System.out.println(name + "ar켜기!");
    }
}

class LGTv extends TV {
    void 게임모드전환(String name) {
        System.out.println(name+"게임모드전환!");
    }
}