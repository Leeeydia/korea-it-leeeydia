package org.example;

class Main {
    public static void main(String[] args) {

        boolean rs = Math.isEvenNumber(2);
        System.out.println(rs);
        // true

        rs = Math.isEvenNumber(3);
        System.out.println(rs);
        // false

        rs = Math.isEvenNumber(4);
        System.out.println(rs);
        // true

        rs = Math.isEvenNumber(5);
        System.out.println(rs);
        // false
+
    }
}

class Math {
    static boolean isEvenNumber(int num) {
        if(num==1){
            return false;

        }
        for (int i = 2; i <num; i++){
            if(num% i ==0){

            }
        }
        return true;
    }
}

// 어떤 수가 소수인지 아닌지 판별하는 법
// 1. 1은 소수가 아니다
// 2.