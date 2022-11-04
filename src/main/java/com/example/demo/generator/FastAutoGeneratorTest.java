package com.example.demo.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;


public class FastAutoGeneratorTest {

    /**
     * 执行 run
     */
    public static void main(String[] args) {
        // 初始化数据库脚本
        FastAutoGenerator.create(new DataSourceConfig
                        .Builder("jdbc:mysql://127.0.0.1:3306/demo1?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "qweasd"))
                // 全局配置
                .globalConfig((scanner, builder) -> builder.author("zzyi")
                        .outputDir("src\\main\\java")
                        .disableOpenDir()
                        .enableSpringdoc())
                // 包配置
                .packageConfig((scanner, builder) -> builder.parent("com.example.demo"))
                // 策略配置
                .strategyConfig((scanner, builder) -> builder.addInclude(scanner.apply("请输入表名，多个表名用,隔开"))
                        .entityBuilder()
                        .enableLombok())
                /*
                    模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker 或 Enjoy
                   .templateEngine(new BeetlTemplateEngine())
                   .templateEngine(new FreemarkerTemplateEngine())
                   .templateEngine(new EnjoyTemplateEngine())
                 */
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
