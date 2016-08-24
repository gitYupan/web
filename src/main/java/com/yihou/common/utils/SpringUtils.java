package com.yihou.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 获取spring bean辅助类
 */
public class SpringUtils implements BeanFactoryPostProcessor {

    private static ConfigurableListableBeanFactory beanFactory; // Spring应用上下文环境

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        SpringUtils.beanFactory = beanFactory;
    }

    /**
     * 根据name获取spring对象
     *
     * @param name bean的name
     * @param <T>  泛型
     * @return 返回bean
     * @throws BeansException bean找不到
     */
    public static <T> T getBean(String name) throws BeansException {
        return (T) beanFactory.getBean(name);
    }

    /**
     * 根据类型获取spring对象
     *
     * @param clz bean的类型
     * @param <T> 泛型
     * @return 返回bean
     * @throws BeansException bean找不到
     */
    public static <T> T getBean(Class<T> clz) throws BeansException {
        T result = (T) beanFactory.getBean(clz);
        return result;
    }

    /**
     * 根据名称判断spring容器中是否存在该bean
     *
     * @param name bean的名称
     * @return boolean 存在返回<code>true</code>,否则返回<code>false</code>
     */
    public static boolean containsBean(String name) {
        return beanFactory.containsBean(name);
    }

    /**
     * 根据名称判断spring容器中的bean是否为单例
     *
     * @param name bean的名称
     * @return boolean 如果为单例返回<code>true</code>,否则返回<code>false</code>
     * @throws NoSuchBeanDefinitionException bean找不到
     */
    public static boolean isSingleton(String name) throws NoSuchBeanDefinitionException {
        return beanFactory.isSingleton(name);
    }

    /**
     * 根据名称放回spring容器中的bean的类型
     *
     * @param name bean的名称
     * @return bean的类型
     * @throws NoSuchBeanDefinitionException bean找不到
     */
    public static Class<?> getType(String name) throws NoSuchBeanDefinitionException {
        return beanFactory.getType(name);
    }

    /**
     * 根据名称获取bean的别名
     *
     * @param name bean的名称
     * @return bean的别名数组
     * @throws NoSuchBeanDefinitionException bean找不到
     */
    public static String[] getAliases(String name) throws NoSuchBeanDefinitionException {
        return beanFactory.getAliases(name);
    }

}
