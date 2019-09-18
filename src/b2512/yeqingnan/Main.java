package b2512.yeqingnan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入当月利润:");
        double profit = sc.nextDouble();
        double bonus = 0;
        if (profit <= 100000) {
            //低于或等于10万元的部分按10%提成
            bonus = profit * 0.1;
        } else if (profit >= 100000 && profit < 200000) {
            //低于10万元的部分按10%提成,高于10万元的部分，可提成7.5%
            bonus = 100000 * 0.1 + (profit - 100000) * 0.075;
        } else if (profit >= 200000 && profit < 400000) {
            //高于20万元的部分，可提成5%
            bonus = 100000 * 0.1 + (200000 - 100000) * 0.075 + (400000 - 200000) * 0.05;
        } else if (profit >= 400000 && profit < 600000) {
            //高于40万元的部分，可提成3%
            bonus = 100000 * 0.1 + (200000 - 100000) * 0.075 + (400000 - 200000) * 0.05 + (600000 - 400000) * 0.03;
        }  else if (profit >= 600000 && profit <= 1000000) {
            //高于60万元的部分，可提成1.5%
            bonus = 100000 * 0.1 + (200000 - 100000) * 0.075 + (400000 - 200000) * 0.05 + (600000 - 400000) * 0.03 + (profit - 600000) * 0.015;
        } else {
            //超过100万元的部分按1%提成
            bonus = 100000 * 0.1 + (200000 - 100000) * 0.075 + (400000 - 200000) * 0.05 + (600000 - 400000) * 0.03 + (1000000 - 600000) * 0.015 + (profit - 1000000) * 0.01;
        }
        System.out.println("应发放奖金：" + bonus);
    }
}
