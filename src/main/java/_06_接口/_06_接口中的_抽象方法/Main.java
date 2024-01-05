package _06_接口._06_接口中的_抽象方法;

/**
 * ClassName:
 * Package: _06_接口._06_接口中的_抽象方法
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/15 21:04
 * @Version 1.0
 *
 * 接口中的抽象方法
 *      含义：
 *          声明在接口中的抽象方法
 *      格式：
 *          public abstract 返回值类型 方法名(参数列表);
 *      特点：
 *          1. public, abstract 这两个关键字缺少那个，JVM的编译器会在【编译时】自动补全
 *          2. 接口中抽象方法无需方法体
 */
public class Main {
    public static void main(String[] args) {
        final SubClass sc = new SubClass();
        sc.method();
    }
}
