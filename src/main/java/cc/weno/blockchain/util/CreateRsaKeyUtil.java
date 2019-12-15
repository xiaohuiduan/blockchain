package cc.weno.blockchain.util;

import cn.hutool.crypto.asymmetric.RSA;

import java.security.PrivateKey;
import java.security.PublicKey;

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
 * @author : xiaohuiduan
 * @date : 2019/12/15 下午2:41
 * @deprecated : 创造公钥和私钥模块
 */
public class CreateRsaKeyUtil {

    private PublicKey publicKey;
    private PrivateKey privateKey;
    private RSA rsa;
    public CreateRsaKeyUtil() {
        rsa = new RSA();
        publicKey = rsa.getPublicKey();
        privateKey = rsa.getPrivateKey();
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public PrivateKey getPrivateKey() {
        return privateKey;
    }
}
