package _05_extends._08_构造器的特点;

/**
 * ClassName:
 * Package: _05_extends._08_构造器的特点
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/18 22:41
 * @Version 1.0
 */
public class SubClass extends SuperClass {
    public SubClass() {
        //隐式代码
        super();
        System.out.println("子类的构造器");
    }
}
