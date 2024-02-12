package com.ohgiraffers.section05.logical;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표 논리연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다. */
        /* 필기.
        *   논리 연산자의 우선순위와 활용
        *   논리 & 연산자와 논리 | 연산자의 우선순위
        *   && : 11순위
        *   || : 12순위
        *   논리 && 연산자의 우선순위가 논리 || 연산자 우선순위 보다 높다.  (우선순위: && > ||)
        * */

        /* 목차. 1. 1부터 100 사이의 값인지 확인 */
        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : " + (num1 >= 1 && num1 <= 100));

        int num2 = 166;
        System.out.println("1부터 100 사이인지 확인 :" + (num2 >=1 && num2 <= 100));

        /* 목차. 2. 영어 대문자인지 확인 */
        char ch1 = 'G';
        int convertCharToInt = ch1;
        System.out.println(convertCharToInt);
        //중요!! 문자에서 형변환 자연스럽게 된다는~!!(아스키코드 숫자확인가능) 숫자 71 나와야함~!!

        int convertIntToChar = 100;
        char result = (char) convertIntToChar;
        System.out.println("result = " + result);
        // 문자로 가는 형변환 반대로, 큰거에서 작은걸로 가기때문에 명시해줘야함.(아스키코드 문자확인가능) d 나와야함..

        System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));

        char ch2 = 'g';
        System.out.println("영어 대문자인지 확인 : " + (ch2 >= 'A' && ch2 <+ 'Z'));


        /*목차. 3. 대소문자 상관없이 영문자 y인지 확인 */
        char ch3 = 'Y';
        System.out.println("영문자 y인지 확인 : " + (ch3 =='y' || ch3 == 'Y'));
        // 소문자 y 이거나 대문자 y인지 확인

        /* 목차. 4. 영문자인지 확인 */
        char ch5 = 'f';
        System.out.println("영문자인지 확인 : " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z')));
        //아스키코드 중간에 다른문자로 비어있어서 완벽한 조건으로 확인위해 소문자, 대문자 모두 입력하여 확인
        // 연산자의 우선순위로 인해 중간에 () 입력해줌

        char ch6 = 'F';
        System.out.println("영문자인지 확인: " + ((ch6 >= 'A' && ch6 <= 'Z') || (ch6 >='a' && ch6 <= 'z')));
        // 반대의 경우도 같음. 따라서 구해야할 값을 미리 지정하고, 만들어준다.

    }
}
