package cc.weno.blockchain.db;

import org.assertj.core.util.Strings;
import org.iq80.leveldb.DB;
import org.iq80.leveldb.DBFactory;
import org.iq80.leveldb.DBIterator;
import org.iq80.leveldb.Options;
import org.iq80.leveldb.impl.Iq80DBFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.Map;

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
 * @Date: 2019/12/15 下午6:34
 * @Description: 数据库的操作类
 */
public class LeveldbDao {
    /**
     * 日志记录
     */
    private Logger logger = LoggerFactory.getLogger(LeveldbDao.class);

    /**
     * LevelDB的对象
     */
    private DB db;

    /**
     * 该操作会在类实例化之后进行自动化调用
     */
    @PostConstruct
    public void init(){
        DBFactory factory = new Iq80DBFactory();
        Options options = new Options();
        options.createIfMissing(true);
        // 配置目录
        String path = "./leveldb";
        try {
            db = factory.open(new File(path),options);
            this.put("hello","world");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 插入数据
     * @param key
     * @param value
     */
    public void put(String key,String value){
        System.out.println("插入数据");
        if (Strings.isNullOrEmpty(key) || Strings.isNullOrEmpty(value)){
            return;
        }
        db.put(Iq80DBFactory.bytes(key),Iq80DBFactory.bytes(value));
    }

    /**
     * 获得数据
     * @param key
     * @return
     */
    public String get(String key){
        if (Strings.isNullOrEmpty(key)){
            return null;
        }
        byte[] value = db.get(Iq80DBFactory.bytes(key));
        return Iq80DBFactory.asString(value);
    }

    public void getAllDatas(){
        DBIterator iterator = db.iterator();
        while (iterator.hasNext()){
            Map.Entry<byte[], byte[]> next = iterator.next();
            String key = Iq80DBFactory.asString(next.getKey());
            String value = Iq80DBFactory.asString(next.getValue());
            logger.info("get all datas,key = "+key+" ;value = "+value);
        }
    }
}
