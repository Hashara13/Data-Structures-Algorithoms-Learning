/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.*;

public class Bracket {

    public static void main(String[] args) {
        String str = "{()}[]";
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) { // push 1st if have
            if (str.charAt(i) == '{' || str.charAt(i) == '{' || str.charAt(i) == '{') {
                s.push(str.charAt(i));
            } else if (!s.empty() && ((str.charAt(i) == '}' && s.peek() == '{')
                    || (str.charAt(i) == ')' && s.peek() == '(')
                    || (str.charAt(i) == ']' && s.peek() == '['))) {
                s.pop();
            } else {
                s.push(str.charAt(i));
            }
        }
        if (s.empty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }

}
