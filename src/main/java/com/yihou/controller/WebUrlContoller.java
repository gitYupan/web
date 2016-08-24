package com.yihou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 项目首页URL控制器
 */
@Controller
public class WebUrlContoller {

    /**
     * 跳转到系统主页
     *
     * @return 系统主页路径
     */
    @RequestMapping(value = {"/", "/;.*"})
    public String index() {
        return "/index";
    }

}
