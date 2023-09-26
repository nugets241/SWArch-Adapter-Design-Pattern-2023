package org.sad22.adapter;

public class App {

    public static void main(String[] args) {
        System.out.println("This is Adapter DP starter project");

        MallardDuck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Duck says...");
        System.out.println(duck.quack());
        System.out.println(duck.fly());

        System.out.println("\nThe Turkey says...");
        System.out.println(turkey.gobble());
        System.out.println(turkey.fly());

        System.out.println("\nThe TurkeyAdapter says...");
        System.out.println(turkeyAdapter.quack());
        System.out.println(turkeyAdapter.fly());
    }
}
