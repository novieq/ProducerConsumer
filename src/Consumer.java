import java.util.concurrent.BlockingQueue;


/**
 * @author sayghosh
 *
 */
public class Consumer implements Runnable{

    BlockingQueue<Message> q;
    public Consumer(BlockingQueue<Message> q) {
        this.q = q;
    }
    @Override
    public void run() {
        Message m;
        System.out.println("Consumer is running");
        try {
            while((m=q.take()).getMsg() != "Exit") {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("Consumed" + m.getMsg());
            }
            System.out.println("Consumed" + m.getMsg());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
