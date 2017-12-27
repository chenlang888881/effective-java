package basics.socket.serial;

import io.netty.channel.ChannelOutboundBuffer;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/**
 * Created by chenlang on 2017/12/16.
 */
public class Test1 {

    /**
     * 0011 0001
     * 0111 1111
     *
     * 0011 0001
     *
     * 1000 0000
     * @param args
     */

    public static void main(String[] args) {
        int id = 101;
        int age = 21;
        ByteArrayOutputStream arrayOutputStream =
                new ByteArrayOutputStream();

        ByteBuffer buffer = ByteBuffer.allocate(8);
        buffer.putInt(3);
        buffer.array();
    }

    public static byte[] int2bytes(int i){
        byte[] bytes = new byte[4];
        bytes[0] = (byte)(i >> 3*8);
        bytes[1] = (byte)(i >> 2*8);
        bytes[2] = (byte)(i >> 1*8);
        bytes[3] = (byte)(i >> 0*8);
        return bytes;
    }

    public static int bytes2int(byte[] bytes){
        return (bytes[0] << 3*8)|
                (bytes[1] << 2*8)|
                (bytes[2] << 1*8)|
                (bytes[3] << 0*8);
    }
}
