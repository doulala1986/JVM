package heap;

import java.util.Vector;

/**
 * Created by doulala on 2017/1/10.
 */
public class OutOfMemoryDump {
    //HeapDumpOnOutOfMemoryError 导出堆信息
    //HeapDumpPath 输出文件路径，可以通过MAT等工具打开
    //-Xmx20m -Xms20m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./a.dump
    public static void main(String[] args) {

        Vector v=new Vector();
        for (int i = 0; i < 30; i++) {
           v.add(new byte[1 * 1024 * 1024]);
        }
    }
}
