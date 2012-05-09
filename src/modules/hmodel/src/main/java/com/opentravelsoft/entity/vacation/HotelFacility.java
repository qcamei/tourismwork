package com.opentravelsoft.entity.vacation;

// Generated 2012-5-9 8:27:00 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * HotelFacility generated by hbm2java
 */
@Entity
@Table(name = "tbl_hotel_facility", catalog = "tourismwork_db")
public class HotelFacility implements java.io.Serializable {

	private String recNo;
	private String hotCd;
	private String estNo;
	private String cnNote;
	private String enNote;
	private Byte isDelete;
	private String crUser;
	private Date crDate;
	private String opUser;
	private Date opDate;

	public HotelFacility() {
	}

	public HotelFacility(String recNo) {
		this.recNo = recNo;
	}

	public HotelFacility(String recNo, String hotCd, String estNo,
			String cnNote, String enNote, Byte isDelete, String crUser,
			Date crDate, String opUser, Date opDate) {
		this.recNo = recNo;
		this.hotCd = hotCd;
		this.estNo = estNo;
		this.cnNote = cnNote;
		this.enNote = enNote;
		this.isDelete = isDelete;
		this.crUser = crUser;
		this.crDate = crDate;
		this.opUser = opUser;
		this.opDate = opDate;
	}

	@Id
	@Column(name = "REC_NO", unique = true, nullable = false, length = 10)
	public String getRecNo() {
		return this.recNo;
	}

	public void setRecNo(String recNo) {
		this.recNo = recNo;
	}

	@Column(name = "HOT_CD", length = 10)
	public String getHotCd() {
		return this.hotCd;
	}

	public void setHotCd(String hotCd) {
		this.hotCd = hotCd;
	}

	@Column(name = "EST_NO", length = 20)
	public String getEstNo() {
		return this.estNo;
	}

	public void setEstNo(String estNo) {
		this.estNo = estNo;
	}

	@Column(name = "CN_NOTE", length = 100)
	public String getCnNote() {
		return this.cnNote;
	}

	public void setCnNote(String cnNote) {
		this.cnNote = cnNote;
	}

	@Column(name = "EN_NOTE", length = 100)
	public String getEnNote() {
		return this.enNote;
	}

	public void setEnNote(String enNote) {
		this.enNote = enNote;
	}

	@Column(name = "IS_DELETE")
	public Byte getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Byte isDelete) {
		this.isDelete = isDelete;
	}

	@Column(name = "CR_USER", length = 50)
	public String getCrUser() {
		return this.crUser;
	}

	public void setCrUser(String crUser) {
		this.crUser = crUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CR_DATE", length = 19)
	public Date getCrDate() {
		return this.crDate;
	}

	public void setCrDate(Date crDate) {
		this.crDate = crDate;
	}

	@Column(name = "OP_USER", length = 50)
	public String getOpUser() {
		return this.opUser;
	}

	public void setOpUser(String opUser) {
		this.opUser = opUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OP_DATE", length = 19)
	public Date getOpDate() {
		return this.opDate;
	}

	public void setOpDate(Date opDate) {
		this.opDate = opDate;
	}

}