package com;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class MybatisPlusCdoerGenerator {

    public static void main(String[] args) {
        String property = System.getProperty("user.dir");
        FastAutoGenerator.create(
                "jdbc:mysql://localhost:3306/aj_smb?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=UTC",
                "root",
                "root")
                .globalConfig(builder -> {
                    builder.author("wangyihang") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
//                            .outputDir("D:/java_work/test_springboot"); // 指定输出目录
                            .outputDir(property + "/out/mybatis-plus"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.baomidou.mybatisplus.samples.generator") // 设置父包名
                            .moduleName("system") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(
                                    OutputFile.mapperXml, property + "/out/mybatis-plus")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("supplier_info") // 设置需要生成的表名
                            .addTablePrefix("aj_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
