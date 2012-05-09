package com.opentravelsoft.entity.vacation;

// Generated 2012-5-9 8:27:00 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * LineHotel generated by hbm2java
 */
@Entity
@Table(name = "tbl_line_hotel", catalog = "tourismwork_db")
public class LineHotel implements java.io.Serializable {

	private LineHotelId id;
	private String recommend;

	public LineHotel() {
	}

	public LineHotel(LineHotelId id) {
		this.id = id;
	}

	public LineHotel(LineHotelId id, String recommend) {
		this.id = id;
		this.recommend = recommend;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "lineNo", column = @Column(name = "LINE_NO", nullable = false, length = 10)),
			@AttributeOverride(name = "hotCd", column = @Column(name = "HOT_CD", nullable = false, length = 10)) })
	public LineHotelId getId() {
		return this.id;
	}

	public void setId(LineHotelId id) {
		this.id = id;
	}

	@Column(name = "RECOMMEND", length = 10)
	public String getRecommend() {
		return this.recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

}