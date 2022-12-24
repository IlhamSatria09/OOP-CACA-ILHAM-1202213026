public class Waiters implements Runnable {
    private final int orderQty;
    private final int CustomerID;
    static int foodPrice = 30000;

    public Waiters (int orderQty, int CustomerID) {
        this.orderQty = orderQty;
        this.CustomerID = CustomerID;
    }

    @Override
    public void run() {
        while (true) {
            getFood() ;
            try{
                Thread.sleep(15000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void OrderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID: " + this.CustomerID);
        System.out.println("Numbeer of Food: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty * foodPrice);
        System.out.println("==========================================================");
    }

    private void getFood() {
        synchronized(Restaurant.getLock()){
            System.out.println("Waiter: Food is ready to deliver");
            Restaurant Restaurant = new Restaurant();
            Restaurant.setWaitingForPickup(false);

            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                OrderInfo();
                System.exit(0);
            }

            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the Restaurant to make another Food\n");
        }
    }
}