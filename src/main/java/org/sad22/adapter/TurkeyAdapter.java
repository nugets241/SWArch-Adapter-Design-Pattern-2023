package org.sad22.adapter;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public String quack() {
        return turkey.gobble();
    }

    public String fly() {
        String result = "";
        for(int i=0; i < 5; i++) {
            result += turkey.fly() + "\n";
        }
        return result.trim();  // remove the trailing newline
    }
}
