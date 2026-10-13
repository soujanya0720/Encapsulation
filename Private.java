import java.util.*;
public class Private{
    static class Account{
        private int balance;

        public void setbalance(int b){
            balance = b;
        }
        public int getbalance(){
            return balance;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        Account acc = new Account();
        acc.setbalance(b);
        System.out.println("Balance:"+ acc.getbalance());
        sc.close();

    }
}