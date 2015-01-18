import java.util.Queue;
import java.util.concurrent.BlockingQueue;


/**
 * @author sayghosh
 *
 */
public class Producer implements Runnable{

    BlockingQueue<Message> q;
    public Producer(BlockingQueue<Message> q) {
        this.q = q;
    }
    @Override
    public void run() {
        System.out.println("Producer is running");
        for(int i=0;i<10;i++) {
            Message m = new Message("" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Produced" + m.getMsg());
            q.add(m);
        }
        q.add(new Message("Exit"));
    }

}
