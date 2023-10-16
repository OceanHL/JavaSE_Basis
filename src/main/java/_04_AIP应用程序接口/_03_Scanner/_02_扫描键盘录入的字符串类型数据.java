package _04_AIP应用程序接口._03_Scanner;

import java.util.Scanner;

/**
 * ClassName:
 * Package: _04_AIP应用程序接口._03_Scanner
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/11 22:52
 * @Version 1.0
 *
 * 通过 Scanner 对象扫描键盘录入的字符串类型数据
 *
 * 注意事项：
 *      1. next() 遇到【空白符号】会自动停止扫描
 *      2.nextLine()之前不能调用非nextLine()方法
 */
public class _02_扫描键盘录入的字符串类型数据 {
    public static void main(String[] args) {
        method04();
    }

    private static void method04() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入学生对象的学号：");
        int id = scanner.nextInt();
        System.out.println("请输入学生对象的姓名：");
        String name = scanner.nextLine(); // nextLine()之前不能调用非nextLine()方法
        System.out.println("请输入学生对象的年龄：");
        int age = scanner.nextInt();

        // 通过键盘录入的数据创建学生对象
        Student st = new Student(id, name, age);
        System.out.println(st.print());

        scanner.close();
    }
    private static void method03() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入学生对象的学号：");
        int id = scanner.nextInt();
        System.out.println("请输入学生对象的姓名：");
        String name = scanner.next();
        System.out.println("请输入学生对象的年龄：");
        int age = scanner.nextInt();

        // 通过键盘录入的数据创建学生对象
        Student st = new Student(id, name, age);
        System.out.println(st.print());

        scanner.close();
    }
    private static void method02() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String str = scanner.nextLine();
        System.out.println("你输入的字符串是：" + str);

        scanner.close();
    }
    private static void method01() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String str = scanner.next(); // 遇到【空白符号】会自动停止扫描
        System.out.println("你输入的字符串是：" + str);

        scanner.close();
    }
}
