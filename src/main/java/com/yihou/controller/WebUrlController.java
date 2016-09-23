package com.yihou.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 项目首页URL控制器
 */
@Controller
public class WebUrlController {

    /**
     * 跳转到系统主页
     *
     * @return 系统主页路径
     */
    @RequestMapping(value = {"/", "/;.*"})
    public String index() {
        return "/index";
    }

    @RequestMapping(value = {"/{login:login;?.*}"})
    public String login() {
        //如果用户直接到登录页面 先退出一下
        //原因：isAccessAllowed实现是subject.isAuthenticated()---->即如果用户验证通过 就允许访问
        // 这样会导致登录一直死循环
        Subject subject = SecurityUtils.getSubject();
        if (subject != null && subject.isAuthenticated()) {
            subject.logout();
        }
        return "/login";
    }

}
