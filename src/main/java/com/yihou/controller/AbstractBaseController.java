/**
 * 版权所有：恒生电子股份有限公司 保留所有权利
 * 版本： 1.0
 * ******************************************
 * Copyright (c)  by Hundsun ,Ltd.
 * All right reserved.
 * Last version:  1.0
 */
package com.yihou.controller;

import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.util.Date;

/**
 * Description:
 * author yupan@18551
 * date 2016-09-28 09:31
 */
public abstract class AbstractBaseController {

    private static String[] parsePatterns = {
            "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM",
            "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM",
            "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM"};

    protected Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 初始化数据绑定
     * 1. 将字段中Date类型转换为String类型
     *
     * @param binder 数据绑定对象
     */
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
            public void setAsText(String text) {
                if (text == null) {
                    setValue(null);
                }
                try {
                    setValue(DateUtils.parseDate(text, parsePatterns));
                } catch (ParseException e) {
                    setValue(null);
                }
            }
        });
    }

}
