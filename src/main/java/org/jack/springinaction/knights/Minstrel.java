package org.jack.springinaction.knights;

import java.io.PrintStream;

/**
 * @Author: Jack
 * @Date: 2018/9/18 21:59
 */
public class Minstrel {
    private PrintStream printStream;
    public Minstrel(PrintStream printStream) {
        this.printStream=printStream;
    }
    public void singBeforeQuest() {
        printStream.println("Fa");
    }
    public void singAfterQuest() {
        printStream.println("Te");
    }
}