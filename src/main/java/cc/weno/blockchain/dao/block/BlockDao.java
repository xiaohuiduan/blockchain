package cc.weno.blockchain.dao.block;

import lombok.Data;

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
 * <p>
 * 保存数据的block区块
 */
@Data
public class BlockDao {
    /**
     * 区块的头
     */
    private BlockHeader blockHeader;
    /**
     * 区块的主体部分
     */
    private BlockBody blockBody;

    private String blockHash;


}
