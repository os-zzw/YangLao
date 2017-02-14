package yanglao.vo;


import yanglao.config.Error;

/**
 * A wrapped Json Response
 * Created by jinyong on 2016/12/27.
 */
public class JsonResponse {
    private int code;
    private String msg;
    private Object data;

    public JsonResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResponse(Object data) {
        this.code = Error.SUCCEESS;
        this.msg = Error.SUCCESS_MSG;
        this.data = data;
    }

    public JsonResponse() {
        this.code = Error.PARAM_ERROR;
        this.msg = Error.PARAM_ERROR_MSG;
        this.data = null;
    }

    public JsonResponse(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
