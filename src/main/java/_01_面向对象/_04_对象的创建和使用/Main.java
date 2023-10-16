package _01_面向对象._04_对象的创建和使用;

/**
 * ClassName: _04_对象的创建和使用
 * Package: _01_面向对象
 * Description:
 *
 * @Author Oceanj_hl
 * @Create 2023/10/9 22:30
 * @Version 1.0
 */

/**
 * 对象的创建和使用
 *      创建格式：
 *          类名 对象名 = new 类名(实参);
 *
 *      使用格式：
 *          对象名.实例变量名;
 *          对象名.实例方法名(实参);
 */
public class Main {
    public static void main(String[] args) {
        // 创建学生对象
        Student s1 = new Student();
        System.out.println(s1);

        // 获取s1对象的姓名和年龄
        System.out.println(s1.name);
        System.out.println(s1.age);

        // 给s1对象进行赋值
        s1.name = "姜小苗";
        s1.age = 18;

        // 获取s1对象的姓名和年龄
        System.out.println(s1.name);
        System.out.println(s1.age);

        // 获取s1对象的study
        s1.study();

        System.out.println("---------------------------");

        // 创建第2个学生对象
        Student s2 = new Student();
        s2.study();
    }
}
