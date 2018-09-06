package main.java.ro.sci.StringsTest;

public class StringUtility {

    public String[] replaceSwitch(String[] str) {

        for (int i = 0; i < str.length; i++) {

            if (!str[i].contains("-")) {
                String temp = str[i];
                if (temp.contains("one")) {
                    str[i] = temp.replace("one", "1");
                    temp = str[i];
                }
                if (temp.contains("two")) {
                    str[i] = temp.replace("two", "2");
                    temp = str[i];
                }
                if (temp.contains("three")) {
                    str[i] = temp.replace("three", "3");
                    temp = str[i];

                }
                if (temp.contains("four")) {
                    str[i] = temp.replace("four", "4");
                    temp = str[i];

                }
                if (temp.contains("five")) {
                    str[i] = temp.replace("five", "5");
                    temp = str[i];

                }
                if (temp.contains("six")) {
                    str[i] = temp.replace("six", "6");
                    temp = str[i];

                }
                if (temp.contains("seven")) {
                    str[i] = temp.replace("seven", "7");
                    temp = str[i];

                }
                if (temp.contains("eight")) {
                    str[i] = temp.replace("eight", "8");
                    temp = str[i];

                }
                if (temp.contains("nine")) {
                    str[i] = temp.replace("nine", "9");
                }

            }
        }
        return str;
    }

    public void printer(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.print(" " + strings[i]);
        }
    }

    public String[] getLowerCase(String string){
        string = string.toLowerCase();
        String[] strings = string.split(" ");
        return strings;
    }


    public StringUtility(String string) {

        String[] strings = getLowerCase(string);
        replaceSwitch(strings);
        printer(strings);
    }




}
