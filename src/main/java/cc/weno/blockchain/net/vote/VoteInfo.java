package cc.weno.blockchain.net.vote;

import cc.weno.blockchain.dao.block.BlockBody;
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

    private RequestMsg requestMsg;
    
    /**
     * 投票的内容
     */
    private List<BlockBody> list;

    private String hash;

}
