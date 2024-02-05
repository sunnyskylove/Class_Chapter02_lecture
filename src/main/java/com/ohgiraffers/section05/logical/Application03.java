package com.ohgiraffers.section05.logical;

public class Application03 {
    public static void main(String[] args) {

        /*수업목표. 논리연결연산자의 진리표에 대해 이해할 수 있다. */
        /* 필기.
            AND 연산과 OR 연산의 특징
            논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실행 안 함.
            논리식 || 논리식 : 앞의 결과가 true 이면 뒤를 실행 안함.
         */

        /*목차. 1. 논리식 && 논리식: 앞의 결과가 false이면 뒤를 실행 안 함.*/
        /* 필기.
        *   조건식 두 개가 모두 만족해야 true를 반환하지만, 앞에서 미리 false가 나오면
        *   뒤의 조건을 확인할 필요가 없어 false를 반환한다. (and연산자의 특징)
        *   따라서 연산 횟수를 줄이기 위해서는 && 연산의 경우 앞에 false가 나올 가능성이 높은
        *   편을 작성하는 것이 좋다.
        * */

        int num1 = 10;

        int result1 = (false && ++num1 > 0)? num1 : num1;
        // 첫번째가 true면 앞의 num1, false면 뒤의 num1로 가겠다는 말
        System.out.println("&& 실행 확인 : " + result1);
        // 어차피 &&앞이 false므로 뒤에 식을 연산 안하겠다는말이므로 +1(++num1)안하고 동작안하므로 그대로의 값이 나온다.
        // 뒤의 1더하는 ++num1 이하의 값은 무시되었다.
        // 따라서 &&앞이 false면 뒤에 식은 보지 않는다.

        /* 목차. 2. 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행하지 않는다. */
        /* 필기.
        *   조건식 둘 중 하나라도 true 를 반환하기 때문에 앞에서 미리 true 가
        *   나오게 되면 뒤의 조건을 확인할 필요 없이 true를 반환한다.
        *   따라서 연산 횟수를 줄이기 위해서는 || 연산의 경우 앞의 true가 나올 가능성이 높은
        *   조건을 작성하는 편이 좋다. (강제성은 아니고, 나중을 위해 좋다는 말이다.)
        * */

        int num2 = 10;

        int result2 =(true || ++num2 > 0)? num2 : num2;
        System.out.println(" 실행 확인 : " + result2);
        // || 앞이 true면 뒤에 볼것도 없기 때문에 연산 안하고 그대로 나온 것임

        int result3 =(false|| ++num2 > 0)? num2 : num2;
        System.out.println(" 실행 확인 : " + result3);
        //false를 넣었을때 실행되어, ++num2, 1이 더해져서 11이 나온것임












    }
}
