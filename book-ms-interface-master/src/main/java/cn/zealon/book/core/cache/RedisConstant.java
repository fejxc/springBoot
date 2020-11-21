package cn.zealon.book.core.cache;

/**
 * Redis 常量
 */
public class RedisConstant {

    /**
     * 缓存有效时间(单位：秒)
     */
    public static final class Expire {
        // 1分钟
        public static final long MINUTE = 60;
        // 2分钟 60*2
        public static final long MINUTE_TWO = 120;
        // 3分钟 60*3
        public static final long MINUTE_THR = 180;
        // 5分钟 60*5
        public static final long MINUTE_FIV = 300;
        // 10分钟 60*10
        public static final long MINUTE_TEN = 600;
        // 20分钟
        public static final long MINUTE_TWENTY = 1200;
        // 30分钟 60*30
        public static final long MINUTE_THIRTY = 1800;
        // 1小时 60*60*1
        public static final long HOUR = 3600;
        // 2小时  60*60*2
        public static final long HOUR_TWO = 7200;
        // 4小时
        public static final long HOUR_FOUR = 14400;
        // 1天 60*60*24
        public static final long DAY = 86400;
        // 2天 60*60*24*2
        public static final long DAY_TWO = 172800;
        // 1周 60*60*24*7
        public static final long WEEK = 604800;
        // 1月 60*60*24*30
        public static final long MONTH = 2592000;
        // 1年 60*60*24*365
        public static final long YEAR = 31536000;
    }

    /**
     * 字典缓存Key
     */
    public static final class Dictionary{
        private static final String DICTIONARY_LIST = "dictionary:%s";
        public static final String getDictionaryList(String type){
            return String.format(DICTIONARY_LIST,type);
        }

        private static final String DICTIONARY_TYPE_CODE = "dictionary:type_%s_code_%s";
        public static final String getDictionaryTypeCode(String type,Integer code){
            return String.format(DICTIONARY_TYPE_CODE,type,code);
        }
    }

    /**
     * 用户缓存Key
     */
    public static final class User{
        private static final String USER_VO = "user:vo_%s";
        public static final String getUserVo(String userId){
            return String.format(USER_VO,userId);
        }

        private static final String USER_HEAD = "user:head_attachment_%s";
        public static final String getUserHead(Integer uid){
            return String.format(USER_HEAD,uid);
        }
    }

}
