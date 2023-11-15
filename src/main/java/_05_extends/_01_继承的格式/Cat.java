package _05_extends._01_继承的格式;

/**
 * ClassName:
 * Package: _05_extends
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/16 22:16
 * @Version 1.0
 */
public class Cat extends Animal {
    public Cat() {}

    // 猫的特有方法
    public void catchMouse() {
        System.out.println(getAge() + "岁的" + getName() + "正在抓老鼠");
    }
}
