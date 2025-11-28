package org.example;

class Main {
    public static void main(String[] args) {
        int n = 5;

        // 왼쪽
//        for(int i=1; i<=n;i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //왼쪽 역삼각형
//        for (int i = n - 1; i >= 1; i--) {
//            for(int j=1 ; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 오른쪽
//        for(int i=1; i<=n; i++){
//            //공백
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            // *
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 오른쪽 역삼각형
//        for (int i = n - 1; i >= 1; i--) {
//            //공백
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 피라미드
//        for(int i=1; i<=n;i++){
//            //공백
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 역피라미드
//        for(int i= n-1; i>=1;i--){
//            // 공백
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            //* 찍기
//            for(int j=1; j<=2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 다이아몬드
        // 피라미드 / 역피라미드 붙이면 됨
        // 공백 - 별

        //피라미드
        for (int i = 1; i <= n; i++) {
            // 공백
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // 별
            for(int j=1; j<=2*i-1; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        // 역삼각형
        for(int i= n-1; i>=1; i--){
            // 공백
            for(int j=1; j<= n-i; j++){
                System.out.print(" ");
            }
            // 별
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

