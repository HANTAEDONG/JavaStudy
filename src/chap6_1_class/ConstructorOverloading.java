package chap6_1_class;

class G {
    G() {
        System.out.println("첫 번째 생성자");
    }
    G(int g) {
        System.out.println("두 번째 생성자");
    }
    G(int g, int h) {
        System.out.println("세 번째 생성자");
    }
}


public class ConstructorOverloading {
    public static void main(String[] args) {
        G g1 = new G();
        G g2 = new G(3);
        G g3 = new G(3, 5);
    }
}
