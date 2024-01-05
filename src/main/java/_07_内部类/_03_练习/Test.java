package _07_内部类._03_练习;

/**
 * ClassName:
 * Package: _07_内部类._03_练习
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2024/1/3 22:35
 * @Version 1.0
 */
public class Test {
    public Test() {
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        s2.a = 20;
        Test.Inner s3 = new Test.Inner();
        System.out.println(s3.a);
    }
    class Inner {
        public int a = 5;
    }
    public static void main(String[] args) {
        Test t = new Test(); // 5
        Inner r = t.new Inner();
        System.out.println(r.a); // 5
    }
}


