package com.yqn.op.log.util;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author ： huayuanlin
 * @date ： 2021/8/8 16:01
 * @desc ： TODO
 */
public class WebUtil {

    private WebUtil() {
        throw new UnsupportedOperationException();
    }

    /**
     * Get the value of the header corresponding to the request
     *
     * @param headerKey headerKey
     * @return header  header value
     */
    public static String getHeader(String headerKey) {
        return getRequest().getHeader(headerKey);
    }



    private static HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) Objects
                .requireNonNull(RequestContextHolder.getRequestAttributes()))
                .getRequest();
    }

}
