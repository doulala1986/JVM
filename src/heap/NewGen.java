package heap;

/**
 * Created by doulala on 2017/1/9.
 */
public class NewGen {
    //-Xmx20m -Xms20m -Xmn1m -XX:SurvivorRatio=2 -XX:+PrintGCDetails
    public static void main(String[] args) {

        byte[] b = null;
        for (int i = 0; i < 10; i++) {
            b = new byte[1 * 1024 * 1024];
        }
    }
}
