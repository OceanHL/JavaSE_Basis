package _07_内部类._03_练习;

/**
 * ClassName:
 * Package: _07_内部类._03_练习
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2024/1/3 22:00
 * @Version 1.0
 */
public class _01_练习1 {
    /**
     * 编写一个匿名内部类，它继承Object，并在匿名内部类中，声明一个方法 public void test()打印尚硅谷
     */
    public static void main(String[] args) {
        // 创建一个匿名内部类对象
        new Object() {
            public void test() {
                System.out.println("尚硅谷");
            }
        }.test();
    }
}
