package _05_extends._15_final关键字._06_实例常量;

/**
 * ClassName:
 * Package: _05_extends._15_final关键字._06_实例常量
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/8 22:27
 * @Version 1.0
 *
 * 实例常量：
 *      含义：
 *          被 final 修饰的实例常量
 *      注意：
 *          1. 被 final 修饰的实例变量在进行初始化时，JVM的堆内存不会给其赋默认值操作
 *          2. 被 final 修饰的实例变量，如果先声明后初始化，需要在所有构造器中给其进行初始化赋值操作
 *              如果每个构造器初始化的值相同，可以向上抽取到构造器代码块中；
 *              如果每个构造器初始化的值不相同，还是要在每个构造器中进行初始化赋值操作
 */
public class Main {
    public static void main(String[] args) {

    }
}
