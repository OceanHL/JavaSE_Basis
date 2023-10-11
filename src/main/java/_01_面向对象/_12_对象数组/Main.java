package _01_面向对象._12_对象数组;

/**
 * ClassName: Main
 * Package: _01_面向对象._12_对象数组
 * Description:
 *
 * @Author Oceanj_hl
 * @Create 2023/10/10 21:26
 * @Version 1.0
 *
 * 对象数组：
 *      含有：
 *          存储对象的数组
 *      初始化：
 *          动态初始化
 *              类名[] 数组名 = new 类名[长度];
 *          静态初始化
 *              类名[] 数组名 = new 类名[]{元素1,元素2,元素3};
 *              类名[] 数组名 = {元素1,元素2,元素3};
 */
public class Main {
    public static void main(String[] args) {
        // 对象数组的动态初始化
        Student[] stuArr1 = new Student[4];

        // 创建对象
        final Student s1 = new Student("去病", 18);
        final Student s2 = new Student("卫小青", 18);
        final Student s3 = new Student("张小赛", 18);
        final Student s4 = new Student("韩小信", 18);

        stuArr1[0] = s1;
        stuArr1[1] = s2;
        stuArr1[2] = s3;
        stuArr1[3] = s4;

        // stuArr1.fori 快捷键
        for (int i = 0; i < stuArr1.length; i++) {
            System.out.println(stuArr1[i].print());
        }


        System.out.println("===============================");

        // 对象数组的静态初始化
        final Student stu1 = new Student("城小将", 18);
        final Student stu2 = new Student("唐小妃", 18);
        final Student stu3 = new Student("李小白", 18);
        final Student stu4 = new Student("波斯客", 18);

        Student[] stuArr2 = {stu1, stu2, stu3, stu4};

        for (int i = 0; i < stuArr2.length; i++) {
            System.out.println(stuArr2[i].print());
        }
    }
}
