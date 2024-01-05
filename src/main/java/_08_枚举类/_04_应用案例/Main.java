package _08_枚举类._04_应用案例;

/**
 * ClassName:
 * Package: _08_枚举类._04_应用案例
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2024/1/4 22:31
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tom", 18, Status.BUSY);
        System.out.println(e1); // Employee{name='Tom', age=18, status=BUSY}
    }
}
