package chap5_2_String;

import java.util.Arrays;

public class test_StringClass {
    public static void main(String[] args) {

        // String 클래스는 값 변경시 새로운 객체를 생성함.
        String str1 = new String("안녕");
        String str2 = str1;
        str1 = "안녕하세요.";
        System.out.println(str1);
        System.out.println(str2);

        /* 배열은 객체의 값 자체가 수정 -> 참조 변수 복사 이후 하나의
        변수에서 수정하면 나머지 변수에도 적용. */
        int[] array1 = new int[] {3, 4, 5};
        int[] array2 = array1;
        array1[0] = 6; array1[1] = 7; array1[2] = 8;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }
}
