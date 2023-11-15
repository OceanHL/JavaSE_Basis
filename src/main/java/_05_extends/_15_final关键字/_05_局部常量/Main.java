package _05_extends._15_final关键字._05_局部常量;

/**
 * ClassName:
 * Package: _05_extends._15_final关键字._05_局部常量
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/8 22:15
 * @Version 1.0
 *
 * 局部常量：
 *      含义：
 *          声明在代码块中或方法形参列表中的自定义常量
 */
public class Main {
    public static void main(String[] args) {
        // 直接声明初始化局部常量
        final int NUM = 123;

        // 先声明后初始化局部常量
        final int NUM2;
        NUM2 = 456;

        byte b1 = 3;
        byte b2 = 4;
        // byte b3 = (byte) (b1 + b2);
        byte b3 = 3 + 4; // 将运算由运行时期提前至编译时期

        final byte VAR1 = 3;    //  当成【字面值常量】进行编译和使用
        final byte VAR2 = 4;    //  当成【字面值常量】进行编译和使用
        byte sum =  VAR1 + VAR2; // 将运算由运行时期提前至编译时期

        final byte VAR3;
        VAR3 = 3;
        final byte VAR4;
        VAR4 = 4;
        // byte sum2 = VAR3 + VAR4; // 将运算由运行时期提前至编译时期
    }

    public void method(final int NUM) {
        System.out.println(NUM);
    }
}
