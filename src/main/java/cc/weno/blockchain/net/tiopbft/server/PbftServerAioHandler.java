package cc.weno.blockchain.net.tiopbft.server;

import cc.weno.blockchain.net.tiopbft.BlockPacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.core.TioConfig;
import org.tio.core.exception.AioDecodeException;
import org.tio.core.intf.Packet;
import org.tio.server.intf.ServerAioHandler;

import java.nio.ByteBuffer;

/**
 * //                            _ooOoo_
 * //                           o8888888o
 * //                           88" . "88
 * //                           (| -_- |)
 * //                            O\ = /O
 * //                        ____/`---'\____
 * //                      .   ' \\| |// `.
 * //                       / \\||| : |||// \
 * //                     / _||||| -:- |||||- \
 * //                       | | \\\ - /// | |
 * //                     | \_| ''\---/'' | |
 * //                      \ .-\__ `-` ___/-. /
 * //                   ___`. .' /--.--\ `. . __
 * //                ."" '< `.___\_<|>_/___.' >'"".
 * //               | | : `- \`.;`\ _ /`;.`/ - ` : | |
 * //                 \ \ `-. \_ __\ /__ _/ .-` / /
 * //         ======`-.____`-.___\_____/___.-`____.-'======
 * //                            `=---='
 * //
 * //         .............................................
 * //                  佛祖镇楼           BUG辟易
 *
 * @author: xiaohuiduan
 * @data: 2020/1/14 上午2:23
 * @description: pbft服务端的handler
 */
public class PbftServerAioHandler implements ServerAioHandler {

    /**
     * 日志记录
     */
    private Logger logger = LoggerFactory.getLogger(PbftServerAioHandler.class);


    /**
     * 根据ByteBuffer解码成业务需要的Packet对象.
     * 消息结构：消息头 + 消息体。
     * 头：4 byte 表示消息的长度
     * 体：json字符串的byte
     * <p>
     * 如果收到的数据不全，导致解码失败，请返回null，在下次消息来时框架层会自动续上前面的收到的数据
     *
     * @param buffer         参与本次希望解码的ByteBuffer
     * @param limit          ByteBuffer的limit
     * @param position       ByteBuffer的position，不一定是0哦
     * @param readableLength ByteBuffer参与本次解码的有效数据（= limit - position）
     * @param channelContext
     * @return
     * @throws AioDecodeException
     */
    @Override
    public Packet decode(ByteBuffer buffer, int limit, int position, int readableLength, ChannelContext channelContext) throws AioDecodeException {
        if (readableLength < BlockPacket.HEADER_LENGTH) {
            return null;
        }

        // 消息体的长度
        int bodyLength = buffer.getInt();

        if (bodyLength < 0) {
            throw new AioDecodeException(String.format("bodyLength 错误[%s],client是：%s", bodyLength, channelContext.getClientNode()));
        }

        // 本次需要的长度
        int needLength = BlockPacket.HEADER_LENGTH + bodyLength;

        // 组包需要的长度
        int isDataEnough = readableLength - needLength;

        // 收到的消息是否大于组包的消息
        if (isDataEnough < 0) {
            return null;
        } else {
            BlockPacket packet = new BlockPacket();
            if (bodyLength > 0) {
                byte[] dst = new byte[bodyLength];
                packet.setBody(dst);
            }
            return packet;
        }
    }

    /**
     * 编码
     *
     * @param packet
     * @param tioConfig
     * @param channelContext
     * @return
     * @author: tanyaowu
     */
    @Override
    public ByteBuffer encode(Packet packet, TioConfig tioConfig, ChannelContext channelContext) {

        BlockPacket sendPacket = (BlockPacket) packet;
        byte[] body = sendPacket.getBody();
        int bodyLen = 0;

        if (body != null) {
            bodyLen = body.length;
        }
        // 发送消息需要的长度
        int sendLen = bodyLen + BlockPacket.HEADER_LENGTH;
        ByteBuffer buffer = ByteBuffer.allocate(sendLen);
        // 设置字节的顺序
        buffer.order(tioConfig.getByteOrder());
        // 写入消息的长度
        buffer.putInt(bodyLen);

        if (body != null){
            buffer.put(body);
        }
        return buffer;
    }



    /**
     * 处理消息包
     * 这个是最重要的，因为这个就是pbft算法的精髓所在
     * @param packet
     * @param channelContext
     * @throws Exception
     * @author: tanyaowu
     */
    @Override
    public void handler(Packet packet, ChannelContext channelContext) throws Exception {

    }
}
