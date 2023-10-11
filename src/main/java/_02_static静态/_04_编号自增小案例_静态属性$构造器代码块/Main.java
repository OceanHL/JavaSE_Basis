package _02_static静态._04_编号自增小案例_静态属性$构造器代码块;

/**
 * ClassName:
 * Package: _02_static静态._04_编号自增小案例
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/11 20:29
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        final Student s1 = new Student("去病", 18);
        final Student s2 = new Student("卫小青", 18);
        final Student s3 = new Student("张小赛", 18);
        Student s4 = new Student();
        s4.setName("韩小信");
        s4.setAge(18);

        System.out.println(s1.print());
        System.out.println(s2.print());
        System.out.println(s3.print());
        System.out.println(s4.print());
    }
}
