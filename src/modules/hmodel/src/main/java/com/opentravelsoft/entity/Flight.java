package com.opentravelsoft.entity;

// Generated 2012-5-9 8:27:00 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Flight generated by hbm2java
 */
@Entity
@Table(name = "tbl_flight", catalog = "tourismwork_db")
public class Flight implements java.io.Serializable {

	private String recNo;
	private String airCode;
	private String fromCity;
	private String fromAirport;
	private String toCity;
	private String toAirport;
	private String flightNo;
	private String weekbit;
	private String fromTime;
	private String toTime;
	private String nights;
	private Integer stopStation;
	private String airModel;
	private Integer airSeat;
	private Date startDate;
	private Date endDate;
	private Byte isDelete;

	public Flight() {
	}

	public Flight(String recNo, String airCode, String flightNo) {
		this.recNo = recNo;
		this.airCode = airCode;
		this.flightNo = flightNo;
	}

	public Flight(String recNo, String airCode, String fromCity,
			String fromAirport, String toCity, String toAirport,
			String flightNo, String weekbit, String fromTime, String toTime,
			String nights, Integer stopStation, String airModel,
			Integer airSeat, Date startDate, Date endDate, Byte isDelete) {
		this.recNo = recNo;
		this.airCode = airCode;
		this.fromCity = fromCity;
		this.fromAirport = fromAirport;
		this.toCity = toCity;
		this.toAirport = toAirport;
		this.flightNo = flightNo;
		this.weekbit = weekbit;
		this.fromTime = fromTime;
		this.toTime = toTime;
		this.nights = nights;
		this.stopStation = stopStation;
		this.airModel = airModel;
		this.airSeat = airSeat;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isDelete = isDelete;
	}

	@Id
	@Column(name = "REC_NO", unique = true, nullable = false, length = 10)
	public String getRecNo() {
		return this.recNo;
	}

	public void setRecNo(String recNo) {
		this.recNo = recNo;
	}

	@Column(name = "AIR_CODE", nullable = false, length = 2)
	public String getAirCode() {
		return this.airCode;
	}

	public void setAirCode(String airCode) {
		this.airCode = airCode;
	}

	@Column(name = "FROM_CITY", length = 6)
	public String getFromCity() {
		return this.fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	@Column(name = "FROM_AIRPORT", length = 3)
	public String getFromAirport() {
		return this.fromAirport;
	}

	public void setFromAirport(String fromAirport) {
		this.fromAirport = fromAirport;
	}

	@Column(name = "TO_CITY", length = 6)
	public String getToCity() {
		return this.toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	@Column(name = "TO_AIRPORT", length = 3)
	public String getToAirport() {
		return this.toAirport;
	}

	public void setToAirport(String toAirport) {
		this.toAirport = toAirport;
	}

	@Column(name = "FLIGHT_NO", nullable = false, length = 6)
	public String getFlightNo() {
		return this.flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	@Column(name = "WEEKBIT", length = 20)
	public String getWeekbit() {
		return this.weekbit;
	}

	public void setWeekbit(String weekbit) {
		this.weekbit = weekbit;
	}

	@Column(name = "FROM_TIME", length = 12)
	public String getFromTime() {
		return this.fromTime;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	@Column(name = "TO_TIME", length = 12)
	public String getToTime() {
		return this.toTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

	@Column(name = "NIGHTS", length = 12)
	public String getNights() {
		return this.nights;
	}

	public void setNights(String nights) {
		this.nights = nights;
	}

	@Column(name = "STOP_STATION")
	public Integer getStopStation() {
		return this.stopStation;
	}

	public void setStopStation(Integer stopStation) {
		this.stopStation = stopStation;
	}

	@Column(name = "AIR_MODEL", length = 12)
	public String getAirModel() {
		return this.airModel;
	}

	public void setAirModel(String airModel) {
		this.airModel = airModel;
	}

	@Column(name = "AIR_SEAT")
	public Integer getAirSeat() {
		return this.airSeat;
	}

	public void setAirSeat(Integer airSeat) {
		this.airSeat = airSeat;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "START_DATE", length = 19)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "END_DATE", length = 19)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "IS_DELETE")
	public Byte getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Byte isDelete) {
		this.isDelete = isDelete;
	}

}