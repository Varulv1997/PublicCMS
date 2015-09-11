package com.publiccms.entities.cms;

// Generated 2015-7-20 11:26:18 by Hibernate Tools 4.3.1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sanluan.common.source.entity.MyColumn;

/**
 * CmsForm generated by hbm2java
 */
@Entity
@Table(name = "cms_form")
public class CmsForm implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	@MyColumn(title = "标题", condition = true, like = true)
	private String title;
	@MyColumn(title = "数据")
	private String data;
	@MyColumn(title = "标题", condition = true, order = true)
	private Date createDate;
	@MyColumn(title = "禁用", condition = true)
	private boolean disabled;

	public CmsForm() {
	}

	public CmsForm(String title, Date createDate, boolean disabled) {
		this.title = title;
		this.createDate = createDate;
		this.disabled = disabled;
	}

	public CmsForm(String title, String data, Date createDate, boolean disabled) {
		this.title = title;
		this.data = data;
		this.createDate = createDate;
		this.disabled = disabled;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "title", nullable = false, length = 100)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "data", length = 65535)
	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", nullable = false, length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "disabled", nullable = false)
	public boolean isDisabled() {
		return this.disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

}