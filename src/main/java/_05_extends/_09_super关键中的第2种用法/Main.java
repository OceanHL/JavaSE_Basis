package _05_extends._09_super关键中的第2种用法;

/**
 * ClassName:
 * Package: _05_extends._09_super关键中的第2种用法
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/18 22:49
 * @Version 1.0
 *
 * 回顾this关键字的第二种用法：
 *      场景：
 *          子类的构造器中
 *      格式：
 *          this(实参);
 *      作用：
 *          调用本类中其它的构造器
 *      含义：
 *          当构造器无法初始化(认为操作)时，使用this(实参)调用本类其他构造器来完成对象成员的初始化操作
 *
 * super关键中的第二种用法
 *      场景：
 *          子类的构造器中
 *      格式：
 *          super();
 *      作用：
 *          调用父类中的构造器
 *      含义：
 *          创建子类对象时，先初始化父类成员，再初始化子类成员
 */
public class Main {
    public static void main(String[] args) {

    }
}
