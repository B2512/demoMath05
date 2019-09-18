package b2512.wuzhangjie;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double bonus = 0;
        System.out.print("请你输入当月的利润:");
        double profit = new Scanner(System.in).nextDouble();
        if (profit<=100000){//低于等于10万的部分按10%提成
            bonus = bonus + profit * 0.1;
        }else if (profit>=100000 && profit<200000){//低于等于10万的部分按10%提成 高于10万元的部分,可提成7.5%
            bonus = bonus + 100000 * 0.1 + (profit - 100000) * 0.075;
        }else if (profit>=200000 && profit<400000){
            //低于等于10万的部分按10%提成 高于10万元的部分,可提成7.5% 高于20万元的部分,可提成5%
            bonus = bonus + 100000 * 0.1 + (200000 - 100000) * 0.075 + (profit-200000) * 0.05;
            System.out.println(bonus);
        }else if (profit>=400000 && profit<600000){
            //低于等于10万的部分按10%提成 高于10万元的部分,可提成7.5% 高于20万元的部分,可提成5% 高于40万元的部分,可提成3%
            bonus = bonus + 100000 * 0.1 + (200000 - 100000) * 0.075 + (400000-200000) * 0.05 + (profit-400000) * 0.03;
            System.out.println(bonus);
        }else if (profit>=600000 && profit<=1000000){
            //低于等于10万的部分按10%提成 高于10万元的部分,可提成7.5% 高于20万元的部分,可提成5% 高于40万元的部分,可提成3%
            // //高于60万元的部分,可提成1.5%
            bonus = bonus + 100000 * 0.1 + (200000 - 100000) * 0.075 +
                    (400000-200000) * 0.05 + (600000-400000) * 0.03 + (profit-600000) * 0.015;
            System.out.println(bonus);
        }else{
            //低于等于10万的部分按10%提成 高于10万元的部分,可提成7.5% 高于20万元的部分,可提成5% 高于40万元的部分,可提成3%
            //高于60万元的部分,可提成1.5% 高于100万元的部分,可提成1%
            bonus = bonus + 100000 * 0.1 + (200000 - 100000) * 0.075 +
                    (400000-200000) * 0.05 + (600000-400000) * 0.03 + (1000000-600000) * 0.015 + (profit-1000000) * 0.01;
        }
        System.out.print("当月的利润是:"+profit+"。你的奖金是:"+bonus);
    }
}
