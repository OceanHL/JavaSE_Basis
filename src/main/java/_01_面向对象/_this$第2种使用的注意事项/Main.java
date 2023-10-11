package _01_面向对象._this$第2种使用的注意事项;

/**
 * ClassName:
 * Package: _01_面向对象._this$第2种使用的注意事项
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/10 22:10
 * @Version 1.0
 *
 * this第2种使用的注意事项
 *      1.this(实参)必须在构造器的第一行，否则编译报错
 *      2.一旦构造器中含有this(实参),该构造器不会进行实例成员的初始化操作(构造器中第一阶段和第二节点做的事情不会执行)
 */
public class Main {
    public static void main(String[] args) {
        new Student();
    }
}
