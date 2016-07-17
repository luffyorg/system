package cn.yznu.rzgskhgl.pojo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import cn.yznu.rzgskhgl.common.BaseEntity;
/**
 * 权限组表
 * @author zhangw
 *
 */
@SuppressWarnings("serial")
@Entity
public class Group extends BaseEntity implements Serializable{
	/**
	 * 权限组名称
	 */
	private String title;
	
	@ManyToMany(targetEntity=Role.class)
	@JoinTable(name="role_group",
		joinColumns=@JoinColumn(name="group_id"
			, referencedColumnName="ID"),
		inverseJoinColumns=@JoinColumn(name="role_id"
			, referencedColumnName="ID")
	)
	private Set<Role> roles;
	
	@OneToMany(targetEntity = Competence.class, mappedBy = "group")
	@Cascade(CascadeType.SAVE_UPDATE)
	private Set<Competence> competences;
	
	
	
	
	@Override
	public String toString() {
		return "Group [title=" + title + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Set<Competence> getCompetences() {
		return competences;
	}

	public void setCompetences(Set<Competence> competences) {
		this.competences = competences;
	}
	
}
