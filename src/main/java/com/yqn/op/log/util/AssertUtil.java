package com.yqn.op.log.util;


/**
 * @author huayuanlin
 * @date 2021/06/04 17:48
 * @desc Assert util
 */
public class AssertUtil {

    private AssertUtil() {
        throw new UnsupportedOperationException();
    }

    public static <T> void notNull(T arg, String filedName) {
        if (arg == null) {
            throw new NullPointerException(filedName + "must not null!");
        }
    }



    public static void notNullStr(String str, String filedName) {
        if (StringUtil.isEmpty(str)) {
            throw new NullPointerException( filedName + "must not empty!");
        }
    }

}