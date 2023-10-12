public class producerThread extends Thread{

    company c;
    // create Constructor
    producerThread(company c)
    {
        this.c = c;
    }

    public void run()
    {
        int i =1;
        while (true)
        {
            this.c.produce_item(i);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

            i++;
        }

    }
}
