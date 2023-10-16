package _01_面向对象._08_私有实例变量;

/**
 * ClassName: Student
 * Package: _01_面向对象._08_私有实例变量
 * Description:
 *
 * @Author Oceanj_hl
 * @Create 2023/10/10 20:08
 * @Version 1.0
 */
public class Student {
   private String name;
   private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("年龄不能为负数");
        }
        this.age = age;
    }
}
