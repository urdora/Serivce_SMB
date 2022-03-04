package com.smb.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试入口类
 *
 * @author wangyihang
 * @date 2021/9/29
 */
@Slf4j
@RestController
@RequestMapping("/urdora")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        log.info("日志记录了!");
        return "Hello SpringBoot~, the fastest springframework!";
    }
}
