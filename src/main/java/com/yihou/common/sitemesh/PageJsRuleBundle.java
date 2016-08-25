package com.yihou.common.sitemesh;

import org.sitemesh.SiteMeshContext;
import org.sitemesh.content.ContentProperty;
import org.sitemesh.content.tagrules.TagRuleBundle;
import org.sitemesh.content.tagrules.html.ExportTagToContentRule;
import org.sitemesh.tagprocessor.State;

/**
 * 自定义的sitemesh3标签,用来将页面js加载到body标签页最下面
 */
public class PageJsRuleBundle implements TagRuleBundle {

    @Override
    public void cleanUp(State defaultState, ContentProperty contentProperty, SiteMeshContext siteMeshContext) {

    }

    @Override
    public void install(State defaultState, ContentProperty contentProperty, SiteMeshContext siteMeshContext) {
        defaultState.addRule("pagejs", new ExportTagToContentRule(siteMeshContext, contentProperty.getChild("pagejs"), false));
    }

}
