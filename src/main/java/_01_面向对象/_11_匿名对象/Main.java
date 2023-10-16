package _01_面向对象._11_匿名对象;

/**
 * ClassName: Main
 * Package: _01_面向对象._11_匿名对象
 * Description:
 *
 * @Author Oceanj_hl
 * @Create 2023/10/10 21:17
 * @Version 1.0
 *
 * 匿名对象：
 *      含有：
 *          没有名称的对象
 *      格式：
 *          new 类名(实参);
 *      好处:
 *          降低对象在内存中的时间，想高内存的使用率
 *      弊端:
 *          匿名对象只能使用唯一的一次
 */
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        method(s); // 学生对象如果被垃圾回收器进行回收,需要被标记为垃圾数,等到main()结束时,才会被标记为垃圾数据

        System.out.println("===============");

        method(new Student()); // 学生对象如果被垃圾回收器进行回收,需要被标记为垃圾数据，等到method()结束时,才会被标记为垃圾数据
    }

    public static void method(Student s) {
        System.out.println(s);
    }
}
