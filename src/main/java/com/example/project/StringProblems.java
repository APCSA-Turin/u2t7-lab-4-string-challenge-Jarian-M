package com.example.project;

public class StringProblems{
    //empty constructor
    public StringProblems(){}

    // Given a string, return true if it ends in "ly".
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    public boolean endsLy(String x){
        //implement code here
        if(x.indexOf("ly") != -1) {
            return true;
        } else {
            return false;
        }
    }

    // Given two strings, append them together (known as "concatenation") 
    // and return the result. However, if the concatenation creates a double-char, 
    // then omit one of the chars, so "abc" and "cat" yields "abcat".
    // conCat("abc", "cat") → "abcat"
    // conCat("dog", "cat") → "dogcat"
    // conCat("abc", "") → "abc"
    public String conCat(String s1, String s2){
        //implement code here
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 == 0) {
            return s2;
        } 
        if(len2 == 0) {
            return s1;
        }
        String lastLet1 = s1.substring(len1 - 1, len2);
        String firstLet2 = s2.substring(0, 1);
        String noFirst2 = s2.substring(1);
        if(lastLet1.equals(firstLet2)) {
            return s1 + noFirst2;
        } else {
            return s1 + s2;
        }
    }

    // Given a string, return a version without the first 2 chars. 
    // Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
    // The string may be any length. Harder than it looks.
    // deFront("Hello") → "llo"
    // deFront("java") → "va"
    // deFront("away") → "aay"
    public String deFont(String s1){
        //implement code here
        String firstLet = s1.substring(0, 1);
        String secondLet = s1.substring(1, 2);
        String noFirst = s1.substring(1);
        String noFirstOrSec = s1.substring(2);
        if(firstLet.equals("a")) {
            if(secondLet.equals("b")) {
                return s1;
            }
        }
        if(firstLet.equals("a")) {
            return firstLet + noFirstOrSec;
        } else {
            if(secondLet.equals("b")) {
                return noFirst;
            } else { 
                return noFirstOrSec;
            }
        }
    }

    
    // Given a string, if the first or last chars are 'x', 
    // return the string without those 'x' chars, and otherwise 
    // return the string unchanged.
    // withoutX("xHix") → "Hi"
    // withoutX("xHi") → "Hi"
    // withoutX("Hxix") → "Hxi"
    public String withoutX(String s1){
        int len1 = s1.length();
        String lastX = s1.substring(len1 - 1, len1);
        String firstX = s1.substring(0, 1);
        String noFirstX = s1.substring(1);
        String noLastX = s1.substring(0, len1 - 1);
        String noFirstOrLast = s1.substring(1, len1 - 1);
        if(firstX.equals("x")) {
            if(lastX.equals("x")) {
                return noFirstOrLast;
            } else {
                return noFirstX;
            }
        }
        if(lastX.equals("x")) {
            return noLastX;
        } else {
            return s1;
        }
    }

    // Given a string str, if the string starts with "f" return "Fizz".
    //  If the string ends with "b" return "Buzz". If both the "f" and "b" 
    //  conditions are true, return "FizzBuzz". In all other cases, return the 
    //  string unchanged. (See also: FizzBuzz Code)
    // fizzString("fig") → "Fizz"
    // fizzString("dib") → "Buzz"
    // fizzString("fib") → "FizzBuzz"
    public String fizzString(String s1){
        int len = s1.length();
        String firstF = s1.substring(0,1);
        String lastB = s1.substring(len - 1, len);
        if(firstF.equals("f")) {
            if(lastB.equals("b")) {
                return "FizzBuzz";
            }
        }
        if(firstF.equals("f")) {
            return "Fizz";
        } else {
            if(lastB.equals("b")) {
                return "Buzz";
            } else {
                return s1;
            }
        }
    }

    // Given an int n, return the string form of the number followed 
    // by "!". So the int 6 yields "6!". Except if the number is 
    // divisible by 3 use "Fizz" instead of the number, and if the 
    // number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
    //  Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
    //   What will the remainder be when one number divides evenly into another? 
    // fizzString2(1) → "1!"
    // fizzString2(2) → "2!"
    // fizzString2(3) → "Fizz!"
    public String fizzString2(int x){
        String num = String.valueOf(x);
        if(x % 3 == 0) {
            if(x % 5 == 0) {
                return "FizzBuzz!";
            }
        }
        if(x % 3 == 0) {
            return "Fizz!";
        } else {
            if(x % 5 == 0) {
                return "Buzz!";
            } else {
                return num + "!";
            }
        }
    }
}