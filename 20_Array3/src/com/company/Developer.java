package com.company;

public class Developer {
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

    public static void comparison(Developer[] developerArray, String property) {
        if (property.equalsIgnoreCase("language")) {
            for (int i = 0; i < developerArray.length; i++) {
                System.out.println("Name: " + developerArray[i].name + " | JavaScript");
            }
            System.out.println("Everyone loves JavaScript!");
            System.out.println("For the actual results, try \"ActualLanguage\"--one word. Capitalization doesn't matter");
        } else if (property.equalsIgnoreCase("actuallanguage")) {
            for (int i = 0; i < developerArray.length; i++) {
                System.out.println("Name: " + developerArray[i].name + " | " + developerArray[i].language);
            }
        } else if (property.equalsIgnoreCase("paradigm")) {
                for (int i = 0; i < developerArray.length; i++) {
                    System.out.println("Name: " + developerArray[i].name + " | " + developerArray[i].paradigm);
            }
        } else if (property.equalsIgnoreCase("editor")) {
            for (int i = 0; i < developerArray.length; i++) {
                System.out.println("Name: " + developerArray[i].name + " | " + developerArray[i].editor);
            }
        } else {
            System.out.println("Invalid Property Specified");
        }
    }

    public void printProperties() {
        System.out.println("Name: " + this.name + " | Language of Choice: "
                + this.language + " | Favorite Programming Paradigm: "
                + this.paradigm + " | Preferred Text Editor: " + this.editor);

    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public String getParadigm() {
        return paradigm;
    }

    public String getEditor() {
        return editor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLanguage(String language) {
        if (language.toLowerCase() != "javascript") {
            System.out.println("False; your favorite language is JavaScript.");
        }
        this.language = "JavaScript";
    }

    public void setParadigm() {
        this.paradigm = paradigm;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
}
