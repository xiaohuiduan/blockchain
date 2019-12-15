package cc.weno.blockchain.dao.block;

import lombok.Data;

import java.security.PublicKey;

/**
 * @Author: xiaohuiduan
 * @Date: 2019/12/14 下午5:47
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
 * 区块链的交易内容
 */
@Data
public class ContentInfo {
    /**
     * 公钥
     */
    private PublicKey publicKey;
    /**
     * 交易的时间戳
     */
    private long timeStamp;
    /**
     * 交易的内容
     */
    private String jsonContent;
    /**
     * 交易的hash
     */
    private String hash;

    /**
     * 签名
     */
    private String sign;
}
