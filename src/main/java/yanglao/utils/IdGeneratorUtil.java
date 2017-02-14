package yanglao.utils;

/**
 * id生成器
 * Created by zzw on 2017/1/22.
 */
public class IdGeneratorUtil {

    private static final long LIMIT = 10000000000L;

    private static long last = 0;

    private IdGeneratorUtil() {

    }


    public static long getID() {
        // 10 digits.
        long id = System.currentTimeMillis() % LIMIT;
        synchronized (IdGeneratorUtil.class) {
            while (id <= last) {
                id = (last + 1) % LIMIT;
            }
        }
        return last = id;
    }
}
