package _02_static静态._01_static关键字;

/**
 * ClassName:
 * Package: _02_static关键字._01_static关键字
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/10 22:23
 * @Version 1.0
 *
 * static关键字
 *      含义：
 *          静态的，共享的
 *      修饰：
 *          成员变量，成员常量，成员方法，成员内部类，成员代码块
 *      特点：
 *          1. 被static修饰的成员，称为静态成员，不属于对象，而归属于类，会被该类创建的所有对象所共享
 *          2. 随着类的加载而加载，只加载一次，优先于对象加载
 *          5. 静态方法只能访问静态成员，不能访问非静态成员
 */
public class Main {
    public static void main(String[] args) {
        new Student();
        new Student();
    }
}
