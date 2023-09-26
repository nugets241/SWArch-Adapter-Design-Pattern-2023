package org.sad22.adapter;

public class App {

    public static void main(String[] args) {
        System.out.println("This is Adapter DP starter project");

        WildTurkey wildTurkey = new WildTurkey();
        System.out.println(wildTurkey.fly());
        System.out.println(wildTurkey.gobble());

        MallardDuck mallardDuck = new MallardDuck();
        System.out.println(mallardDuck.fly());
        System.out.println(mallardDuck.quack());
    }
}
