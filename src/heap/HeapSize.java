package heap;

/**
 * Created by doulala on 2017/1/9.
 */
public class HeapSize {
    //    -Xmx20m
//    -Xms5m
//    -XX:+PrintCommandLineFlags
//    -XX:+PrintGCDetails
//    -XX:+UseSerialGC
//    当-Xmx 与Xms一致时，可以减少程序运行时进行的垃圾回收次数，提高性能
    public static void main(String[] args) {
        memoryStatus();

        byte[] b = new byte[1 * 1024 * 1024];
        System.out.println("分配了1M空间");
        memoryStatus();//未超过freeMemory，totalMemory不变

        byte[] b4 = new byte[4 * 1024 * 1024];
        System.out.println("分配了4M空间");
        memoryStatus();//超过freeMemory，动态扩展，totalMemory增加


//        byte[] b21 = new byte[21 * 1024 * 1024];
//        System.out.println("分配了21M空间");
//        memoryStatus();
    }


    private static void memoryStatus() {
        System.out.println("maxMemory:" + Runtime.getRuntime().maxMemory() + "byte");
        System.out.println("freeMemory:" + Runtime.getRuntime().freeMemory() + "byte");
        System.out.println("totalMemory:" + Runtime.getRuntime().totalMemory() + "byte");
    }
}
