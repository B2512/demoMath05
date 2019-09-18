package b2512.huangsai;

import java.util.Scanner;
// ||：或  一个为真那么就为真   &&：与  同时二个为真那么就是真
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入你的利润：");
        int ont = scan.nextInt();
        if (ont<100000){
            double two = ont*0.1;
            System.out.println(two);
        }else if (ont>=100000 && ont<200000){
            double three = 100000*0.1+(200000-100000)*0.075;
            System.out.println(three);
        }else if (ont>=200000 && ont<400000){
            double four = 100000*0.1+(200000-100000)*0.075+(ont-200000)*0.05;
            System.out.println(four);
        }else if (ont>=400000 && ont<600000){
            double five = 100000*0.1+(200000-100000)*0.075+(400000-200000)*0.05+(ont-400000)*0.03;
            System.out.println(five);
        }else if (ont>=600000 && ont<=1000000){
            double six = 100000*0.1+(200000-100000)*0.075+(400000-200000)*0.05+(600000-400000)*0.03+(ont-600000)*0.015;
            System.out.println(six);
        } else{
            double seven = 100000*0.1+(200000-100000)*0.075+(400000-200000)*0.05+(600000-400000)*0.03+(1000000-600000)*0.015+(ont-1000000)*0.01;
            System.out.println(seven);
        }
    }
}
