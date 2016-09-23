/**
 * 版权所有：恒生电子股份有限公司 保留所有权利
 * 版本： 1.0
 * ******************************************
 * Copyright (c)  by Hundsun ,Ltd.
 * All right reserved.
 * Last version:  1.0
 */
package com.yihou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 * author yupan@18551
 * date 2016-09-23 12:33
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/index")
    public String index() {
        return "/demo/index";
    }

}
