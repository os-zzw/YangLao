package yanglao.config;

/**
 * Created by Mr.Jadyn on 2016/12/29.
 */
public final class Error {

    public static final int SUCCEESS = 100000;
    public static final String SUCCESS_MSG = "ok";

    public static final int SERVER_ERROR = 100010;
    public static final String SERVER_ERROR_MSG = "服务器未知异常";

    public static final int PARAM_ERROR = 100020;
    public static final String PARAM_ERROR_MSG = "客户端参数错误";

    public static final int ILLEGAL_OPENID_ERROR=100030;
    public static final String ILLEGAL_OPENID_ERROR_MSG="传入非法的openid";

    public static final int OPENID_APPID_MATCH_ERROR=100040;
    public static final String OPENID_APPID_MATCH_ERROR_MSG="传入的openid不属于此appid";

    public static final int MYSQL_ERROR=100050;
    public static final String MYSQL_ERROR_MSG="数据库存储失败";

    /*********************************消息管理模块(02)***************************************/



    /*********************************粉丝模块(03)***************************************/


    public static final int NULL_FANS_ERROR=103010;
    public static final String NULL_FANS_ERROR_MSG="粉丝信息为空";

    public static final int TOO_MUCH_OPEN_ID_ERROR=103020;
    public static final String TOO_MUCH_OPEN_ID_ERROR_MSG="每次传入的openid列表个数不能超过50个";

    public static final int ILLEGAL_TAG_ERROR=103030;
    public static final String ILLEGAL_TAG_ERROR_MSG="非法的标签";

    public static final int TOO_MUCH_TAG_ERROR=103040;
    public static final String TOO_MUCH_TAG_ERROR_MSG="有粉丝身上的标签数已经超过限制";

    public static final int ILLEGAL_TAG_NAME_ERROR=103050;
    public static final String ILLEGAL_TAG_NAME_ERROR_MSG="标签名非法，请注意不能和其他标签重名";

    public static final int TAG_NAME_TOO_LONG_ERROR=103060;
    public static final String TAG_NAME_TOO_LONG_ERROR_MSG="标签名长度超过30个字节";

    public static final int CREATE_TOO_MUCH_TAG_ERROR=103070;
    public static final String CREATE_TOO_MUCH_TAG_ERROR_MSG="创建的标签数过多，请注意不能超过100个";

    public static final int TAG_PERMISSION_ERROR=103070;
    public static final String TAG_PERMISSION_ERROR_MSG="不能修改0/1/2这三个系统默认保留的标签";

    public static final int DELETE_ERROR=103080;
    public static final String DELETE_ERROR_MSG="该标签下粉丝数超过10w，不允许直接删除";

    public static final int ADD_BLACK_ONCE_20_ERROR=103090;
    public static final String ADD_BLACK_ONCE_20_ERROR_MSG="一次只能拉黑20个用户";




}
