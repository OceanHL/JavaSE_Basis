package _05_extends._15_final关键字._04_自定义常量;

/**
 * ClassName:
 * Package: _05_extends._15_final关键字._04_自定义常量
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/8 22:02
 * @Version 1.0
 *
 * 自定义常量：
 *      含义：
 *          被 final 修饰的变量
 *      格式：
 *          修饰符 final 数据类型 变量名 = 常量值;
 *      特点：
 *          被 final 修饰的变量不可以被二次赋值
 *      场景：
 *          在实际开发中，需要使用不可改变且带有数据类型的常量时
 *          比如：PI
 *      分类：
 *          自定义局部常量
 *          自定义实例常量
 *          自定义静态常量
 *      注意：
 *          1. JVM的编译器会将 final 修饰且通过直接声明初始化的常量，当成【字面值常量】进行编译和使用
 *          2. 常量有常量的命名规范：
 *              一个单词：
 *                  单词字母全部大写
 *              多个单词：
 *                  每个单词字母全部大写，且每个单词之间使用“_”连接
 */
public class Main {
    public static void main(String[] args) {

    }
}
