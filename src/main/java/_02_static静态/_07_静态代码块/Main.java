package _02_static静态._07_静态代码块;

/**
 * ClassName:
 * Package: _02_static静态._07_静态代码块
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/11 21:11
 * @Version 1.0
 *
 * 静态代码块
 *      含义：
 *          被static修饰的代码块
 *      格式：
 *          static {
 *
 *          }
 *      目的：
 *          1.封装工具类，提高部分代码加载时机（暂不涉及）
 *          2.类和实例成员初始化的笔试题（暂不涉及）
 *          3.给静态常量进行初始化赋值操作（暂不涉及）
 *      注意：
 *          1.静态代码块随着类的加载而加载，而且只加载唯一的一次
 *          2.静态代码块中不可以使用非静态成员
 *          3.静态方法中不可以使用 this 和 super 关键字
 *          4.静态代码块中不允许有 return 语句
 *          5.静态代码块中不允许有异常抛出
 *          6.静态代码块中不允许有循环语句
 */
public class Main {
    public static void main(String[] args) {

    }
}
