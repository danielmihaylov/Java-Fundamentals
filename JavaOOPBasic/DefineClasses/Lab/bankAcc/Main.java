package JavaOOPBasic.DefineClasses.Lab.bankAcc;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,BankAccount> accounts = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
       while (!command.equals("End")){

           String[] commandArgs = command.split("\\s+");
           String commandType = commandArgs[0];
           switch (commandType){
               case "Create":
                   BankAccount account = new BankAccount();
                   accounts.put(account.getId(),account);
                   System.out.printf("Account %s created%n",account);
                   break;
               case "Deposit":
                   executeDepositCommand(accounts, commandArgs);
                   break;
               case "SetInterest":
                    BankAccount.setInterestRate(Double.parseDouble(commandArgs[1]));
                   break;
               case "GetInterest":
                    executeInterestCommand(accounts,commandArgs);
                   break;
               case "Print":
                   break;
           }
           command = scanner.nextLine();
       }
    }

    private static void executeDepositCommand(HashMap<Integer, BankAccount> accounts, String[] commandArgs) {
        int id = Integer.parseInt(commandArgs[1]);
        if (!accounts.containsKey(id)){
            System.out.println("Account does not exist");
        }else{
            int amount = Integer.parseInt(commandArgs[2]);
            BankAccount account = accounts.get(id);
            accounts.get(id).deposit(amount);
            System.out.printf("Deposited %d to %s%n",amount,account);
        }
    }

    private static void executeInterestCommand(HashMap<Integer, BankAccount> accounts, String[] commandArgs) {
        int id = Integer.parseInt(commandArgs[1]);
        if (!accounts.containsKey(id)){
            System.out.println("Account does not exist");
        }else{
            double amount = Integer.parseInt(commandArgs[2]);
            System.out.printf("%.2f%n",accounts.get(Integer.parseInt(commandArgs[1])).getInterestRate(Integer.parseInt(commandArgs[2])));
        }
    }
}
