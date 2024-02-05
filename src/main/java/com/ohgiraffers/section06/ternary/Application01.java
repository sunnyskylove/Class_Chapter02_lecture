package com.ohgiraffers.section06.ternary;

public class Application01 {
    public static void main(String[] args) {

        /*수업목표. 삼항 연산자에 대해 이해하고 활용할 수 있다.*/
        /* 필기.
        *   삼항 연산자.
        *   자바에서 유일하게 피연산자 항목이 3개인 연산자이다.
        *   항목이 3개이다.
        *   (조건식)? 참일때 사용하는 값1 : 거짓일 때 사용하는 값2
        *  = 참일때, 앞의 값으로 반환, 거짓일때 뒤의 값을 반환한다는 말이다.
        * */


        /* 목차. 1. 삼항연산 단독 사용 */
        int num1 = 10;
        int num2 = -10;

        String result1 = (num1 > 0)? "양수다." : "양수가 아니다.";
        String result2 = (num2 >0)? "양수다. " : "양수가 아니다.";
        System.out.println("result1 = " + result1);
        System.out.println("result2= " + result2);
        // 조건식 만들기; true면 앞의 값이 반환(result1),
        //              falase면 뒤의 값을 반환하는(result2) 예이다.


        /*목차. 2. 삼항연산자 중첩 사용 */

        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3> 0)? "양수다" :(num3 ==0) ? "0이다." : "음수다.";
        String result4 = (num4> 0)? "양수다" :(num4 ==0) ? "0이다." : "음수다.";
        String result5 = (num5> 0)? "양수다" :(num5 ==0) ? "0이다." : "음수다.";

        System.out.println("result3 =" + result3);
        System.out.println("result4 =" + result4);
        System.out.println("result5 =" + result5);

        //result4만 보자면, 앞에는 false므로 뒤에 있는 조건식에 다시 한번 조건식을 붙여서 확인.
        // 따라서 뒤의 식은 참이므로 0이다 가 나옴.


    }
}
