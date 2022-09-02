package com.smallchangesys;

import java.util.Scanner;

public class App {
    Interface anInterface = new Interface();
    SystemFunction func = new SystemFunction();

    public void startSys(){
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            Ewallet ewallet = new Ewallet();
            anInterface.mainMenu();
            int option = scan.nextInt();
            switch(option){
                case 1 :
                    func.displayEwallet();
                    break;
                case 2 :
                    func.createIncomeRecord(ewallet);
                    break;
                case 3 :
                    func.createSpendRecord(ewallet);
                    break;
                case 4 :
                    System.out.println("\n感谢您使用零钱通系统，再见");
                    flag = false;
                    break;
                default:
                    func.exitMethod();
            }
        }
    }
}
