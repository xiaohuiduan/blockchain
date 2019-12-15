package cc.weno.blockchain.util;

import org.junit.jupiter.api.Test;

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
 * @Date: 2019/12/15 下午3:04
 * @Description:
 */
class RsaKeyUtilTest {

    @Test
    public void test(){
        String s = "hello world";
        CreateRsaKeyUtil createRsaKeyUtil = new CreateRsaKeyUtil();
        EncryptUtil encryptUtil = new EncryptUtil(createRsaKeyUtil.getPublicKey());
        String con = encryptUtil.rsaEncrypt(s);
        DecryptUtil decryptUtil = new DecryptUtil(createRsaKeyUtil.getPrivateKey());
        System.out.println(decryptUtil.rsaDecrypt(con));

    }

}