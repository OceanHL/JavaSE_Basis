package _01_面向对象._this$第2种使用的注意事项;

/**
 * ClassName:
 * Package: _01_面向对象._this$第2种使用的注意事项
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/10 22:11
 * @Version 1.0
 *
 *
 */
public class Student {
    {
        System.out.println("构造器代码块");
    }
    public Student() {
        this(1); // 交给一个参数的构造器
        System.out.println("无参构造器");
    }

    public Student(int a) {
        this(1, 2);
        System.out.println("一个参数的构造器");
    }

    public Student(int a, int b) {
        System.out.println("两个参数的构造器");
    }
}
