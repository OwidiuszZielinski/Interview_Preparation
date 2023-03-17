package org.example.codingbat;

import java.util.Arrays;

public class LogicBasic {
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(65, true));
        System.out.println(sortaSum(3, 4));
        System.out.println(less20(59));
        System.out.println(makeBricks(1, 4, 11));
        System.out.println(makeBricks(6, 1, 11));
    }

    public boolean cigarParty(int cigars, boolean isWeekend) {
        return (cigars >= 40 && cigars <= 60) || (isWeekend && cigars >= 40);
    }

    public int dateFashion(int you, int date) {
        if ((you >= 8 || date >= 8) && (you > 2 && date > 2)) {
            return 2;
        }
        if (you == 2 || date == 2) {
            return 0;
        }
        return 1;

    }


    public boolean squirrelPlay(int temp, boolean isSummer) {
        if ((temp >= 60 && temp <= 90) && !isSummer) {
            return true;
        }
        return (temp >= 60 && temp <= 100) && isSummer;
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (!isBirthday) {
            speed += 5;
        }
        if (speed <= 65) {
            return 0;
        }
        if (speed <= 85) {
            return 1;
        }
        return 2;
    }

    public static int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum < 10 || sum > 19) {
            return sum;
        }
        return 20;
    }

    public String alarmClock(int day, boolean vacation) {
        if ((vacation && day == 0) || (vacation && day == 6)) {
            return "off";
        }
        if (vacation || day == 0 || day == 6) {
            return "10:00";
        }
        return "7:00";
    }

    public boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        }
        return a + b == 6 || a - b == 6 || b - a == 6;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        }
        return n >= 1 && n <= 10;
    }

    public boolean specialEleven(int n) {
        return n % 20 == 0 || n % 20 == 1 || n % 20 == 2;
    }

    public boolean old35(int n) {
        return (n % 3 == 0 && n % 5 != 0) || (n % 3 != 0 && n % 5 == 0);
    }

    public static boolean less20(int n) {
        System.out.println(n % 20);
        return n % 20 == 9 || n % 20 == 8;
    }

    public boolean nearTen(int num) {
        return num % 10 <= 2;
    }

    public int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        }
        return a + b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !isAsleep && isMom;
    }

    public int teaParty(int tea, int candy) {
        if (tea >= 5 && candy >= 5) {
            return 1;
        }
        if (((2 * candy) < tea && candy > 5 || ((2 * tea) < candy && tea > 5))) {
            return 2;
        }
        return 0;

    }

    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        }
        if (str.endsWith("b")) {
            return "Buzz";
        }
        return str.startsWith("f") ? "Fizz" : "";
    }

    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }
        if (n % 3 == 0) {
            return "Fizz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        }
        return n + "!";

    }

    public boolean twoAsOne(int a, int b, int c) {
        return (a + b) == c || (a + c) == b || (b + c) == a;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (b > a && c > b) {
            return true;
        }
        return bOk && c > b;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            return a <= b && b <= c;
        }
        return a < b && b < c;
    }

    public boolean lastDigit(int a, int b, int c) {
        return a == c % 10 || a % 10 == c % 10 || a % 10 == c || a == c;
    }

    public boolean lessBy10(int a, int b, int c) {
        return a + 10 <= b || b + 10 <= c || c + 10 <= a;
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            return die1 + die2 + 1;
        }
        return die1 + die2;

    }

    public int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        }
        return a % 5 == b % 5 ? Math.min(a, b) : Math.max(a, b);
    }

    public int redTicket(int a, int b, int c) {
        if (a == b && b == c && a == 2) {
            return 10;
        }
        if (a == b && b == c) {
            return 5;
        }
        if (b != a && c != a) {
            return 1;
        }
        return 0;
    }

    public int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        }
        if (a != b && b != c && a != c) {
            return 0;
        }
        return 10;
    }

    public int blueTicket(int a, int b, int c) {
        if (a + b == 10 || a + c == 10 || b + c == 10) {
            return 10;
        }
        if (a + b + 10 == b + c || a + b + 10 == a + c) {
            return 5;
        }
        return 0;
    }

    public boolean shareDigit(int a, int b) {
        return String.valueOf(b).contains(String.valueOf(a).substring(0, 1)) ||
                String.valueOf(b).contains(String.valueOf(a).substring(1));
    }

    public int sumLimit(int a, int b) {
        int sum = a + b;
        int sumLen = String.valueOf(sum).length();
        int aLen = String.valueOf(a).length();
        int bLen = String.valueOf(b).length();
        if (sumLen == aLen) {
            return sum;
        }
        return a;

    }

    public static boolean makeBricks(int small, int big, int goal) {

        int checkBig = goal / 5;
        if (checkBig <= big) {
            goal -= checkBig * 5;
        } else {
            goal -= big * 5;
        }


        return goal - small <= 0;
    }

    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if (a != b && b != c) {
            sum = a + b + c;
        }
        if (a != b && b == c) {
            sum = a;
        }
        if (a == b && b != c) {
            sum = c;
        }
        if (a == c && a != b) {
            sum = b;
        }
        return sum;
    }

    public int luckySum(int a, int b, int c) {
        int[] ints = new int[]{ a, b, c };
        int sum = 0;
        for (int anInt : ints) {
            if (anInt == 13) {
                break;
            }
            sum += anInt;
        }
        return sum;
    }

    public int noTeenSum(int a, int b, int c) {
        int[] ints = new int[]{ a, b, c };
        int sum = 0;
        for (int anInt : ints) {
            if (anInt >= 13 && anInt <= 19 && anInt != 15 && anInt != 16) {
                continue;
            }
            sum += anInt;
        }
        return sum;
    }

    public int roundSum(int a, int b, int c) {
        int[] ints = new int[]{ a, b, c };
        int sum = 0;
        for (int anInt : ints) {
            if (anInt % 10 > 5) {
                sum += (anInt / 10) * 10 + 10;
                continue;
            }
            sum += (anInt / 10) * 10;

        }
        return sum;
    }

    public boolean closeFar(int a, int b, int c) {
        boolean checkOne = false;
        boolean checkTwo = false;
        if(Math.abs(a-b) == 1 || Math.abs(a-c) == 1){
            checkOne = true;
        }
        if((Math.abs(b-c) >= 2 && Math.abs(b-a) >= 2  )
                || (Math.abs(c-b) >= 2 && Math.abs(c-a) >= 2)
               )
        {
            checkTwo = true;
        }
        return checkOne && checkTwo;
     }


}
