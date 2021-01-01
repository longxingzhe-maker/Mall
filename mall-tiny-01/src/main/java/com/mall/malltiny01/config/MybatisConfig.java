package com.mall.malltiny01.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 陈龙
 * @date 2021-01-01  16:09
 */
@Configuration
@MapperScan( "com.mall.malltiny01.mbg.mapper" )
public class MybatisConfig {


}
