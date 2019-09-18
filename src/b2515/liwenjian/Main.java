package b2515.liwenjian;

import java.util.Scanner;
public class Main {
    public  static void main(String[]args){

        Scanner Profit=new Scanner(System.in);
        System.out.println("请输入当月的利润:");
        double Month=Profit.nextDouble();
        if (Month<=100000)
        {
            System.out.println(Month*0.1);
        }else if ( Month>100000&&Month<=200000){
            System.out.println(100000*0.1+(Month-100000)*0.075);
        }else if (Month>200000&&Month<=400000){
            System.out.println(100000*0.1+100000*0.075+(Month-200000)*0.05);
        }else if (Month>400000&&Month<=600000){
            System.out.println(100000*0.1+100000*0.075+200000*0.05+(Month-400000)*0.03);
        }else if (Month>600000&&Month<=1000000){
            System.out.println(100000*0.1+100000*0.075+200000*0.05+200000*0.03+(Month-600000)*0.015);
        }else if (Month>1000000){
            System.out.println(100000*0.1+100000*0.075+200000*0.05+200000*0.03+400000*0.015+(Month-1000000)*0.01);
        }
        
    }
}
