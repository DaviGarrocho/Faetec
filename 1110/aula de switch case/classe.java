/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h;
import java.util.Scanner;
/**
 *
 * @author LAB_ETESC
 */
public class NewClass {
    
 public static void main(String[] args) {
        Scanner davi = new Scanner(System.in);
        System.out.println("calculadora 2");
        System.out.println("O inimigo agora e o mesmo");
        System.out.print("escreva o primeiro numero: ");
        double n1 = davi.nextDouble();
        System.out.println("escreva a operacao| +,-,*,/");
        System.out.print("==> ");
        char op = davi.next().charAt(0);
        
        if(op == '+' || op == '-' || op == '*' || op == '/'){
            
         System.out.print("escreva o segundo numero: ");
        double n2 = davi.nextDouble();
       
        switch (op) {
            case '+':
                System.out.println(n1 + n2);
                break;
                case '-':
                System.out.println(n1 - n2);
                break;
                case '*':
                System.out.println(n1 * n2);
                break;
                case '/':
                System.out.println(n1 / n2);
                break;
            
        }
        }else{
            System.out.println("operacao invalida");
        }           
    }
}
