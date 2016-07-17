package cn.yznu.rzgskhgl.common;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@SuppressWarnings("serial")
@MappedSuperclass
public class BaseEntity implements Serializable {
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(nullable = false, length = 36)
	String ID;

	/** 创建时间 */
	@Column(name = "create_date", nullable = true)
	private java.util.Date createDate;

	/** 创建人ID */
	@Column(name = "create_by", nullable = true, length = 32)
	private java.lang.String createBy;

	/** 创建人名称 */
	@Column(name = "create_name", nullable = true, length = 32)
	private java.lang.String createName;

	/** 修改时间 */
	@Column(name = "update_date", nullable = true)
	private java.util.Date updateDate;

	/** 修改人 */
	@Column(name = "update_by", nullable = true, length = 32)
	private java.lang.String updateBy;

	/** 修改人名称 */
	@Column(name = "update_name", nullable = true, length = 32)
	private java.lang.String updateName;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public java.util.Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}

	public java.lang.String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(java.lang.String createBy) {
		this.createBy = createBy;
	}

	public java.lang.String getCreateName() {
		return createName;
	}

	public void setCreateName(java.lang.String createName) {
		this.createName = createName;
	}

	public java.util.Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(java.util.Date updateDate) {
		this.updateDate = updateDate;
	}

	public java.lang.String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(java.lang.String updateBy) {
		this.updateBy = updateBy;
	}

	public java.lang.String getUpdateName() {
		return updateName;
	}

	public void setUpdateName(java.lang.String updateName) {
		this.updateName = updateName;
	}
	
}
