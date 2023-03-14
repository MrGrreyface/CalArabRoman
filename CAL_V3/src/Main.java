import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] act = {"+", "-", "*", "/"};
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        int res = 0;
        int actIn = -1;
        int num1 = 0, num2 = 0;
        boolean itsRoman1, itsRoman2;

        System.out.println("Введите выражение: ");
        String str = sc.nextLine();
        str = str.replace(" ", "");
        for (int i = 0; i < act.length; i++) {
            if (str.contains(act[i])) {
                actIn = i;
                break;
            }
        }
        if (actIn == -1) {
            System.out.println("Неверное выражение");
        }

        String[] splitStr = str.split("[+-/*]");
        if (splitStr.length > 2) {
            System.out.println("Неверный формат выражения");
        } else {

            if (splitStr[0].equals("I")) {
                num1 = 1;
                itsRoman1 = true;
            } else if (splitStr[0].equals("II")) {
                num1 = 2;
                itsRoman1 = true;
            } else if (splitStr[0].equals("III")) {
                num1 = 3;
                itsRoman1 = true;
            } else if (splitStr[0].equals("IV")) {
                num1 = 4;
                itsRoman1 = true;
            } else if (splitStr[0].equals("V")) {
                num1 = 5;
                itsRoman1 = true;
            } else if (splitStr[0].equals("VI")) {
                num1 = 6;
                itsRoman1 = true;
            } else if (splitStr[0].equals("VII")) {
                num1 = 7;
                itsRoman1 = true;
            } else if (splitStr[0].equals("VIII")) {
                num1 = 8;
                itsRoman1 = true;
            } else if (splitStr[0].equals("IX")) {
                num1 = 9;
                itsRoman1 = true;
            } else if (splitStr[0].equals("X")) {
                num1 = 10;
                itsRoman1 = true;
            } else {
                try {
                    num1 = Integer.parseInt(splitStr[0]);

                    itsRoman1 = false;
                } catch (NumberFormatException e) {
                    System.out.println("Неверный формат");
                    return;
                }
            }
            if (splitStr[1].equals("I")) {
                num2 = 1;
                itsRoman2 = true;
            } else if (splitStr[1].equals("II")) {
                num2 = 2;
                itsRoman2 = true;
            } else if (splitStr[1].equals("III")) {
                num2 = 3;
                itsRoman2 = true;
            } else if (splitStr[1].equals("IV")) {
                num2 = 4;
                itsRoman2 = true;
            } else if (splitStr[1].equals("V")) {
                num2 = 5;
                itsRoman2 = true;
            } else if (splitStr[1].equals("VI")) {
                num2 = 6;
                itsRoman2 = true;
            } else if (splitStr[1].equals("VII")) {
                num2 = 7;
                itsRoman2 = true;
            } else if (splitStr[1].equals("VIII")) {
                num2 = 8;
                itsRoman2 = true;
            } else if (splitStr[1].equals("IX")) {
                num2 = 9;
                itsRoman2 = true;
            } else if (splitStr[1].equals("X")) {
                num2 = 10;
                itsRoman2 = true;
            } else {
                try {
                    num2 = Integer.parseInt(splitStr[1]);

                    itsRoman2 = false;
                } catch (NumberFormatException e) {
                    System.out.println("Неверный формат");
                    return;
                }
            }
            if (num1 > 0 && num2 > 0 && itsRoman1 && itsRoman2 && num1 <= 10 && num2 <= 10) {
                switch (act[actIn]) {
                    case "+": {
                        res = num1 + num2;
                        break;
                    }
                    case "-": {
                        res = num1 - num2;
                        break;
                    }
                    case "*": {
                        res = num1 * num2;
                        break;
                    }
                    case "/": {
                            res = num1 / num2;
                            break;

                    }
                    default:
                        System.out.println("Похоже, что-то пошло не так");
                        break;
                }
            } else if (num1 > 0 && num2 > 0 && !itsRoman1 && !itsRoman2 && num1 <= 10 && num2 <= 10) {
                switch (act[actIn]) {
                    case "+": {
                        res = num1 + num2;
                        break;
                    }
                    case "-": {
                        res = num1 - num2;
                        break;
                    }
                    case "*": {
                        res = num1 * num2;
                        break;
                    }
                    case "/": {
                        res = num1 / num2;
                            break;
                        }

                    default:
                        System.out.println("Похоже, что-то пошло не так");
                        break;}
                }

            else {
                System.out.println("Похоже, вы ввели что-то не то");
            }
            if (itsRoman1 && itsRoman2){try {
                System.out.println("Результат: " + roman[res]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("В римской системе исчесления нет отрицательных значений");
            }

            } else {
                System.out.println("Результат: " + res);
            }
        }
    }}
