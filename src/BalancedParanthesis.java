/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.*;

public class BalancedParanthesis {

    class ValidParentheses {

        public static void valid_paren(String input_str) {
            
            Stack<Character> s = new Stack<Character>();
            
            for (char st : input_str.toCharArray()) {
                
                if (st == '(' || st == '{' || st == '[') {
                    s.push(st);
                }
                
                else {
                    if (s.empty()) {
                        System.out.println(input_str + " contains invalid parentheses.");
                        return;
                    }
                    else {
                        char top = (Character) s.peek();
                        if (st == ')' && top == '(' || st == '}' && top == '{' || st == ']' && top == '[') {
                            s.pop();
                        } 
                        else {
                            System.out.println(input_str
                                    + " contains invalid parentheses.");
                            return;
                        }
                    }
                }
            }
            if (s.empty()) {
                System.out.println(input_str + " contains valid parentheses.");
            } else {
                System.out.println(input_str + " contains invalid parentheses.");
            }
        }

        public static void main(String args[]) {
            String input_str1 = "{{}}()[()]";
            String input_str2 = "(][)";
            String input_str3 = ")";
            valid_paren(input_str1);
            valid_paren(input_str2);
            valid_paren(input_str3);
        }
    }

}
