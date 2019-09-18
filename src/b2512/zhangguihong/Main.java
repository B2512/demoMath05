package b2512.zhangguihong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double bonus=0;
        System.out.println("企业发放的利润是:");
        double profit=scan.nextInt();
        if(profit<=100000){
            bonus=profit*0.1;
        }else if(profit>=100000&&profit<200000)
        {
            bonus=100000*0.1+(profit-100000)*0.075;
        }else if(profit>=200000&&profit<400000)
        {
            bonus=100000*0.1+(200000-100000)*0.075+(profit-200000)*0.05;
        }else if(profit>=400000&&profit<600000)
        {
            bonus=100000*0.1+(200000-100000)*0.075+(400000-200000)*0.05+(profit-400000)*0.03;
        }else if(profit>=600000&&profit<=1000000)
        {
            bonus=100000*0.1+(200000-100000)*0.075+(400000-200000)*0.05+(600000-400000)*0.03+(profit-600000)*0.015;
        }else{
            bonus=100000*0.1+(200000-100000)*0.075+(400000-200000)*0.05+(600000-400000)*0.03+(1000000-600000)*0.015+(profit-1000000)*0.01;
        }
        System.out.println(bonus);
    }
}
