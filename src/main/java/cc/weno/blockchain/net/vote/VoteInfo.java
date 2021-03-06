package cc.weno.blockchain.net.vote;

import cc.weno.blockchain.dao.block.Block;
import cc.weno.blockchain.dao.block.BlockBody;
import cc.weno.blockchain.dao.block.ContentInfo;
import lombok.Data;

import java.util.List;

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
 * @data: 2019/12/15 下午9:03
 * @description: 投票的信息类
 *
 * 投票的实体类需要：实际上也就是进行的内容
 */
@Data
public class VoteInfo {
    /**
     * 目前投票的状态
     */
    private int code;
    /**
     * 投票的内容，投票的时候，直接将整个block的内容进行投票。
     */
    private List<Block> msg;

    // 为了保证安全，我们需要使用签名和证书，其中这个鸡儿玩意通过ca实现。
    /**
     * 签名
     */
    private String sign;

    /**
     * 数字证书
     */
    private String digitalCert;

}
