package awei.model;

import java.util.Date;

public class User {
    private String id;

    private Date cheatedatetime;

    private Date modifydatetime;

    private String name;

    private String pwd;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCheatedatetime() {
        return cheatedatetime;
    }

    public void setCheatedatetime(Date cheatedatetime) {
        this.cheatedatetime = cheatedatetime;
    }

    public Date getModifydatetime() {
        return modifydatetime;
    }

    public void setModifydatetime(Date modifydatetime) {
        this.modifydatetime = modifydatetime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", cheatedatetime=" + cheatedatetime + ", modifydatetime=" + modifydatetime + ", name=" + name + ", pwd=" + pwd + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
    
    
}