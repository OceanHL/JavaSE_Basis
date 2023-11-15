package _05_extends._10_this和super关键字的注意事项;

/**
 * ClassName:
 * Package: _05_extends._10_this和super关键字的注意事项
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/18 22:55
 * @Version 1.0
 */
public class SubClass extends SuperClass {
    public SubClass() {
        System.out.println("子类的构造器");
    }
    public void method() {
        //System.out.println(super);
        System.out.println(this);
    }
}
