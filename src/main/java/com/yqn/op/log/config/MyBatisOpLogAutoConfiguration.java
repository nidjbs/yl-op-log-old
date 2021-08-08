package com.yqn.op.log.config;

import com.yqn.op.log.core.OpLogInterceptorProcessor;
import com.yqn.op.log.core.mybatis.MybatisOpLogInterceptor;
import com.yqn.op.log.core.mybatis.StandardOpLogInterceptorProcessor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huayuanlin
 * @date 2021/06/19 21:03
 * @desc the class desc
 */
@Configuration
@ConditionalOnClass(SqlSessionTemplate.class)
public class MyBatisOpLogAutoConfiguration {


    @Bean
    public Interceptor mybatisOpLogInterceptor() {
        return new MybatisOpLogInterceptor();
    }

    @Bean
    @ConditionalOnMissingBean
    public OpLogInterceptorProcessor opLogInterceptorProcessor(){
        return new StandardOpLogInterceptorProcessor();
    }

}
