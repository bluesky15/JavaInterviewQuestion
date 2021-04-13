package com.lkb;

public class Test {
    public static void main(String[] args) {
        A aa = new A();
        System.out.println(aa);
        A.InnerB b = aa.getInnerB();
        //b.a = aa;
        aa = null;
        A ab = (A) b.a;
        System.out.println(aa);
        System.out.println(ab);
        System.out.println(b.a);
        System.out.println("Hello");
    }
}


class A{
    public A(){
    }

    public InnerB getInnerB(){
        InnerB bb = new InnerB();
        bb.a = this;
        return bb;
    }

    static final class InnerB{
        Object a;
    }

}