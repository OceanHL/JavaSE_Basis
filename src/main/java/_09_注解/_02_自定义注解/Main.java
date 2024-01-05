package _09_注解._02_自定义注解;

/**
 * ClassName:
 * Package: _09_注解._02_自定义注解
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2024/1/5 21:01
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        // 方式1: 键值对
        @MyAnnotation(value = "Hello World")
        int num = 10;

        // 方式2：只写值
        @MyAnnotation("Hello")
        int age = 10;

    }
}

/**
 * @author  Ocean_jhl
 * &#064;date   2024/1/5 21:01
 * @version 1.0
 * &#064;description  自定义注解
 */
@interface MyAnnotation {
    String value(); // 属性
    String name() default  "Ocean"; // 默认值
}
