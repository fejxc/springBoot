package cn.zealon.book.system.org.bo;

import java.util.List;

/**
 * @author: tangyl
 * @since: 2020/3/4
 */
public class OrgPermissionBO {

    private Integer id;

    /**
     * 父级id
     */
    private List<String> parentId;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单类型
     */
    private String type;

    /**
     * 资源地址
     */
    private String resourceUrl;

    private String pagePath;

    /**
     * 权限名称
     */
    private String permission;

    /**
     * icon
     */
    private String icon;

    /**
     * 排序
     */
    private Integer sortNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getParentId() {
        return parentId;
    }

    public void setParentId(List<String> parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    public String getPagePath() {
        return pagePath;
    }

    public void setPagePath(String pagePath) {
        this.pagePath = pagePath;
    }
}
