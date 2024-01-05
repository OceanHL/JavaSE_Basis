package _06_接口._07_接口中的_默认方法;

/**
 * ClassName:
 * Package: _06_接口._07_接口中的_默认方法
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/15 21:36
 * @Version 1.0
 *
 * 接口中的默认方法(JDK-8)
 *      含义：
 *          多个实现类中共同含有且不需要重写以默认方法形式存储在接口中的实例方法，以默认方法存储在接口中
 *      格式：
 *          public default 返回值类型 方法名(参数列表){}
 *      注意：
 *          public 可以省略不写，如果省略JVM的编译器会在编译时期自动补全
 */
public class Main {
    public static void main(String[] args) {
        final SubClass sc = new SubClass();
        sc.method();
    }
}
