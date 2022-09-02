package com.smallchangesys;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class SystemFunction {
    ArrayList<Ewallet> lst = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void displayEwallet(){
        System.out.println("\n=================1.钱包明细=================");
        int n = lst.size();

        if (n == 0) {
            System.out.println("没有交易记录");
        }else {
            for (Ewallet ele:lst) {
                System.out.println(ele);
            }
        }
    }

    public void createIncomeRecord(Ewallet anRecord){
        System.out.println("\n=================2.收益入账=================");
        anRecord.setName("收益入账");
        System.out.println("请输入入账金额：");
        double money = scan.nextDouble();
        anRecord.setMoney(money);
        Date time = new Date();
        anRecord.setTime(time);
        double balance = 0;
//        for (Ewallet ele:lst) {
//            balance += ele.getBalance();
//        }
        int len = lst.size();
        if (len > 0) {
            balance = lst.get(len-1).getBalance()+money;
        }else {
            balance = money;
        }
        anRecord.setBalance(balance);
        lst.add(anRecord);
    }


    public void createSpendRecord(Ewallet anRecord) {
        System.out.println("\n=================3.消费输入=================");
        System.out.println("请输入消费商家：");
        String name = scan.next();
        anRecord.setName(name);
        System.out.println("请输入消费金额：");
        double cost = scan.nextDouble();
        anRecord.setMoney(cost);
        Date time = new Date();
        anRecord.setTime(time);

        int len = lst.size();
        double balance = 0;
        if (len == 0 || lst.get(len - 1).getBalance() < cost) {
            System.out.println("余额不足。");
            return;
        } else {
            balance = lst.get(len - 1).getBalance() - cost;
        }

        anRecord.setBalance(balance);
        lst.add(anRecord);
    }

    public void exitMethod(){
        System.out.println("Hint: 你的输入有误，请确保输入是菜单序号。");
        System.out.println("是否退出系统Y/N：");

        String exitSymbol = scan.next();
        while (true){
            if (exitSymbol.equalsIgnoreCase("Y")) {
                return;
            } else if (exitSymbol.equalsIgnoreCase("N")) {
                break;
            }
            System.out.println("是否退出系统Y/N：");
            exitSymbol = scan.next();
        }
    }
}
