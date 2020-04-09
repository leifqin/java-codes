package rest.api.result;

/**
 * Created by 李恒名 on 2017/6/13.
 * <p>
 * 响应码枚举
 */
public enum ResultCode {
    // 成功
    SUCCESS(200),
    // 失败
    FAIL(400),
    // 未认证（签名错误）
    Unauthorized(401),
    // 接口不存在
    NOT_FOUND(404),
    // 服务器内部错误
    INTERNAL_SERVER_ERROR(500);

    public int code;

    ResultCode(int code) {
        this.code = code;
    }
}
