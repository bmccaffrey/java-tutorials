package com.company;

public class Main {

    public static void main(String[] args) {
        // Instantiate Developers
        Developer Bobby = new Developer("Bobby", "Go", "Functional", "Emacs");
        Developer Seth = new Developer("Seth", "Java", "OO", "Vim");
        Developer Michael = new Developer("Michael", "JavaScript", "OO", "Atom");
        Developer me = new Developer("Bryan", "HTML", "Spaghetti", "Notepad");

        // Example Manually Setting
        Developer[] AI = new Developer[4];
        AI[0] = Bobby;
        AI[1] = Seth;
        AI[2] = Michael;
        AI[3] = me;

        // Declaring & Assigning
        Developer[] devs = {
                new Developer("Bobby", "Go", "Functional", "Emacs"),
                new Developer("Seth", "Java", "OO", "Vim"),
                new Developer("Michael", "JavaScript", "OO", "Atom"),
                new Developer("Bryan", "HTML", "Spaghetti", "Notepad")
        };

        // Declaring & Assigning via Variables
        Developer[] automationIntegrated = {Bobby, Seth, Michael, me};

        // Calling Methods on Objects in Array
        for (int i = 0; i < AI.length; i++) { System.out.println(AI[i].getName()); }
        System.out.println();


        for (int i = 0; i < automationIntegrated.length; i++) { automationIntegrated[i].printProperties(); }
        System.out.println();

        Developer.comparison(AI, "language");
        System.out.println();

        Developer.comparison(automationIntegrated, "paradigm");
        System.out.println();

        Developer.comparison(devs, "editor");
    }
}
