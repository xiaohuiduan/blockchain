package cc.weno.blockchain.util;

import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import org.assertj.core.util.Strings;

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
 * @Author: xiaohuiduan
 * @Date: 2019/12/15 下午2:39
 * @Description: 加密模块
 */
public class EncryptUtil {

    public EncryptUtil(PublicKey publicKey) {
        this.rsa = new RSA(null,publicKey);
    }
    private RSA rsa;


    /**
     * 进行公钥加密
     * @param content 加密前的内容
     * @return 返回加密的数据
     */
    public  String rsaEncrypt(String content){
        if (!Strings.isNullOrEmpty(content)){
            return this.rsa.encryptBcd(content, KeyType.PublicKey);
        }
        return null;
    }


}
