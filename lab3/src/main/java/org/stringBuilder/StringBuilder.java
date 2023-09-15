package org.stringBuilder;

import java.util.Scanner;
import java.util.Objects;

public class StringBuilder {
    private int enteredLengthOfString;
    private String enteredString;

    public int getEnteredLengthOfString() {
        return enteredLengthOfString;
    }
    public void setEnteredLengthOfString(int enteredLengthOfString) {
        this.enteredLengthOfString = enteredLengthOfString;
    }
    public String getEnteredString() {
        return enteredString;
    }
    public void setEnteredString(String enteredString) {
        this.enteredString = enteredString;
    }

    public void enterValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст: ");
        setEnteredString(scanner.nextLine());
        System.out.println("Введіть максимальну довжину рядка: ");
        setEnteredLengthOfString(scanner.nextInt());
    }
    public void displayTextByLineLength() {
        int counter = 0;
        int pointer = 0;
        while (counter != (getEnteredString().length() / getEnteredLengthOfString())) {
            System.out.println(getEnteredString().substring(pointer, (pointer + getEnteredLengthOfString())));
            pointer+= getEnteredLengthOfString();
            counter++;
        }
        if ((getEnteredString().length() / getEnteredLengthOfString() != 0)) {
            System.out.println(getEnteredString().substring(pointer, getEnteredString().length()));
        }
    }
    private boolean checkCapitalLetters(String password) {
        char englishCapitalLetters[] = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z'
        };
        int counter = 0;
        int counter2 = 0;
        boolean haveCapitalLetters = false;
        while(counter <= password.length() || haveCapitalLetters == false) {
            {
                while(counter2 <= englishCapitalLetters.length || haveCapitalLetters == false) {
                    if (Objects.equals(password.charAt(counter), englishCapitalLetters[counter2])) {
                          haveCapitalLetters = true;
                    } else {
                          counter2++;
                    }
                }
                counter++;
                counter2 = 0;
            }
        }
        return haveCapitalLetters;
    }
    private boolean checkSmallLetters(String password) {
        char englishSmallLetters[] = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'
        };
        int counter = 0;
        int counter2 = 0;
        boolean haveSmallLetters = false;
        while (counter <= password.length() || haveSmallLetters == false) {
            {
                while (counter2 <= englishSmallLetters.length || haveSmallLetters == false) {
                    if (Objects.equals(password.charAt(counter), englishSmallLetters[counter2])) {
                        haveSmallLetters = true;
                    } else {
                        counter2++;
                    }
                }
                counter++;
                counter2 = 0;
            }
        }
        return haveSmallLetters;
    }
    private boolean checkNumbers(String password) {
        char numbers[] = {
                '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'
        };
        int counter = 0;
        int counter2 = 0;
        boolean haveNumbers = false;
        while (counter <= password.length() || haveNumbers == false) {
            {
                while (counter2 <= numbers.length || haveNumbers == false) {
                    if (Objects.equals(password.charAt(counter), numbers[counter2])) {
                        haveNumbers = true;
                    } else {
                        counter2++;
                    }
                }
                counter++;
                counter2 = 0;
            }
        }
        return haveNumbers;
    }
    private boolean checkSpecialSymbols(String password) {
        char specialSymbols[] = {
                '!', '@', '#', '$', '%', '^', '&', '*', '(', ')',
                '-', '_', '+', '=', '{', '}', '[', ']', '|',
                ';', ':', '"', '<', '>', ',', '.', '?', '/',
                '`', '~'
        };
        int counter = 0;
        int counter2 = 0;
        boolean haveSpecialSymbols = false;
        while (counter <= password.length() || haveSpecialSymbols) {
            {
                while (counter2 <= specialSymbols.length || haveSpecialSymbols) {
                    if (Objects.equals(password.charAt(counter), specialSymbols[counter2])) {
                        haveSpecialSymbols = true;
                    } else {
                        counter2++;
                    }
                }
                counter++;
                counter2 = 0;
            }
        }
        return haveSpecialSymbols;
    }
    public void checkPassword() {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if(checkSmallLetters(password) && checkCapitalLetters(password) && checkNumbers(password) && checkSpecialSymbols(password) && password.length() >= 8) {
            System.out.println("Пароль задовільняє вимоги!");
        } else {
            System.out.println("Пароль незадовільняє вимоги!");
        }
    }
}
