package cn.yznu.rzgskhgl.pojo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import cn.yznu.rzgskhgl.common.BaseEntity;

/**
 * 角色表
 * 
 * @author zhangw
 */
@Entity
@Table(name = "role")
public class Role extends BaseEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "role_name", nullable = false, length = 100)
	private String roleName;// 角色名称
	
	@Column(name = "role_code", length = 10)
	private String roleCode;// 角色编码
	@OneToMany(targetEntity = RoleUser.class, mappedBy = "role")
	@Cascade(CascadeType.SAVE_UPDATE)
	private Set<RoleUser> roleUsers;
	
	@ManyToMany(targetEntity=Group.class)
	@JoinTable(name="role_group",
		joinColumns=@JoinColumn(name="role_id"
			, referencedColumnName="ID"),
		inverseJoinColumns=@JoinColumn(name="group_id"
			, referencedColumnName="ID")
	)
	private Set<Group> groups;

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleCode() {
		return this.roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	
}