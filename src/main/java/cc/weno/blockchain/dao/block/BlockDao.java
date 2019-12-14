package cc.weno.blockchain.dao.block;

import cc.weno.blockchain.dao.block.ContentInfo;
import lombok.Data;

import java.util.List;

/**
 * @Author: xiaohuiduan
 * @Date: 2019/12/13 下午7:50
 * _ooOoo_
 * o8888888o
 * 88" . "88
 * (| -_- |)
 * O\  =  /O
 * ____/`---'\____
 * .'  \\|     |//  `.
 * /  \\|||  :  |||//  \
 * /  _||||| -:- |||||-  \
 * |   | \\\  -  /// |   |
 * | \_|  ''\---/''  |   |
 * \  .-\__  `-`  ___/-. /
 * ___`. .'  /--.--\  `. . __
 * ."" '<  `.___\_<|>_/___.'  >'"".
 * | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 * \  \ `-.   \_ __\ /__ _/   .-` /  /
 * ======`-.____`-.___\_____/___.-`____.-'======
 * `=---='
 * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 * 佛祖保佑       永无BUG
 *
 * 保存数据的block区块
 */
@Data
public class BlockDao {
    /**
     * 上一个block块的hash值
     */
    private String preHash;

    /**
     * merkTree的hash值内容
     */
    private Integer merkHash;

    /**
     * 这个block块的hash
     */
    private String hash;
    /**
     * 时间戳
     */
    private long timeStamp;

    /**
     * 区块链中间保存结点的内容
     */
    private List<ContentInfo> contentInfos;


}
