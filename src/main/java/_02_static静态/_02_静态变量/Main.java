package _02_static静态._02_静态变量;

/**
 * ClassName:
 * Package: _02_static静态._02_静态变量
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/10 22:31
 * @Version 1.0
 *
 * 静态变量：
 *      含义：
 *          被 static 关键字修饰的成员变量
 *      格式：
 *          修饰符 static  数据类型 变量名 = 初始化值;
 *      特点：
 *          被static关键字修饰的成员变量不再属于对象,而是归属于类本身,会被这个类创建的所有对象共享
 *      调用：
 *          对象名.静态变量名;
 *          类名.静态变量名;
 */
public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student("郭靖", 18, "射雕");
//        Student s2 = new Student("黄蓉", 16, "射雕");
//        Student s3 = new Student("洪七公", 50, "射雕");
        Student s1 = new Student("郭靖", 18);
        Student s2 = new Student("黄蓉", 16);
        Student s3 = new Student("洪七公", 50);

        // s1.setClassroom("射雕");
        Student.classroom = "射雕";

        System.out.println(s1.print());
        System.out.println(s2.print());
        System.out.println(s3.print());
    }
}
