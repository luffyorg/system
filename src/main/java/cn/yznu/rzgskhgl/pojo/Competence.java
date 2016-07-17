package cn.yznu.rzgskhgl.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import cn.yznu.rzgskhgl.common.BaseEntity;
/**
 * 权限表
 * @author zhangw
 *
 */
@SuppressWarnings("serial")
@Entity
public class Competence extends BaseEntity implements Serializable{
	/**
	 * 权限名称
	 */
	@Column(length=50)
	private  String title;
	/**
	 * 路径
	 */
	@Column(length=100)
	private String url;
	@ManyToOne(targetEntity=Group.class)
	@JoinColumn(name="group_id" , referencedColumnName="ID"
		, nullable=true)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Group group;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Competence [title=" + title + ", url=" + url + "]";
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	
}
