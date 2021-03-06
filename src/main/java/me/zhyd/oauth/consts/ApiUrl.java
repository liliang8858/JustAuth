package me.zhyd.oauth.consts;

import me.zhyd.oauth.exception.AuthException;
import me.zhyd.oauth.request.ResponseStatus;

/**
 * 各api需要的url， 用枚举类分平台类型管理
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2019/2/24 21:20
 * @since 1.0
 */
public enum ApiUrl {
    /**
     * Github
     */
    GITHUB {
        @Override
        public String authorize() {
            return "https://github.com/login/oauth/authorize";
        }

        @Override
        public String accessToken() {
            return "https://github.com/login/oauth/access_token";
        }

        @Override
        public String userInfo() {
            return "https://api.github.com/user";
        }

        @Override
        public String revoke() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }

        @Override
        public String refresh() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }
    },
    /**
     * 新浪微博
     */
    WEIBO {
        @Override
        public String authorize() {
            return "https://api.weibo.com/oauth2/authorize";
        }

        @Override
        public String accessToken() {
            return "https://api.weibo.com/oauth2/access_token";
        }

        @Override
        public String userInfo() {
            return "https://api.weibo.com/2/users/show.json";
        }

        @Override
        public String revoke() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }

        @Override
        public String refresh() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }
    },
    /**
     * gitee
     */
    GITEE {
        @Override
        public String authorize() {
            return "https://gitee.com/oauth/authorize";
        }

        @Override
        public String accessToken() {
            return "https://gitee.com/oauth/token";
        }

        @Override
        public String userInfo() {
            return "https://gitee.com/api/v5/user";
        }

        @Override
        public String revoke() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }

        @Override
        public String refresh() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }
    },
    /**
     * 钉钉
     */
    DINGTALK {
        @Override
        public String authorize() {
            return "https://oapi.dingtalk.com/connect/qrconnect";
        }

        @Override
        public String accessToken() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }

        @Override
        public String userInfo() {
            return "https://oapi.dingtalk.com/sns/getuserinfo_bycode";
        }

        @Override
        public String revoke() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }

        @Override
        public String refresh() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }
    },
    /**
     * 百度
     */
    BAIDU {
        @Override
        public String authorize() {
            return "https://openapi.baidu.com/oauth/2.0/authorize";
        }

        @Override
        public String accessToken() {
            return "https://openapi.baidu.com/oauth/2.0/token";
        }

        @Override
        public String userInfo() {
            return "https://openapi.baidu.com/rest/2.0/passport/users/getInfo";
        }

        @Override
        public String revoke() {
            return "https://openapi.baidu.com/rest/2.0/passport/auth/revokeAuthorization";
        }

        @Override
        public String refresh() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }
    },
    /**
     * csdn
     */
    CSDN {
        @Override
        public String authorize() {
            return "https://api.csdn.net/oauth2/authorize";
        }

        @Override
        public String accessToken() {
            return "https://api.csdn.net/oauth2/access_token";
        }

        @Override
        public String userInfo() {
            return "https://api.csdn.net/user/getinfo";
        }

        @Override
        public String revoke() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }

        @Override
        public String refresh() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }
    },
    /**
     * Coding
     */
    CODING {
        @Override
        public String authorize() {
            return "https://coding.net/oauth_authorize.html";
        }

        @Override
        public String accessToken() {
            return "https://coding.net/api/oauth/access_token";
        }

        @Override
        public String userInfo() {
            return "https://coding.net/api/account/current_user";
        }

        @Override
        public String revoke() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }

        @Override
        public String refresh() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }
    },
    /**
     * 腾讯云开发者平台（coding升级后就变成腾讯云开发者平台了）
     */
    TENCENTCLOUD {
        @Override
        public String authorize() {
            return "https://dev.tencent.com/oauth_authorize.html";
        }

        @Override
        public String accessToken() {
            return "https://dev.tencent.com/api/oauth/access_token";
        }

        @Override
        public String userInfo() {
            return "https://dev.tencent.com/api/account/current_user";
        }

        @Override
        public String revoke() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }

        @Override
        public String refresh() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }
    },
    /**
     * oschina 开源中国
     */
    OSCHINA {
        @Override
        public String authorize() {
            return "https://www.oschina.net/action/oauth2/authorize";
        }

        @Override
        public String accessToken() {
            return "https://www.oschina.net/action/openapi/token";
        }

        @Override
        public String userInfo() {
            return "https://www.oschina.net/action/openapi/user";
        }

        @Override
        public String revoke() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }

        @Override
        public String refresh() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }
    },
    /**
     * 支付宝
     */
    ALIPAY {
        @Override
        public String authorize() {
            return "https://openauth.alipay.com/oauth2/publicAppAuthorize.htm";
        }

        @Override
        public String accessToken() {
            return "https://openapi.alipay.com/gateway.do";
        }

        @Override
        public String userInfo() {
            return "https://openapi.alipay.com/gateway.do";
        }

        @Override
        public String revoke() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }

        @Override
        public String refresh() {
            throw new AuthException(ResponseStatus.UNSUPPORTED);
        }
    };

    public abstract String authorize();

    public abstract String accessToken();

    public abstract String userInfo();

    public abstract String revoke();

    public abstract String refresh();

}
