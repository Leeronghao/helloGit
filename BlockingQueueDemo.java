import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/*
* ArrayBlockingQueue:是一个基于数组结构的有界阻塞队列，此队列按FIFO原则对元素进行排序
* LinkedBlockingQueue:是一个基于链表结构的阻塞队列，此队列按FIFO排序元素，吞吐量高于ArrayBlockingQueue
* SynchronousQueue：一个不存储元素的阻塞队列，每个插入操作必须等到另一个线程调用移出操作，否则插入操作一直处于
* 阻塞状态，吞吐量通常要高
*
*
*
* 2.阻塞队列
*   2.1阻塞队列有没有好的一面
*   2.2不得不阻塞，你如何管理
* */
public class BlockingQueueDemo {
    public static void main(String[] args) throws Exception{
//        List list = null;
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        往阻塞队列添加元素
        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("b"));
        System.out.println(blockingQueue.add("c"));
//        System.out.println(blockingQueue.add("d"));

//        从阻塞队列中取出队列头的数据
        System.out.println(blockingQueue.element());
        System.out.println(blockingQueue.element());

        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
//      若没有值则跑出异常  System.out.println(blockingQueue.remove());
//      若没有值就返回null  System.out.println(blockingQueue.poll());
//      若没有值就一直阻塞  System.out.println(blockingQueue.take());
//      若在一定的时间范围内没有获取到值就返回特俗值  System.out.println(blockingQueue.poll(3, TimeUnit.SECONDS));
    }
}
