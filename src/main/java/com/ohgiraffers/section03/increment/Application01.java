package com.ohgiraffers.section03.increment;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 증감연산자에 대해 이해하고 활용할 수 있다.*/
        /* 필기.
        *   증감연산자
        *   - 피연산자의 앞 or 뒤에 사용이 가능하다.
        *   '++': 1증가의 의미
        *   '--': 1감소의 의미
        *   */

        int num = 20;
        System.out.println("num = " + num);

        num++;      // 1증가
        System.out.println("num = " + num);

        ++num;      // 1증가
        System.out.println("num = " + num);

        num--;      // 1감소
        System.out.println("num = " + num);

        --num;      // 1감소
        System.out.println("num = " + num);


        /* 목차. 2. 증감연산자를 다른 연산자와 함께 사용 */
        /* 필기.
        *   주의사항
        *   증감연산자는 다른 연산자와 함께 사용할 때 의미가 달라진다!!!!
        *   다른 연산자와 함께 사용할 때 증감 연산자의 의미
        *   '++num' : 피연산자의 값을 먼저 1을 증가시킨 후 다른 연산을 진행함. (+가 앞에 달렸으니 본인 먼저하고, 피연산자 나머지 계산)
        *   'num++' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 증가 시킨다. (+가 뒤에 달렸으니 피연산자 먼저 계산하고 나머지 본인게산)
        * */

        int firstNum = 20;

        int result1 = firstNum++ * 3;    //61이므로
        System.out.println("result1 = " + result1);     //result1 = 61
        System.out.println("firstNum = " + firstNum);  // firstNum = 21 (+만 붙은 본인만계산)
        // 정리!! 부호가 뒤에++ 붙어서, 뒤에 연산부터 계산하고 나머지가 계산되기 때문에
        // 1) 결과값은 뒤 연산인 3부터 곱해주는것이고,
        // 2) firstNum만 있다면 firstNum만 계산된 것임


        int secondNum = 10;
        int result2 = ++secondNum * 3;
        System.out.println("result2 = " + result2);        // 33  (+뒤에 붙었으므로, result2값은 피연산자 먼저 계산하고, 본인계산)
        System.out.println("secondNum = " + secondNum);    // 11  ( 본인만 계산)
        // (오류있어서 안되었지만) 앞에 연산이++이 붙으면,
        // 마찬가지로 전체결과값은 ++붙어있는 대상 계산하고 나머지 계산하기.

        int num1 = 10;
        int addNum = num1++;

        System.out.println("addNum = " + addNum);   // 10
        System.out.println("num1 =  " + num1);      // 11
        // 뒤++ 므로, addNum에서는 = 형식으로만 나오고,
        // 마지막 연산에서는 1가 더해져서 11이 된 것이다. (조금 헷갈림)

    }
}
