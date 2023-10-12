public class mainClass {
    public static void main(String[] args) {

        // create the company object
        company c = new company();
        // create object of the two thread
        producerThread ph = new producerThread(c);
        consumerThread ch = new consumerThread(c);

        // now we start the thread
        ph.start();
        ch.start();
    }
}
