package cn.yznu.rzgskhgl.pojo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import cn.yznu.rzgskhgl.common.BaseEntity;

/**
 * 角色用户表
 * @author zhangw
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "role_user")
public class RoleUser extends BaseEntity implements java.io.Serializable {

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "ID", nullable = false)
	@Cascade(CascadeType.SAVE_UPDATE)
	private User user;
	@ManyToOne
	@JoinColumn(name = "role_id", referencedColumnName = "ID", nullable = false)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Role role;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}