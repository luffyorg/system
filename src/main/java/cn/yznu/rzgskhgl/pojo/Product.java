package cn.yznu.rzgskhgl.pojo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import cn.yznu.rzgskhgl.common.BaseEntity;

/**
 * 产品信息表
 * 
 * @author zhangw
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "product")
public class Product extends BaseEntity implements Serializable {
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_product", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private Set<User> users;
	/**
	 * 产品名称
	 */
	private String name;
	/**
	 * �产品编号
	 */
	@Column(name = "product_no")
	private String productNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public Product(String name, String productNo) {
		super();
		this.name = name;
		this.productNo = productNo;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", productNo=" + productNo + "]";
	}

}
