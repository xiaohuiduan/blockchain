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
 * @author: xiaohuiduan
 * @data: 2020/1/14 上午12:56
 * @description: 块区
 */
@Data
public class Block {

    /**
     * 块区的头,保存块区的基本信息
     * version，prehash，merkleTreeHash,timeStamp,区块的序号，公钥
     */
    private BlockHeader blockHeader;

    /**
     * 块区的body
     */
    private BlockBody blockBody;

    /**
     * 块区的hash
     * TODO： 块区的hash是否就是merkleTree的hash，this is a question
     */
//    private String blockHash;

}
