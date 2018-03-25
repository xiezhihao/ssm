package com.helfmxie.ssm.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 用于健康检查
 *
 * @author ganlv
 * @date 1/3/17
 */
@RestController
public class OkController {

    @RequestMapping("/ok")
    public String ok(HttpServletRequest request) {
        return "ok";
    }

}
