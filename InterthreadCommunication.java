class Banker {
    int a = 10000;

    public synchronized void Withdraw(int a) {
        if (a > this.a) {
            System.out.println("Waiting for Deposit");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        } else {
            this.a = this.a - a;
        }
    }

    public synchronized void Deposit(int d) {
        this.a = this.a + d;
    }
}

class InterthreadCommunication extends Thread {
    public static void main(String[] args) {
        Banker b = new Banker();
        new Thread() {
            public void run() {
                b.Withdraw(20000);
            }
        }.start();
        new Thread() {
            public void run() {
                b.Deposit(10000);
            }
        }.start();
    }
}
