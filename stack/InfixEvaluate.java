package com.company.coding.stack;

import java.util.Stack;

public class InfixEvaluate {
    public static int operate(int v1,int v2,char op){
        if (op=='+'){
            return v1+v2;
        }
        if (op=='-'){
            return v1-v2;
        }
        if (op=='*'){
            return v1*v2;
        }
        else{
            return v1/v2;
        }
    }
    public static int precedence(char op){
        if (op=='+'){
            return 1;
        }
        if (op=='-'){
            return 1;
        }
        if (op=='*'){
            return 2;
        }
         else{
            return 2;
        }
    }

    public static void main(String[] args) {
        String str = "1+(4/2-1)";
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if (Character.isDigit(ch)){
                operand.push(ch-'0');
            }else if(ch=='('){
                operator.push(ch);
            }else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                while (operator.size()>0&&operator.peek()!='('&&precedence(ch)<precedence(operator.peek())){
                    int v2 = operand.pop();
                    int v1 = operand.pop();
                    char op = operator.pop();
                    int v3 = operate(v1,v2,op);
                    operand.push(v3);
                }
            }else if(ch==')'){

                while(operator.peek()!='('){
                    int v2 = operand.pop();
                    int v1 = operand.pop();
                    char op = operator.pop();
                    int v3 = operate(v1,v2,op);
                    operand.push(v3);
                }
                operand.pop();
            }

        }
        while(operator.size()!=0){
            int v2 = operand.pop();
            int v1 = operand.pop();
            char op = operator.pop();
            int v3 = operate(v1,v2,op);
            operand.push(v3);
        }
        System.out.println(operand.peek());

    }
}
