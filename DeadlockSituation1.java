class DeadlockSituation1 {
    public static void main(String[] args) {
        final String resource1 = "Pratham";
        final String resource2 = "Kandari";

        Thread t1=new Thread()
        {
            public void run()
            {
                synchronized(resource1)
                {
                    try{
                    Thread.sleep(100);
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                        System.out.println("t2 locked resource");
                    }
                }
                synchronized(resource2)
                {
                    System.out.println("t1 locked resource");
                }
            }
        };
        Thread t2=new Thread()
        {
            public void run()
            {
                synchronized(resource2)
                {
                    System.out.println("t1 locked resource");
                }
                synchronized(resource1)
                {
                    System.out.println("t1 locked resource");
                }
            }
        };
        t1.start();
        t2.start();
    }
}
    