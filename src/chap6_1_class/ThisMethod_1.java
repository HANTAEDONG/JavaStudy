package chap6_1_class;

// 클래스의 정의
class L {
    L() {
        System.out.println("첫 번째 생성자");
    }
    L(int l) {
        this();
        System.out.println("두 번째 생성자");
    }
}

public class ThisMethod_1 {
    public static void main(String[] args) {
        // 객체 생성
        L l1 = new L();
        System.out.println();
        L l2 = new L(3);

    }
}
