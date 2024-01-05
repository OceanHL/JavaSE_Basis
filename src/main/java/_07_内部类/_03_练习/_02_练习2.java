package _07_内部类._03_练习;

/**
 * ClassName:
 * Package: _07_内部类._03_练习
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2024/1/3 22:06
 * @Version 1.0
 */
public class _02_练习2 {
    public static void main(String[] args) {
        SubA subA = new SubA();
        subA.method();

        // 直接去 new 接口，并且 实现方法
        // 方式1：提供接口匿名实现类的对象
        A a1 = new A() {
            @Override
            public void method() {
                System.out.println("Anonymous1.method()" + A.NAME);
            }
        };
        a1.method();

        // 方式2：提供接口匿名实现类的匿名对象
        new A() {
            @Override
            public void method() {
                System.out.println("Anonymous2.method()" + A.NAME);
            }
        }.method();

        // 方式3：
        SubB sub1 = new SubB();
        sub1.method();

        // 方式4：提供了继承于抽象类的匿名子类的对象
        B b = new B() { // B 是抽象类
            @Override
            public void method() {
                System.out.println("继承于抽象类的子类 b.method()");
            }
        };
        b.method();
        System.out.println(b.getClass()); // class _07_内部类._03_练习._02_练习2$3
        System.out.println(b.getClass().getSuperclass()); // class _07_内部类._03_练习.B

        // 方式5：提供了继承于抽象类的匿名子类的匿名对象
        new B() {
            @Override
            public void method() {
                System.out.println("继承于抽象类的子类 Anonymous3.method()" + A.NAME);
            }
        }.method();

        // 方式6：
        C c = new C();
        c.method();

        //  方式7：提供了一个继承于 C 的子类的对象
        C c1 = new C(){};
        c1.method();
        System.out.println(c1.getClass()); // class _07_内部类._03_练习._02_练习2$5
        System.out.println(c1.getClass().getSuperclass()); // class _07_内部类._03_练习.C

        // 方式8：
        C c2 = new C() {
            @Override
            public void method() {
                System.out.println("继承于 C 的子类 Anonymous4.method()");
            }
        };
        c2.method();

        // 方式9：
        new C() {
            @Override
            public void method() {
                System.out.println("继承于 C 的子类 Anonymous5.method()");
            }
        }.method();
    }
}

interface A {
    // 方法默认 public
    void method();

    // 字段默认 public static final
    String NAME = "A";
}


class SubA implements A { // 实现接口，就要实现接口中的所有【抽象方法】
    // 方法默认 public
    @Override
    public void method() {
        System.out.println("SubA.method()" + A.NAME);
    }
}


abstract class B {
    public abstract void method();
}

class SubB extends B { // 继承抽象类，就必须要重写抽象类的【所有抽象方法】
    @Override
    public void method() {
        System.out.println("SubB.method()");
    }
}

// 普通类
class C {
    public void method() {
        System.out.println("C.method()");
    }
}