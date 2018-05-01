package main.java.com.helfmxie.ssm.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static Logger logger = LoggerFactory.getLogger(OkController.class);

    @RequestMapping("/ok")
    public String ok(HttpServletRequest request) {
        logger.info("心跳检查合格currentTime[{}],logger[{}]", System.currentTimeMillis(), logger.getName());
        return "ok";
    }

}
