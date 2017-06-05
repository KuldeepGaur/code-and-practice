package account.balance.check;

public class AccountDanger implements Runnable{
    private Account account = new Account();

    public static void main(String[] args) {
        AccountDanger acd = new AccountDanger();
        Thread one = new Thread(acd);
        Thread two = new Thread(acd);
        one.setName("Fred");
        two.setName("Lucy");
        one.start();
        two.start();
    }

    @Override
    public void run() {
        for(int x=0;x<5;x++){
           makeWithDraw(10);
           if(account.getBalance()<10){
               System.out.println("account balance is overdrawn");
           }
        }
    }

    private void makeWithDraw(int amount){
        if(account.getBalance()>=amount){
            System.out.println(Thread.currentThread().getName()+" is going to withdraw");
            try{
                Thread.sleep(500);
            }catch (InterruptedException ex){

            }
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName()+" withdraw completed");
        } else {
            System.out.println("Not enough for account of "+Thread.currentThread().getName()+" to withdraw "+amount);
        }
    }
}
