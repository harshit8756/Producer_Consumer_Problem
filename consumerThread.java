public class consumerThread extends Thread{
    company c;
    consumerThread(company c)
    {
        this.c=c;
    }

    public void run()
    {
       while(true)
       {
           this.c.consume_item();
           try {
               Thread.sleep(2000);

           } catch (Exception e)
           {
               e.printStackTrace();
           }
       }
    }
}
