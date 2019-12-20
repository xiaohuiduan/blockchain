package cc.weno.blockchain.net.vote;


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
 * @data: 2019/12/15 下午7:51
 * @description: PBFT投票的Enum  代表PBFT的几个【状态】！！！！
 */
public enum VoteEnum {

    /**
     * PRE-PREPARE状态
     */
    PRE_PREPARE("节点处于接受消息阶段",100),

    /**
     * 从节点同意主节点请求的编号，并广播
     */
    PREPARE("结点同意主节点请求的编号，并对外广播自己的状态",200),
    /**
     * 从结点进入commit状态
     */
    COMMIT("每个结点收到2f+1个不同结点的commit消息，认为达成一致，进行commit阶段，然后进行持久化",300),
    ;

    /**
     * 投票情况描述
     */
    private String msg;

    /**
     * 投票状态码
     */
    private int code;

    /**
     * 根据状态码返回对应的enum
     * @param code
     * @return
     */
    public static VoteEnum find(int code){
        for (VoteEnum ve:VoteEnum.values()){
            if (ve.code == code){
                return ve;
            }
        }
        return null;
    }

    VoteEnum(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
