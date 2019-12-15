package cc.weno.blockchain.dao.block;

import lombok.Data;

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
 * @Author: xiaohuiduan
 * @Date: 2019/12/14 下午7:21
 * @Description: 区块的头
 */
@Data
public class BlockHeader {
    /**
     * 区块的版本
     */
    private Integer version;

    /**
     * 上一个block块的hash值
     */
    private String preHash;

    /**
     * merkleTree 的hash值
     */
    private Integer merkleTreeHash;

    /**
     * 本区块产生的时间戳
     */
    private long timeStamp;

    /**
     * 本块的序号
     */
    private Integer number;

    /**
     * 本块的公钥
     */
    private String publicKey;

}
