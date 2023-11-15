package _05_extends._10_this和super关键字的注意事项;

/**
 * ClassName:
 * Package: _05_extends._10_this和super关键字的注意事项
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/18 22:54
 * @Version 1.0
 *
 * this和super关键字的注意事项
 *      1.this关键字在内存中拥有【地址值】，可以进行打印操作，
 *        但super关键字在内存中【没有地址值】，只是子类中的一部分，不能进行打印操作。
 *      2.在静态成员中无法使用this和super关键字，因为对象并没有创建。
 *      3.super(实参)或this(实参)必须在构造器中的第一行，否则编译不通过。
 *      4.在同一个构造器中，不能同时使用 super(实参) 和 this(实参)。
 */
public class Main {
    public static void main(String[] args) {
        final SubClass sc = new SubClass();
    }
}
