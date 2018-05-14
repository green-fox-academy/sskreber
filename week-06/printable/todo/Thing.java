package todo;

import printable.Printable;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Printable {
    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public void printAllFields() {
        System.out.print(this.toString() + "  ");
    }
}

