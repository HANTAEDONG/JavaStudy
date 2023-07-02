package chap5_2_String;

public class CreateStringObject {
    public static void main(String[] args) {
        // String 객체 생성 1
        String str1 = new String("안녕");
        System.out.println(str1);

        // String 객체 생성 2
        String str2 = "안녕하세요.";
        System.out.println(str2);

        String str3 = new String("잘가.");
        String str4 = str3;
        str3 = "안녕히가세요";
        System.out.println(str3);
        System.out.println(str4);
    }
}
