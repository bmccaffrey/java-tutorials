package com.company;

class Developer {
    private String name;
    private String language;
    private String paradigm;
    private String editor;

    public Developer(String name, String language, String paradigm, String editor) {
        this.name = name;
        this.language = language;
        this.paradigm = paradigm;
        this.editor = editor;
    }
}

public class Main {

    public static void main(String[] args) {
        char myChar = 'b';
        byte myByte = 100;
        short myShort = 100;
        int myInteger = 100;
        long myLong = 100;
        float myFloat = 100f;
        double myDouble = 100d;
        String myString = "b";
        String myOtherString = "b";

        System.out.println(myByte == myShort);
        System.out.println(myShort == myInteger);
        System.out.println(myInteger == myLong);
        System.out.println(myLong == myFloat);
        System.out.println(myFloat == myDouble);
        System.out.println(myDouble == myByte);
        System.out.println();

        System.out.println("But myChar (" + myChar + ") isn't equal to "
                + "myString (" + myString + "),"
                + "\nbecause one is a primitive and the other is an "
                + "\nobject/instance of the String class...\n");

        System.out.println("But, \"comparing\" two String objects with the "
                + "\nsame character(s) is " + (myString == myOtherString) + ", "
                + "provided you remember"
                + "\nto parenthesize them and avoid concatenation-- not that "
                + "\nyou would " + myString + " that forgetful! :)");
        System.out.println();

        Developer Seth = new Developer("Seth", "Java", "OO", "Vim");
        Developer Michael = new Developer("Michael", "JavaScript", "OO", "Atom");
        Developer reference = Seth;

        System.out.println("Let's move on from simple String objects to something"
                + "\nmore interesting, namely, the people who make them, "
                + "\ndevelopers. I currently work with a couple great "
                + "\ndevelopers, Seth & Michael. While both being great "
                + "\ndevelopers, are Seth & Michael equivalent? "
                +"\nSurvey says... " + Seth.equals(Michael) + "! That " +
                "statement is " + Seth.equals(Michael) + ".");
        System.out.println();

        System.out.println("Interested? Perhaps, it's because they don't " +
                "\nshare the same properties, you might reason; perhpaps, " +
                "\nbelonging to the same class, or occupation as our example " +
                "\nwould have it, isn't sufficient. Well, let's test that " +
                "\nhypothesis by creating two instance references that refer to" +
                "\nthe same object and by creating an object with identical " +
                "\nproperties.");
        System.out.println();

        System.out.println("Cloning is a very controversial and philosophically " +
                "\ncomplex topic, but today, in none other than Java, we're " +
                "\ngoing to do just that and settle whether being " +
                "\nexactly identical makes you exactly the same. Wait " +
                "\ncouldn't we have just gotten some twins for this?");
        System.out.println();

        System.out.println("First up, we're going to look examine an identical" +
                "\nreference. This is less of a replica and more of a " +
                "\na reflection. Unfortunately, Seth has drawn the short " +
                "\nstraw today, and so we'llbe examining just how similar his" +
                "\nreference / reflection is to himself. Alright, is Seth " +
                "\nequivalent to his reference? It turns out that is " + Seth.equals(reference) + ". " +
                "\nSeth and his reflection are one in the same--well, let's " +
                "\nnot go to far here. Seth & his reflection refer back to " +
                "\nthe same object, err, I mean subject, i.e. Seth.");

        System.out.println();

        System.out.println("Finally, if poor Seth will oblige, we'll make a " +
                "\ntemporary clone of him, though we're not exactly sure " +
                "\nwhat we're going to do with it--err, him after.");

        Developer clone = new Developer("Seth", "Java", "OO", "Vim");

        System.out.println();

        System.out.println("Alright, we've done it. There's no going back now."
                + "\nAnd now, only the question remains...\n"
                + "\n  \"Will Seth be equivalent to his clone...?\"\n"
                + "\nFIND OUT NEXT TIME ON DRAGON BALL Z!!"
                +"\n                       Just kidding. \n"
                + "\nSo, the moment of truth, is Seth equivalent to his"
                + "\nfreshly minted clone? I'm afraid it's " + Seth.equals(clone) + "."
                + "\nWhile they are made up of the same stuff-- they have the same "
                + "\ncharacteristics, attributes, properties, knowledge, & behavior,"
                + "\nthey are not the same... the same object--whoops, I meant"
                + "\nmeant person--person, of course!");

        System.out.println();

        System.out.println("Alrighty, well that settles tonight's exploration" +
                "\nof equality. In short, for the numberic types, if the " +
                "\nvalues are the same, they are equivalent. Instance " +
                "\nvariables are tad bit more complex. The equality operator " +
                "\ntests whether two instance variables refer to the same " +
                "\nobject. The .equals() method properly tests for equivalency." +
                "\nString objects are a little more flexible than other " +
                "\nobjects. If two strings have exactly the same characters, " +
                "\nboth in case & capitalization, both the equality operator & " +
                "\n.equals() method return true.");

    }
}
