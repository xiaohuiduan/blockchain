package cc.weno.blockchain.util;

import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import org.assertj.core.util.Strings;

import java.security.PrivateKey;

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
 * @Date: 2019/12/15 下午2:56
 * @Description: 解密模块
 */
public class DecryptUtil {
    private RSA rsa;
    public DecryptUtil(PrivateKey privateKey) {
        this.rsa = new RSA(privateKey,null);
    }
    public  String rsaDecrypt(String content){
        if (!Strings.isNullOrEmpty(content)){
            return this.rsa.decryptStr(content, KeyType.PrivateKey);
        }
        return null;
    }

}
