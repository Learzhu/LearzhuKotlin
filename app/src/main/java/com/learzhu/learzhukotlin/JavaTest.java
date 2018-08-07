package com.learzhu.learzhukotlin;

/**
 * JavaTest.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-07 15:49
 * @update Learzhu 2018-08-07 15:49
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
public class JavaTest {
    public static void main(String args[]) {
        A a = new B();
        a.print();
        String ss = "12.345-6.A";
//        System.out.println(ss.split(".").length);
        System.out.println(ss.split("\\.").length);
    }
}

class A {
    private String name;

    public void print() {
        System.out.println("A");
    }
}

class B extends A {
    public void print() {
        System.out.println("B");
    }
}
