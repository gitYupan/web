package com.yihou.entity;

public class ResourceRoleExample {

    private RoleExample roleExample;
    private ResourceExample resourceExample;

    public RoleExample getRoleExample() {
        return roleExample == null ? new RoleExample() : roleExample;
    }

    public void setRoleExample(RoleExample roleExample) {
        this.roleExample = roleExample;
    }

    public ResourceExample getResourceExample() {
        return resourceExample == null ? new ResourceExample() : resourceExample;
    }

    public void setResourceExample(ResourceExample resourceExample) {
        this.resourceExample = resourceExample;
    }

}
