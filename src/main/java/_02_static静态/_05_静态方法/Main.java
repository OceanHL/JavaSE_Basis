package _02_static静态._05_静态方法;

/**
 * ClassName:
 * Package: _02_static静态._05_静态方法
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/11 20:40
 * @Version 1.0
 * 静态方法：
 *      含义：
 *          被 static 修饰的成员方法
 *      格式：
 *          权限 static 返回类型 方法名() {}
 *      特点：
 *          1. 被 static 关键字修饰的成员方法不再属于对象，而是属于类本身，会被这个类创建的所有对象共享
 *          2. 当创建一个对象，只是为了使用里面的实例方法来进行操作，和对象本身无关，导致对象本身在堆内存中一直驻留，浪费内存空间，
 *              在实际应用过程中，使用静态方法，无需使用对象，直接使用类名调用即可
 *          3. 将构造器进行私有化，只允许本类使用，不允许外部调用
 *      调用：
 *          对象名.静态方法名(实参);
 *          类名.静态方法名(实参);
 */
public class Main {
    public static void main(String[] args) {
        // 创建 ArrayUtil 工具类对象
        // final ArrayUtils arrayUtils = new ArrayUtils();

//        arrayUtils.print(11, 22, 33);
//        arrayUtils.print(11, 22, 33, 44);
//        arrayUtils.print(11, 22, 33, 44, 55);

        System.out.println("==================");

        ArrayUtils.print(11, 22, 33);
        ArrayUtils.print(11, 22, 33, 44);
        ArrayUtils.print(11, 22, 33, 44, 55);

    }
}
