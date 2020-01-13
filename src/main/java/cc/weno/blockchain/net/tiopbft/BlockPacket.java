package cc.weno.blockchain.net.tiopbft;


import lombok.Data;
import org.tio.core.intf.Packet;

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
 * @data: 2020/1/14 上午2:06
 * @description: 服务器packet
 */
@Data
public class BlockPacket extends Packet {

    /**
     * 传输内容的字节
     */
    private byte[] body;

    /**
     * 消息头的长度
     */
    public static final int HEADER_LENGTH= 4;

    /**
     * 字符的编码方式
     */
    public static final String CHARSET = "utf-8";
}
