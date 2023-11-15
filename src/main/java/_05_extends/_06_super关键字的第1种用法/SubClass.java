package _05_extends._06_super关键字的第1种用法;

/**
 * ClassName:
 * Package: _05_extends._06_super关键字._01_第一种用法
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/18 21:34
 * @Version 1.0
 */
public class SubClass extends SuperClass {
    int num = 20;

    public void method() {
        int num = 30;
        System.out.println(num); // 30
        System.out.println(this.num); // 20
        System.out.println(super.num); // 10
    }
}
