public class HelloGC {
    public static int oneAddone(int x,int y){
        return x+y;
    }
    public static void main(String[] args) throws InterruptedException {
//        int res = oneAddone(1,1);
//        System.out.println(res);

        byte[] bytes = new byte[50 * 1024 *1024];
        System.out.println("HelloGC");
//        Thread.sleep(Integer.MAX_VALUE);
    }
}
