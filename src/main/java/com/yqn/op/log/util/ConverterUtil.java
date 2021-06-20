/*
 * Copyright 2019-2029 geekidea(https://github.com/geekidea)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yqn.op.log.util;


import com.google.common.base.CaseFormat;

/**
 * @author ： huayuanlin
 * @date ： 2021/5/23 16:59
 * @desc ： Collections util
 */
public class ConverterUtil {

    /**
     * to underline str
     *
     * @param srcStr need convert str
     * @return underline str
     */
    public static String camelToUnderline(String srcStr) {
        return CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.LOWER_UNDERSCORE).convert(srcStr);
    }
}
