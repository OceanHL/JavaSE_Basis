package _05_extends._08_构造器的特点;

/**
 * ClassName:
 * Package: _05_extends._08_构造器的特点
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/18 22:40
 * @Version 1.0
 *
 * 继承关系中构造器的特点
 *      1. 子类无法继承父类的构造器
 *      2. 子类构造器默认会调用父类的无参构造器
 *             - 当构造器没有super(实参)或this(实参)时，JVM的编译器会自动在构造器中填充一个super(),用来初始化父类成员
 *      3.
 */
public class Main {
    public static void main(String[] args) {
        final SubClass sc = new SubClass();
    }
}
