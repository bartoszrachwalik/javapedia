package com.github.javapedia.strings;

public class StringExcercises {

    public static void main(String[] args) {

        String parameters = "param1:param2_param3:param4_param5:param6_param7:param8";
        System.out.println(new StringExcercises().excercise1("John"));
        System.out.println(new StringExcercises().excercise2("Lord of the Rings", 3));
        System.out.println(new StringExcercises().excercise2("Lord of the Rings", 3, 6));
        System.out.println(new StringExcercises().excercise3("PołowaiPOLOWA"));
        System.out.println(new StringExcercises().excercise3("PołowaPOLOWA"));
        System.out.println(new StringExcercises().excercise4("first blood"));
        System.out.println(new StringExcercises().excercise4("last blood"));
        System.out.println(new StringExcercises().excercise4("start blood"));
        System.out.println(new StringExcercises().excercise5("Bartosz Rachwalik"));
        System.out.println(new StringExcercises().excercise6("Student SDA"));
        System.out.println(new StringExcercises().excercise6("Student -SDA"));
        System.out.println(new StringExcercises().excercise6("Student"));
        System.out.println(new StringExcercises().excercise7("abcde"));
        System.out.println(new StringExcercises().excercise8("sghoha"));
        System.out.println(new StringExcercises().excercise8("arra.b"));
        System.out.println(new StringExcercises().excercise9("120:0098:09:124", ":"));
        System.out.println(new StringExcercises().excercise9("bartosz,rachwalik,java,", ","));
        System.out.println(new StringExcercises().excercise10(parameters));
        System.out.println(new StringExcercises().excercise11("Today is a good day", "&&&"));
    }

    public String excercise1(String name) {
        return "Welcome " + name;
    }

    public String excercise2(String bookName, int index) {
        return bookName.substring(index);
    }

    public String excercise2(String bookName, int index, int endIndex) {
        return bookName.substring(index, endIndex);
    }

    public String excercise3(String temp) {
        if (temp.length() % 2 == 0)
            return temp.substring(0, temp.length() / 2);
        else
            return temp.substring(temp.length() / 2 + 1, temp.length());
    }

    public boolean excercise4(String temp) {
        if (temp.startsWith("start") || temp.startsWith("first"))
            return true;
        else
            return false;
    }

    public String excercise5(String nameAndSurname) {
        String[] stringArray = nameAndSurname.split(" ");
        return stringArray[0].substring(0, 1) + stringArray[1].substring(0, 1);
    }

    public boolean excercise6(String temp) {
        if (temp.contains("-SDA"))
            return false;
        else if (temp.contains("SDA"))
            return true;
        else
            return false;
    }

    public String excercise7(String temp) {
        char[] charArray = new char[temp.length() * 2];
        char[] tempCharArray = temp.toCharArray();
        for (int i = 0; i < tempCharArray.length; i++) {
            charArray[i * 2] = tempCharArray[i];
            charArray[i * 2 + 1] = tempCharArray[i];
        }
        return String.valueOf(charArray);
    }

    public boolean excercise8(String temp) {
        if (temp.contains("a.b"))
            return false;
        else
            return true;
    }

    public String excercise9(String temp, String characterToEscape) {
        String[] strArray = temp.split(characterToEscape);
        StringBuilder strBuff = new StringBuilder();
        for (String currentString : strArray) {
            strBuff.append(currentString);
        }
        return strBuff.toString();
    }

    public String excercise10(String parameters) {
        String[] paramArray = parameters.split(":|_");
        return "Parametry:\n" + paramArray[0] + " - " + paramArray[1] + "\n" + paramArray[2] + " - " + paramArray[3] + "\n" + paramArray[4] + " - " + paramArray[5] + "\n" + paramArray[6] + " - " + paramArray[7];
    }

    public String excercise11(String s, String replace) {
        String[] stringArray = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String s1 : stringArray) {
            if (s1.startsWith("T") | s1.startsWith("t") | s1.startsWith("D") | s1.startsWith("d")) {
                s1 = s1.replaceAll("a", replace);
            }
            sb.append(s1 + " ");
        }
        s = sb.toString();
        return s;
    }

    public char[] regex2(String sda) {
        String[] stringArray = sda.split(":");
        char[] charArray = new char[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            charArray[i] = stringArray[i].charAt(0);
        }
        return charArray;
    }
}
