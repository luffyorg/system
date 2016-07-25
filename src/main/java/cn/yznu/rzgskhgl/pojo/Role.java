package cn.yznu.rzgskhgl.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

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
	@ManyToMany
	@JoinTable(name = "user_role", joinColumns = { @JoinColumn(name = "role_id") }, inverseJoinColumns = {
			@JoinColumn(name = "user_id") })
	public List<User> users;

	@ManyToMany(targetEntity = Permission.class)
	@JoinTable(name = "role_group", joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "permission_id", referencedColumnName = "ID"))
	private List<Permission> permissions;

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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	@Transient
	public List<String> getPermissionsName() {
		List<String> list = new ArrayList<String>();
		List<Permission> perlist = getPermissions();
		for (Permission per : perlist) {
			list.add(per.getPermissionname());
		}
		return list;
	}
}