package _01_面向对象._08_私有实例变量;/**
* ClassName: Main
* Package: _01_面向对象._08_私有实例变量
* Description:
* @Author Oceanj_hl
* @Create 2023/10/10 20:06
* @Version 1.0
 *
 * 私有实例变量：
 *      含有：
 *          被 priviate 关键字修饰的实例变量
 *      特点：
 *          被 private 关键字修饰的实例变量，只能被本类访问，不能被其他类访问
 *      格式：
 *          private 数据类型 变量名;
 *
 *      步骤：
 *          1. 将“模板类”中所有的实例变量进行私有化
 *          2. 针对每个被private修饰的变量对外提供一对公共访问方式get()和set()
 *                 set()的两个明确：
 *                      返回类型： void
 *                      形参列表： 存储数据的数据类型 变量名
 *                 get()的两个明确：
 *                      返回类型： 存储数据的数据类型
 *                      形参列表： 不接受参数
*/
public class Main {
    public static void main(String[] args) {
        // 创建学生对象
        Student s = new Student();

        // 给学生对象进行赋值
        // s.name = "蒋小苗";
        s.setName("蒋小苗");
        // 逆生长
        // s.age = -18;
        s.setAge(-18);

        System.out.println(s.getName() + "=" + s.getAge());
    }
}
