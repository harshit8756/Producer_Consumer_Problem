public class company {

    int n ;
    boolean f = false;
    //if f= false - chance to perform Producer
    //if f=true - chance to perform Consumer
    synchronized public void produce_item(int n )
    {
        if (f)
        {
           try {
               wait();
           }
           catch (Exception e)
           {
               e.printStackTrace();
           }
        }
        this.n = n;
        System.out.println("Produce :- " + this.n);
        f=true;
        notify();
    }
    synchronized public int consume_item()
    {
        if(!f)
        {
            try {
                wait();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }
        System.out.println("Consume :- " + this.n);
        f=true;
        notify();
        return this.n;
    }
}
