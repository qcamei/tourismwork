package com.opentravelsoft.entity;

// Generated 2012-5-9 8:27:00 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TblVisaItem generated by hbm2java
 */
@Entity
@Table(name = "tbl_visa_item", catalog = "tourismwork_db")
public class TblVisaItem implements java.io.Serializable {

	private Integer visaitemId;
	private String recNo;
	private Integer itemId;
	private String outline;
	private int num;
	private String note;
	private Integer sortOrder;
	private Character del;

	public TblVisaItem() {
	}

	public TblVisaItem(String recNo, int num) {
		this.recNo = recNo;
		this.num = num;
	}

	public TblVisaItem(String recNo, Integer itemId, String outline, int num,
			String note, Integer sortOrder, Character del) {
		this.recNo = recNo;
		this.itemId = itemId;
		this.outline = outline;
		this.num = num;
		this.note = note;
		this.sortOrder = sortOrder;
		this.del = del;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "VISAITEM_ID", unique = true, nullable = false)
	public Integer getVisaitemId() {
		return this.visaitemId;
	}

	public void setVisaitemId(Integer visaitemId) {
		this.visaitemId = visaitemId;
	}

	@Column(name = "REC_NO", nullable = false, length = 10)
	public String getRecNo() {
		return this.recNo;
	}

	public void setRecNo(String recNo) {
		this.recNo = recNo;
	}

	@Column(name = "ITEM_ID")
	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@Column(name = "OUTLINE", length = 50)
	public String getOutline() {
		return this.outline;
	}

	public void setOutline(String outline) {
		this.outline = outline;
	}

	@Column(name = "NUM", nullable = false)
	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Column(name = "NOTE", length = 200)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "SORT_ORDER")
	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	@Column(name = "DEL", length = 1)
	public Character getDel() {
		return this.del;
	}

	public void setDel(Character del) {
		this.del = del;
	}

}