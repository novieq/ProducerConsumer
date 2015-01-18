import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


/**
 * @author sayghosh
 *
 */
public class ProducerConsumerService {
    public static void main(String[] args) {
        BlockingQueue<Message> q = new ArrayBlockingQueue<Message>(50) ;
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);
        System.out.println("Producer and Consumer has been started");
        new Thread(producer).start();
        new Thread(consumer).start();
        
    }
}
